package com.sg.ramimans.classroster.service;

import com.sg.ramimans.classroster.dao.ClassRosterAuditDao;
import com.sg.ramimans.classroster.dao.ClassRosterPersistenceException;

/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: Aug. 9, 2021
 * purpose: 
 */
public class ClassRosterAuditDaoStubImpl implements ClassRosterAuditDao{
    
    @Override
    public void writeAuditEntry(String entry) throws ClassRosterPersistenceException{
        
    }
}
