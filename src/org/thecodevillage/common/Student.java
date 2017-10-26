package org.thecodevillage.common;

import java.util.Date;

/**
 * Created by Stankoech on 10/14/2017.
 */
public class Student {
    int id;
    String reg_no;
    String name;
    String registrationNumber;
    String grade;
    int javaMarks;
    int phpMarks;
    int pythonMarks;
    String dateofbirth;
    String faculty;
    int feeBalance;
    int fee;

    public Student() {
    }

    public Student(int id, String reg_no) {
        this.id = id;
        this.reg_no = reg_no;
    }

    public Student(int id, String reg_no, String name, String registrationNumber, String grade, int javaMarks, int phpMarks, int pythonMarks, String dateofbirth, String faculty, int feeBalance) {
        this.id = id;
        this.reg_no = reg_no;
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.grade = grade;
        this.javaMarks = javaMarks;
        this.phpMarks = phpMarks;
        this.pythonMarks = pythonMarks;
        this.dateofbirth = dateofbirth;
        this.faculty = faculty;
        this.feeBalance = feeBalance;
    }

    public Student(int fee) {
        this.fee = fee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getJavaMarks() {
        return javaMarks;
    }

    public void setJavaMarks(int javaMarks) {
        this.javaMarks = javaMarks;
    }

    public int getPhpMarks() {
        return phpMarks;
    }

    public void setPhpMarks(int phpMarks) {
        this.phpMarks = phpMarks;
    }

    public int getPythonMarks() {
        return pythonMarks;
    }

    public void setPythonMarks(int pythonMarks) {
        this.pythonMarks = pythonMarks;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getFeeBalance() {
        return feeBalance;
    }

    public void setFeeBalance(int feeBalance) {
        this.feeBalance = feeBalance;
    }

    public int getId() {
        return id;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReg_no() {
        return reg_no;
    }

    public void setReg_no(String reg_no) {
        this.reg_no = reg_no;
    }


}
