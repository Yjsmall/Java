package com.small.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author smallYJ
 */
public class OutPutStreamTest01 {
    public static void main(String[] args) {
        FileOutputStream file = null;

        try {
//            file = new FileOutputStream("myFile");
            file = new FileOutputStream("src/com/small/io/Temp01",true);

            //开始写
            byte[] bytes = {97,98,99,100};
            file.write(bytes);
            file.write(bytes,0,2);

            //true,技术不会覆盖的写入
            String s = "你好,世界!";
            byte[] bytes1 = s.getBytes();
            file.write(bytes1);

            //写完一定刷新
            file.flush();
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
