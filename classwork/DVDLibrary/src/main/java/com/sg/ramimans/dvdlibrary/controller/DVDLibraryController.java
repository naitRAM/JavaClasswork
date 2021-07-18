package com.sg.ramimans.dvdlibrary.controller;

import com.sg.ramimans.dvdlibrary.dao.DVDLibraryDao;
import com.sg.ramimans.dvdlibrary.dao.DVDLibraryDaoFileImpl;
import com.sg.ramimans.dvdlibrary.dto.DVD;
import com.sg.ramimans.dvdlibrary.ui.DVDLibraryView;
import java.util.Set;

/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: Jul. 16, 2021
 * purpose: 
 */
public class DVDLibraryController {
    
    DVDLibraryView view = new DVDLibraryView();
    DVDLibraryDao dao = new DVDLibraryDaoFileImpl();
    
    public void run() {
        boolean keepUsing = true;
        while (keepUsing) {
            view.displayMainMenu();
            int userChoice = view.getMainMenuChoice();
            switch (userChoice) {
                
                case 1:
                    String titleToAdd = view.getNewTitle();
                    boolean cannotAdd = dao.getAllDVDTitles().contains(titleToAdd);
                    if (cannotAdd) {
                        view.displayAlreadyExists(titleToAdd);
                    } else {
                        DVD userDVD = view.getNewData(titleToAdd);
                        dao.addDVD(userDVD.getTitle(), userDVD);
                    }
                    break;
                    
                case 2: 
                    Set<String> titlesBegins = dao.getAllDVDTitles();
                    if (titlesBegins.isEmpty()) {
                        view.displayEmptyLibrary();
                    } else {
                        String titleToEdit = view.getDVDTitleToEdit();
                        boolean validEdit = dao.getAllDVDTitles().contains(titleToEdit);
                        if (validEdit) {
                            DVD oldDVD = dao.getDVD(titleToEdit);
                            view.displayDVD(oldDVD);
                            DVD editedDVD = view.getEditData(titleToEdit);
                            dao.editDVD(titleToEdit, editedDVD);
                        } else {
                            view.displayNonExistent(titleToEdit);
                        }
                    }
                    break;
                    
                case 3: 
                    Set<String> titles = dao.getAllDVDTitles();
                    if (titles.isEmpty()) {
                        view.displayEmptyLibrary();
                    } else {
                        String titleToDelete = view.getDVDTitleToDelete();
                        boolean validDelete = dao.getAllDVDTitles().contains(titleToDelete);
                        if (validDelete) {
                            dao.removeDVD(titleToDelete);
                        } else {
                            view.displayNonExistent(titleToDelete);
                        }
                    }
                    break;
                    
                case 4: 
                    Set<String> titlesAgain = dao.getAllDVDTitles();
                    if (titlesAgain.isEmpty()) {
                        view.displayEmptyLibrary();
                    } else {
                        String query = view.getUserSearch();
                        boolean exists = titlesAgain.contains(query);
                        if (exists) {
                            view.displayAlreadyExists(query);
                        } else {
                            view.displayNonExistent(query);
                        }
                    }
                    break;
                    
                case 5:
                    Set<String> titlesFinally = dao.getAllDVDTitles();
                    if (titlesFinally.isEmpty()) {
                        view.displayEmptyLibrary();
                    } else {
                        String titleToDisplay = view.getDVDTitleToDisplay();
                        boolean titleExists = dao.getAllDVDTitles().contains(titleToDisplay);
                        if (titleExists) {
                            view.displayDVD(dao.getDVD(titleToDisplay));
                        } else {
                            view.displayNonExistent(titleToDisplay);
                        }
                    }
                    break;
                    
                case 6:
                    if (dao.getAllDVDTitles().isEmpty()) {
                        view.displayEmptyLibrary();
                    } else {
                        view.displayAllDVDTitles(dao.getAllDVDTitles());
                    }
                    break;
                    
                case 7:
                    keepUsing = false;
                    
            }
        }
        view.displayExitMessage();
    }
}
