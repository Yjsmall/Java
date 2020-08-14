package com.small.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author smallYJ
 */
public class FileInputStreamTest02 {
    public static void main(String[] args) {
        FileInputStream file = null;

        try {
            file = new FileInputStream("E:/A_Project/JavaSE/Collection/src/com/small/io/temp");

            /*while (true){
                int readData = file.read();
                if (readData == -1){
                    break;
                }
                System.out.println(readData);
            }*/

            int readData = 0;
            while ((readData = file.read()) != -1){
                System.out.println(readData);
            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (file != null){
                try {
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
