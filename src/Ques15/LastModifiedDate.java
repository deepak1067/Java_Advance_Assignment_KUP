package Ques15;

import java.io.File;
import java.util.Date;
public class LastModifiedDate {



    public static void main(String[] args) {
        File myFile = new File("/home/desktop/Advance_java/src/Ques15/java.txt");

        long modifiedValue = myFile.lastModified();
        Date modifiedDate = new Date(modifiedValue);
        System.out.println(modifiedDate);
    }
}