package com.sg.ramimans.classroster.classroster;
import com.sg.ramimans.classroster.controller.ClassRosterController;
import com.sg.ramimans.classroster.dao.ClassRosterAuditDao;
import com.sg.ramimans.classroster.dao.ClassRosterAuditDaoFileImpl;
import com.sg.ramimans.classroster.dao.ClassRosterDaoFileImpl;
import com.sg.ramimans.classroster.dao.classRosterDao;
import com.sg.ramimans.classroster.service.ClassRosterServiceLayer;
import com.sg.ramimans.classroster.service.ClassRosterServiceLayerImpl;
import com.sg.ramimans.classroster.ui.ClassRosterView;
import com.sg.ramimans.classroster.ui.UserIO;
import com.sg.ramimans.classroster.ui.UserIOConsoleImpl;

/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: Jul. 13, 2021
 * purpose: 
 */
public class App {
    public static void main(String[] args) {
        UserIO myIO = new UserIOConsoleImpl();
        ClassRosterView myView = new ClassRosterView(myIO);
        classRosterDao myDao = new ClassRosterDaoFileImpl();
        ClassRosterAuditDao myAuditDao = new ClassRosterAuditDaoFileImpl();
        ClassRosterServiceLayer myService = new ClassRosterServiceLayerImpl(myDao, myAuditDao);
        ClassRosterController controller = new ClassRosterController(myService, myView);
        controller.run();
    }
    
}
