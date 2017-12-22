package Homework.Tasks.Task_3;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> myCollection = new ArrayList<String>();
        String fileName = "mytext.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);
            String s = null;
            int count = 0;
            System.out.println("Read data from file: "
                    + fileName);
            while ((s = br.readLine()) != null) {
                myCollection.add(s);
            }
            br.close();
            System.out.println("\n" + myCollection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}