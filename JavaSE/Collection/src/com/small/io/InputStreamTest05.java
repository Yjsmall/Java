package com.small.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author smallYJ
 * int availale():返回当前剩余字节的数量
 * long skip(long n):跳过几个字节不读
 */
public class InputStreamTest05 {
    public static void main(String[] args) {
        FileInputStream file = null;

        try {
            file = new FileInputStream("src/com/small/io/temp");
            System.out.println("总字节数量" + file.available());

            //读一个byte
            int readByte = file.read();
            //还剩下读的字节数量
            System.out.println("剩下字节的数量没有读" + file.available());

            //知道一个文件的大小,直接new一个空间
            byte[] bytes = new byte[file.available()];
            int readCount = file.read(bytes);
            System.out.println(new String(bytes));

            //skip跳过几个字符
            file.skip(3);
            System.out.println(file.read());


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
