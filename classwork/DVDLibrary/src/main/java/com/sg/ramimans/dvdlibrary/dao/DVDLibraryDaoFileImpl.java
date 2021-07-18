package com.sg.ramimans.dvdlibrary.dao;

import com.sg.ramimans.dvdlibrary.dto.DVD;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

    
    @Override
    public DVD addDVD(String title, DVD DVD) {
        return library.put(title, DVD);
    }

    @Override
    public DVD getDVD(String title) {
        return library.get(title);
    }

    @Override
    public DVD removeDVD(String title) {
        return library.remove(title);
    }

    @Override
    public DVD editDVD(String title, DVD DVD) {
        DVD toEdit = library.get(title);
        toEdit.setReleaseDate(DVD.getReleaseDate());
        toEdit.setMPAArating(DVD.getMPAArating());
        toEdit.setDirectorName(DVD.getDirectorName());
        toEdit.setStudio(DVD.getStudio());
        toEdit.setUserRating(DVD.getUserRating());
        return toEdit;
    }
    
    @Override
    public Set<String> getAllDVDTitles() {
        return library.keySet();
    }
    
}
