package com.sg.ramimans.dvdlibrary.controller;

import com.sg.ramimans.dvdlibrary.dao.DVDLibraryDao;
import com.sg.ramimans.dvdlibrary.dao.DVDLibraryDaoException;
import com.sg.ramimans.dvdlibrary.dto.DVD;
import com.sg.ramimans.dvdlibrary.ui.DVDLibraryView;

/**
 *
 * @author Rami Mansieh email: rmansieh@gmail.com data: Jul. 16, 2021 purpose:
 */
public class DVDLibraryController {

    private DVDLibraryView view;
    private DVDLibraryDao dao;

    public DVDLibraryController(DVDLibraryDao dao, DVDLibraryView view) {
        this.dao = dao;
        this.view = view;
    }

    public void run() { 
        try {
            boolean keepUsing = true;
            while (keepUsing) {
                view.displayMainMenu();
                int userChoice = view.getMainMenuChoice();
                switch (userChoice) {

                    case 1:
                        addDVD();
                        break;

                    case 2:
                        editDVD();
                        break;

                    case 3:
                        deleteDVD();
                        break;

                    case 4:
                        searchForDVD();
                        break;

                    case 5:
                        displayDVDInfo();
                        break;

                    case 6:
                        displayAllTitles();
                        break;
                    case 7:
                        keepUsing = false;

                }
            }
            view.displayExitMessage();
        } catch (DVDLibraryDaoException e) {
            view.displayErrorMessage(e.getMessage());
        }
    }

    private void addDVD() throws DVDLibraryDaoException{
        
        String titleToAdd = view.getNewTitle();
        if (dao.libraryHas(titleToAdd)) {
            view.displayAlreadyExists(titleToAdd);
        } else {
            DVD userDVD = view.getNewData(titleToAdd);
            dao.addDVD(userDVD.getTitle(), userDVD);
            view.displayAddSuccess(titleToAdd);
        }
    }

    private void editDVD() throws DVDLibraryDaoException{
        if (dao.emptyLibrary()) {
            view.displayEmptyLibrary();
        } else {
            String titleToEdit = view.getDVDTitleToEdit();

            if (dao.libraryHas(titleToEdit)) {
                DVD oldDVD = dao.getDVD(titleToEdit);
                view.displayDVD(oldDVD);
                DVD editedDVD = view.getNewData(titleToEdit);
                dao.editDVD(titleToEdit, editedDVD);
                view.displayEditSuccess(titleToEdit);
            } else {
                view.displayNonExistent(titleToEdit);
            }
        }
    }

    private void deleteDVD() throws DVDLibraryDaoException{
        if (dao.emptyLibrary()) {
            view.displayEmptyLibrary();
        } else {
            String titleToDelete = view.getDVDTitleToDelete();

            if (dao.libraryHas(titleToDelete)) {
                dao.removeDVD(titleToDelete);
                view.displayDeleteSuccess(titleToDelete);
            } else {
                view.displayNonExistent(titleToDelete);
            }
        }
    }

    private void searchForDVD() throws DVDLibraryDaoException {
        if (dao.emptyLibrary()) {
            view.displayEmptyLibrary();
        } else {
            String query = view.getUserSearch();
            if (dao.libraryHas(query)) {
                view.displayAlreadyExists(query);
            } else {
                view.displayNonExistent(query);
            }
        }
    }

    private void displayDVDInfo() throws DVDLibraryDaoException {
        if (dao.emptyLibrary()) {
            view.displayEmptyLibrary();
        } else {
            String titleToDisplay = view.getDVDTitleToDisplay();
            if (dao.libraryHas(titleToDisplay)) {
                DVD dvdToDisplay = dao.getDVD(titleToDisplay);
                view.displayDVD(dvdToDisplay);
            } else {
                view.displayNonExistent(titleToDisplay);
            }
        }
    }

    private void displayAllTitles() throws DVDLibraryDaoException {
        if (dao.emptyLibrary()) {
            view.displayEmptyLibrary();
        } else {
            view.displayAllDVDTitles(dao.getAllDVDTitles());
        }
    }

}
