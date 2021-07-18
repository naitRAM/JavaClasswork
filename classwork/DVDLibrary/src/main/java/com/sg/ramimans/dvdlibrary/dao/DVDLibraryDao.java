/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.ramimans.dvdlibrary.dao;
import com.sg.ramimans.dvdlibrary.dto.DVD;
import java.util.Set;
/**
 *
 * @author rmans
 */
public interface DVDLibraryDao {
    
    DVD addDVD(String title, DVD DVD);
    
    DVD getDVD(String title);
    
    DVD removeDVD(String title);
    
    DVD editDVD(String title, DVD DVD);
    
    Set<String> getAllDVDTitles();
    
}
