/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolproject;

import java.sql.Date;

/**
 *
 * @author HP
 */
public class Teacher extends Person{
    
    public Teacher(String ID, String name, Date dob, int grade, String sclass, String email, String password, String street, String zipCode, String city, String state) {
        super(ID, name, dob, grade, sclass, email, password, street, zipCode, city, state);
    }
    
}
