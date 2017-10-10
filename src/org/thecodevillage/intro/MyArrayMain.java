package org.thecodevillage.intro;

/**
 * Created by Stankoech on 10/7/2017.
 */
public class MyArrayMain {

    //args is an array
    public static void main (String[] args) {
        int[] ids = new int[10];

        ids[0] = 10;
        ids[1] = 20;
        ids[2] = 30;

        //System.out.println(ids[0] + "," + ids[1]);

        //Loops-Help us itereate through list of items/arrays
        //if loops
int sum=0;
        if (ids.length > 0) {
            for (int i = 0; i < ids.length; i++) {
             //   System.out.println(ids[i]);
                   sum=sum+ids[i];
            }

            System.out.println(sum);
            //while

//            int counter=0;
//            while (counter<ids.length){
//                System.out.println(ids[counter]);
//                counter++;
//            }

            //do while
//            counter=0;
//            do {
//                System.out.println(ids[counter]);
//                counter++;
//            }while(counter<ids.length);
        }else{
                System.out.println("Arrays has no Items");
            }
        }
    }

