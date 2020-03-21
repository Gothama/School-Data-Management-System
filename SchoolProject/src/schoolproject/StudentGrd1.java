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
public class StudentGrd1 extends Person {
    private int mSinhala, mMaths, mEnglish, mHistory;
    private String parentName;


    public StudentGrd1(String ID, String name, Date dob, int grade, String sclass, String email, String password, String street, String zipCode, String city, String state, String parentName) {
        super(ID, name, dob, grade, sclass, email, password, street, zipCode, city, state);
        this.parentName = parentName;
    }
    
public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }
    public int getmSinhala() {
        return mSinhala;
    }

    public void setmSinhala(int mSinhala) {
        this.mSinhala = mSinhala;
    }

    public int getmMaths() {
        return mMaths;
    }

    public void setmMaths(int mMaths) {
        this.mMaths = mMaths;
    }

    public int getmEnglish() {
        return mEnglish;
    }

    public void setmEnglish(int mEnglish) {
        this.mEnglish = mEnglish;
    }

    public int getmHistory() {
        return mHistory;
    }

    public void setmHistory(int mHistory) {
        this.mHistory = mHistory;
    }
    
}
