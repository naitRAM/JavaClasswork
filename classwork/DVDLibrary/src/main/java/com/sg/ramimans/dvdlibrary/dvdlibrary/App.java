package com.sg.ramimans.dvdlibrary.dvdlibrary;

import com.sg.ramimans.dvdlibrary.controller.DVDLibraryController;
import com.sg.ramimans.dvdlibrary.dao.DVDLibraryDao;
import com.sg.ramimans.dvdlibrary.dao.DVDLibraryDaoFileImpl;
import com.sg.ramimans.dvdlibrary.ui.DVDLibraryView;
import com.sg.ramimans.dvdlibrary.ui.UserIO;
import com.sg.ramimans.dvdlibrary.ui.UserIOConsoleImpl;

/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: Jul. 16, 2021
 * purpose: demonstrate use of JAVA OOP concepts in an MVC application
 */
public class App {
    
    public static void main (String[] args) {
        DVDLibraryDao dao = new DVDLibraryDaoFileImpl();
        UserIO io = new UserIOConsoleImpl();
        DVDLibraryView view = new DVDLibraryView(io);
        DVDLibraryController controller = new DVDLibraryController(dao, view);
        controller.run();
    }
}
