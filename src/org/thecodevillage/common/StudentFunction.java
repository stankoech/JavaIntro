package org.thecodevillage.common;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Stankoech on 10/19/2017.
 */
public class StudentFunction {

    public static String calculateGrade(int average) {
        if (average > 80 && average <=100)
                return "A";
        else if (average>60 && average<=80)
            return "B";
        else if (average>40 && average<=60)
            return "C";
        else
        return "D";
    }

    //Funtion to insert to db
    public static boolean insertStudents(Student insertdb){
        String sql="insert into tbl_students(name, grade, dob, faculty, feebalance, fee, phpmarks, pythonmarks, javamarks, registrationNumber) VALUES (?, ?, ?,?,?,?,?,?,?,?)";
        Connection con=null;
        PreparedStatement preparedStatement=null;
        try {
            con=getDbConnection("jdbc:mysql://localhost:3306/students","root","");
            preparedStatement=con.prepareStatement(sql);
            preparedStatement.setString(1,insertdb.getName());
            preparedStatement.setString(2,insertdb.getGrade());
            preparedStatement.setString(3,insertdb.getDateofbirth());
            preparedStatement.setString(4,insertdb.getFaculty());
            preparedStatement.setInt(5,insertdb.getFeeBalance());
            preparedStatement.setInt(6,insertdb.getFee());
            preparedStatement.setInt(7,insertdb.getPhpMarks());
            preparedStatement.setInt(8,insertdb.getPythonMarks());
            preparedStatement.setInt(9,insertdb.getJavaMarks());
            preparedStatement.setString(10,insertdb.getRegistrationNumber());

            int result=preparedStatement.executeUpdate();

            if (result==1)
                return true;
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    //Function to insert list of students
    public static List<Student> listOfStudents(List<Student> studentsList) {
        List<Student> listOfStudents=new ArrayList<>();
        String sql="Select * from tbl_students";
        Connection con=null;
        PreparedStatement preparedStatement=null;
        try {
            con=getDbConnection("jdbc:mysql://localhost:3306/students","root","");
            preparedStatement=con.prepareStatement(sql);
            ResultSet res=preparedStatement.executeQuery();
            while (res.next()){
//                System.out.println(res.getString("name"));
//                System.out.println(res.getString("grade"));
                Student newstudent=new Student();
                newstudent.setName(res.getString("name"));
                newstudent.setGrade(res.getString("grade"));
                newstudent.setRegistrationNumber(res.getString("RegistrationNumber"));
                newstudent.setDateofbirth(res.getString("dob"));
                newstudent.setFaculty(res.getString("faculty"));
                newstudent.setFee(res.getInt("fee"));
                newstudent.setFeeBalance(res.getInt("feebalance"));
                newstudent.setPhpMarks(res.getInt("phpmarks"));
                newstudent.setJavaMarks(res.getInt("javamarks"));
                newstudent.setPythonMarks(res.getInt("pythonmarks"));
                listOfStudents.add(newstudent);
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return listOfStudents;
    }

    public static boolean deleteStudent(int id){
        String sql="Delete from tbl_students where id =?";
        Connection con=null;
        PreparedStatement preparedStatement=null;
        try {
            con=getDbConnection("jdbc:mysql://localhost:3306/students","root","");
          preparedStatement=con.prepareStatement(sql);
          preparedStatement.setInt(1,id);
         int del= preparedStatement.executeUpdate();
         if (del>0)
             return true;

        }
        catch (Exception e){
            e.printStackTrace();
        }
return false;
    }

    public static boolean updateStudent(int id, String name){
        String sql="Update tbl_students set name=? where id =?";
        Connection con=null;
        PreparedStatement preparedStatement=null;
        try {
            con=getDbConnection("jdbc:mysql://localhost:3306/students","root","");
            preparedStatement=con.prepareStatement(sql);
            preparedStatement.setString(1,name);
            preparedStatement.setInt(2,id);

            int update= preparedStatement.executeUpdate();
            if (update>0)
                return true;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }


    public static int calculateAverage(int javaMarks, int pythonMarks, int phpMarks) {
        return (javaMarks + pythonMarks + phpMarks)/3;
    }

    public static boolean canSitExams(Student studentfee) {
        if (studentfee.getFeeBalance() > 0.5 * (studentfee.getFee())) {
            System.out.println("Cannot sit exams");
            return false;
        }
        else
            return true;
    }

    //Allow us to connect to DB
    //@param url
    //@param username
    //@param password

    public static Connection getDbConnection(String url, String username, String password){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
        }catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
        return con;
    }
}
