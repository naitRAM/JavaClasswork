package com.sg.ramimans.dvdlibrary.dao;

import com.sg.ramimans.dvdlibrary.dto.DVD;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: Jul. 16, 2021
 * purpose: 
 */
public class DVDLibraryDaoFileImpl implements DVDLibraryDao {
    
    private Map<String, DVD> library = new HashMap<>();
    public static final String LIBRARY_FILE = "library.txt";
    public static final String DELIMITER = "::";
    
    @Override
    public DVD addDVD(String title, DVD DVD) throws DVDLibraryDaoException {
        loadLibrary();
        DVD newDVD = library.put(title, DVD);
        writeDVDs();
        return newDVD;
    }

    @Override
    public DVD getDVD(String title) throws DVDLibraryDaoException {
        loadLibrary();
        DVD retrieved = library.get(title);
        return retrieved;
    }

    @Override
    public DVD removeDVD(String title)  throws DVDLibraryDaoException {
        loadLibrary();
        DVD deleted = library.remove(title);
        writeDVDs();
        return deleted;
    }

    @Override
    public DVD editDVD(String title, DVD DVD) throws DVDLibraryDaoException {
        loadLibrary();
        DVD toEdit = library.get(title);
        toEdit.setReleaseDate(DVD.getReleaseDate());
        toEdit.setMPAArating(DVD.getMPAArating());
        toEdit.setDirectorName(DVD.getDirectorName());
        toEdit.setStudio(DVD.getStudio());
        toEdit.setUserRating(DVD.getUserRating());
        writeDVDs();
        return toEdit;
    }
    
    @Override
    public Set<String> getAllDVDTitles() throws DVDLibraryDaoException {
        loadLibrary();
        return library.keySet();
    }
    
    @Override
    public boolean libraryHas(String title) throws DVDLibraryDaoException {
        loadLibrary();
        return this.library.containsKey(title);
    }
    
    @Override
    public boolean emptyLibrary() throws DVDLibraryDaoException {
        loadLibrary();
        return this.library.isEmpty();
    }
    
    private DVD unmarshallDVD (String DVDText) {
        String[] tokens = DVDText.split(DELIMITER);
        DVD fromFile = new DVD(tokens[0]);
        fromFile.setReleaseDate(tokens[1]);
        fromFile.setMPAArating(tokens[2]);
        fromFile.setDirectorName(tokens[3]);
        fromFile.setStudio(tokens[4]);
        fromFile.setUserRating(tokens[5]);
        return fromFile;
    }
    
    private void loadLibrary() throws DVDLibraryDaoException {
        Scanner fileInput;
        try {
            fileInput = new Scanner(new BufferedReader(new FileReader(LIBRARY_FILE)));
        } catch (FileNotFoundException e) {
            throw new DVDLibraryDaoException("Could not load DVD library into memory", e);
        }
        String record;
        DVD fromRecord;
        while (fileInput.hasNextLine()) {
            record = fileInput.nextLine();
            fromRecord = unmarshallDVD(record);
            library.put(fromRecord.getTitle(), fromRecord);
        }
        fileInput.close();
    }
    
    private String marshallDVD (DVD toRecord) throws DVDLibraryDaoException {
        
        String record = "";
        String[] recordList = {toRecord.getTitle(), toRecord.getReleaseDate(), 
            toRecord.getMPAArating(), toRecord.getDirectorName(), 
            toRecord.getStudio(), toRecord.getUserRating()};
        for (int i = 0; i < recordList.length; i++) {
            record += recordList[i];
            if (i < recordList.length - 1) {
                record += DELIMITER;
            }
        }
        return record;
    }
    
    private void writeDVDs() throws DVDLibraryDaoException {
        PrintWriter fileOutput;
        try {
            fileOutput = new PrintWriter(new FileWriter(LIBRARY_FILE));
        } catch (IOException e) {
            throw new DVDLibraryDaoException("Could not save DVD data", e);
        }
        String record;
        Set<String> titleList = getAllDVDTitles();
        for (String title : titleList) {
            record = marshallDVD(library.get(title));
            fileOutput.println(record);
            fileOutput.flush();
        }
        fileOutput.close();
    }
    
    
} 
