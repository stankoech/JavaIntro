package org.thecodevillage.intro;

import org.thecodevillage.common.Student;
import org.thecodevillage.common.StudentFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Stankoech on 10/19/2017.
 */
public class StudentMain {

    public static void main(String[] args) {
        int average = 0;
        String grade;

        Scanner students = new Scanner(System.in);
        System.out.println("Please enter no of students");
        int n = students.nextInt();

        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Student student = new Student();
            System.out.println("Enter the Name of student " + (i + 1));
            student.setName(students.next());
            System.out.println("Enter the Registration Number of student " + (i + 1));
            student.setRegistrationNumber(students.next());
            System.out.println("Enter the Date of Birth of student " + (i + 1));
            student.setDateofbirth(students.next());
            System.out.println("Enter the faculty of student " + (i + 1));
            student.setFaculty(students.next());
            System.out.println("Enter the fee of student " + (i + 1));
            student.setFee(students.nextInt());
            System.out.println("Enter the feeBalance of student " + (i + 1));
            student.setFee(students.nextInt());
            System.out.println("Enter the java Marks of student " + (i + 1));
            student.setJavaMarks(students.nextInt());
            System.out.println("Enter the PHP MARKS of student " + (i + 1));
            student.setPhpMarks(students.nextInt());
            System.out.println("Enter the pythonMarks of student " + (i + 1));
            student.setPythonMarks(students.nextInt());

            average= StudentFunction.calculateAverage(student.getJavaMarks() , student.getPythonMarks(), student.getPhpMarks());
            grade=StudentFunction.calculateGrade(average);

            student.setGrade(grade);

            studentList.add(student);
        }
            for (int y = 0; y < studentList.size(); y++) {
                Student mystudents = studentList.get(y);
                average= StudentFunction.calculateAverage(mystudents.getJavaMarks() , mystudents.getPythonMarks(), mystudents.getPhpMarks());
                //feebalance=StudentsFunctions.canSitExams();
                System.out.println("Name:" + mystudents.getName()+
                        "\tRegistrationNo: " + mystudents.getRegistrationNumber() +
                        "\tDOB: " + mystudents.getDateofbirth() +
                        "\tFaculty: " + mystudents.getFaculty() +
                        "\tFee: " + mystudents.getFee() +
                        "\tjavaMarks: " + mystudents.getJavaMarks() +
                        "\tphp Marks: " + mystudents.getPhpMarks() +
                        "\tpythonMarks: "+ mystudents.getPythonMarks()+
                        "\tAverage: " + StudentFunction.calculateAverage(mystudents.getJavaMarks() , mystudents.getPythonMarks(), mystudents.getPhpMarks())+
                        "\tGrade: "+mystudents.getGrade() +
                        "\tCan Do Exams: " + StudentFunction.canSitExams(mystudents));

                StudentFunction.insertStudents(mystudents);
            }

        List<Student> results=StudentFunction.listOfStudents(studentList);
        for (int y = 0; y < results.size(); y++) {
            Student mystudents = results.get(y);
            System.out.println(
                    "\tName:" + mystudents.getName() +
                    "\tRegistrationNo: " + mystudents.getRegistrationNumber() +
                    "\tDOB: " + mystudents.getDateofbirth() +
                    "\tFaculty: " + mystudents.getFaculty() +
                    "\tFee: " + mystudents.getFee() +
                    "\tjavaMarks: : " + mystudents.getJavaMarks() +
                    "\tphp Marks: " + mystudents.getPhpMarks() +
                    "\tpythonMarks: "+ mystudents.getPythonMarks()+
                    "\tAverage: " + StudentFunction.calculateAverage(mystudents.getJavaMarks() , mystudents.getPythonMarks(), mystudents.getPhpMarks())+
                    "\tGrade: "+mystudents.getGrade() +
                    "\tCan Do Exams: " + StudentFunction.canSitExams(mystudents));
        }

      /* boolean delStatus= StudentFunction.deleteStudent(1);
        if (delStatus)
            System.out.println("Deleted");
        else
            System.out.println("Not Deleted");

*/
        boolean updateStatus= StudentFunction.updateStudent(5,"YEYE");
        if (updateStatus)
            System.out.println("Updated");
        else
            System.out.println("Not Updated");
    }

}