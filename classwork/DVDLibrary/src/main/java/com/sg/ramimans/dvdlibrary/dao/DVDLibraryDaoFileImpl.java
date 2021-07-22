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
 * purpose: demonstrate a specific interface implementation of model in MVC
 */
public class DVDLibraryDaoFileImpl implements DVDLibraryDao {
    
    // in-memory object that holds all DVD values with titles as keys
    private Map<String, DVD> library = new HashMap<>();
    
    // read and write to this file
    public static final String LIBRARY_FILE = "library.txt";
    
    // use "::" to separate fields in each file record
    public static final String DELIMITER = "::";
    
    @Override
    // add a new DVD record to the file
    public DVD addDVD(String title, DVD DVD) throws DVDLibraryDaoException {
        loadLibrary();
        DVD newDVD = library.put(title, DVD);
        writeDVDs();
        return newDVD;
    }

    @Override
    // get a DVD object from a file record
    public DVD getDVD(String title) throws DVDLibraryDaoException {
        loadLibrary();
        DVD retrieved = library.get(title);
        return retrieved;
    }

    @Override
    // remove a DVD record from file
    public DVD removeDVD(String title)  throws DVDLibraryDaoException {
        loadLibrary();
        DVD deleted = library.remove(title);
        writeDVDs();
        return deleted;
    }

    @Override
    // edit fields of a DVD and update the file record
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
    // get a collection of all DVD titles from file records
    public Set<String> getAllDVDTitles() throws DVDLibraryDaoException {
        loadLibrary();
        return library.keySet();
    }
    
    @Override
    // check if file contains a certain DVD record by title
    public boolean libraryHas(String title) throws DVDLibraryDaoException {
        loadLibrary();
        return this.library.containsKey(title);
    }
    
    @Override
    // check if the file is void of DVD records
    public boolean emptyLibrary() throws DVDLibraryDaoException {
        loadLibrary();
        return this.library.isEmpty();
    }
    
    // convert a DVD file record to a DVD data transfer object
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
    
    // get all DVD records from file, convert to DVD objects, store in in-memory library
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
    
    // convert an individual DVD object to it's corresponding file record
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
    
    // get all DVD objects from in-memory library, convert to records, write to file
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
