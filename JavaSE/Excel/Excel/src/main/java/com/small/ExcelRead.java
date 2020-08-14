package com.small;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.joda.time.DateTime;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author smallYJ
 */
public class ExcelRead {
    String path = "E:\\A_Project\\JavaSE\\Excel\\";


    @Test
    public void testRead03() throws Exception {
        //获取文件流
        FileInputStream fileInputStream = new FileInputStream(path +"Excel统计表03.xls");

        //1. 创建一个工作蒲,使用Excel能操作的这里也都可以
        Workbook workbook = new HSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheet("狂神观众统计表");
        Row row = sheet.getRow(0);
        Cell cell11 = row.getCell(0);

        //读取值一定要注意类型
        String value = cell11.getStringCellValue();
        System.out.println(value);

        Cell cell12 = row.getCell(1);
        System.out.println(cell12.getNumericCellValue());

        fileInputStream.close();
    }
}
