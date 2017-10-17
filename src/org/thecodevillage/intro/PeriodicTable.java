package org.thecodevillage.intro;

import java.security.Key;
import java.util.*;

/**
 * Created by Stankoech on 10/16/2017.
 */
public class PeriodicTable {
    //Creating a periodic table for chemistry with their sysmbols using hashmaps
    public static void main(String[] args){

        HashMap<String, String> ptable = new HashMap<>();
        ptable.put("Hydrogen","H");
        ptable.put("Lidium","Li");
        ptable.put("Carbon","C");
        ptable.put("Helium","He");
        ptable.put("Oxygen","O");
        ptable.put("Aluminium","Al");
        ptable.put("Chlorine","Sl");
        ptable.put("Potassium","K");
        ptable.put("Sodium","Na");
        ptable.put("Calcium","Ca");
        ptable.put("Fluorine","F");
        ptable.put("Berylium","Be");
        ptable.put("Magnessium","Mg");
        ptable.put("Titanium","Ti");
        ptable.put("Zinc","Zn");
        ptable.put("Silicon","Si");
        ptable.put("Iron","Fe");
        ptable.put("Zinc","Zn");
        ptable.put("Phosphorous","P");
        ptable.put("Copper","Cu");

        System.out.println("Please enter the chemical elements symbol");

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

       //One way of doing it
        for (String key : ptable.keySet()) {
            if (ptable.get(key).equals(name)) {
                System.out.println("Element: " + key + " Symbol: " + name);
            }
        }
        //Second way of doing it.
 /*       Set<String> keys = ptable.keySet();
        for (String key : keys) {
            if (ptable.get(key).equals(name)) {
                System.out.println("Element :" + key + "Symbol " + name);
            }
        }*/
        //   outputMap(ptable);
    }
    //Iterate through the key set and display key and values
/*
   public static void outputMap(Map mp) {
        Iterator it = mp.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            System.out.println(pair.getKey() + "  " + pair.getValue());
            it.remove();
        }
    }*/

}
