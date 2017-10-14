package org.thecodevillage.common;

/**
 * Created by Stankoech on 10/14/2017.
 */
public class Students {
    int id;
    String reg_no;

    public Students() {
    }

    public Students(int id, String reg_no) {
        this.id = id;
        this.reg_no = reg_no;
    }

    public int getId() {
        return id;
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
