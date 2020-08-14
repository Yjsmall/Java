package com.small.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author smallYJ
 * int read(byte[] b)
 * 减少硬盘和内存的交互,提高程序效率
 * 往byte读
 */
public class InputStreamTest03 {
    public static void main(String[] args) {
        FileInputStream file = null;
        try {
             file = new FileInputStream("src/com/small/io/temp");

             //开始读取
            byte[] bytes = new byte[4];

            //返回值是:读取的字节数量(不是字节本身)
            int readCount = file.read(bytes);
            System.out.println(readCount);
            //将字节全部转化为字符串
            System.out.println(new String(bytes));

            readCount = file.read(bytes);
            System.out.println(readCount);
            //不应该全部转换,应该是有多少转换多少,从数组0,读取到readCount.
            System.out.println(new String(bytes,0,readCount));

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
