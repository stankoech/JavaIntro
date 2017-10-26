package org.thecodevillage.intro;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import org.thecodevillage.common.Student;

/**
 * Created by Stankoech on 10/14/2017.
 */
public class MyHashMapStudent {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter no of students");
        int n = scanner.nextInt();

        Map<Integer, String> maHashmap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            Student student = new Student();
            System.out.println("Enter the ID of student " + (i + 1));
            student.setId(scanner.nextInt());
            System.out.println("Enter the Reg_no of student " + (i + 1));
            student.setReg_no(scanner.next());

            maHashmap.put(student.getId(), student.getReg_no());
        }
        outputMap(maHashmap);
    }

        public static void outputMap(Map mp){
            Iterator it = mp.entrySet().iterator();
            while (it.hasNext()){
                Map.Entry pair = (Map.Entry)it.next();
                System.out.println(pair.getKey()+"  "+pair.getValue());
                it.remove();
            }

    }

}
