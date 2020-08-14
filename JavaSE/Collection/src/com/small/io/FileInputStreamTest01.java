package com.small.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author smallYJ
 * 1. 文件字节输入流,万能的,任何类型的文件都可以采用这个流读
 * 2. 字节的方式,完成输入的操作,完成读的操作(硬盘--->内存)
 */
public class FileInputStreamTest01 {
    public static void main(String[] args) {
        //创建文件字节输入流对象
        FileInputStream file = null;

        try {
            //
            file = new FileInputStream("E:\\A_Project\\JavaSE\\Collection\\src\\com\\small\\io\\temp");
            //开始读
            int read = file.read(); //当前字节的大小
            System.out.println(read);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //避免空指针异常
            if (file != null){
                //关闭流的前提:流不为空.流为空没有必要
                try {
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
