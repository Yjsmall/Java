package com.small;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.joda.time.DateTime;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * @author smallYJ
 */
public class ExcelWrite {
    String path = "E:\\A_Project\\JavaSE\\Excel\\Excel";

    @Test
    public void testWrite03() throws Exception {

        //1. 创建一个文件名
        Workbook workbook = new HSSFWorkbook();

        //2.创建一个工作表
        Sheet sheet = workbook.createSheet("狂神观众统计表");

        //3.创建一行
        Row row1 = sheet.createRow(0);

        //4.创建一单元格
        Cell cell11 = row1.createCell(0);
        cell11.setCellValue("今日新增观众");

        Cell cell12 = row1.createCell(1);
        cell12.setCellValue(777);

        Row row2 = sheet.createRow(1);
        Cell cell21 = row2.createCell(0);
        cell21.setCellValue("统计时间");

        Cell cell22 = row2.createCell(1);
        String time = new DateTime().toString("yyyy-MM-dd HH:mm:ss");
        cell22.setCellValue(time);

        //生成一个表(IO流)
        FileOutputStream file = new FileOutputStream(path + "统计表03.xls");

        workbook.write(file);

        file.close();

        System.out.println("Over");


    }

    @Test
    public void testWrite07() throws Exception {

        //1. 创建一个文件名
        Workbook workbook = new XSSFWorkbook();

        //2.创建一个工作表
        Sheet sheet = workbook.createSheet("狂神观众统计表");

        //3.创建一行
        Row row1 = sheet.createRow(0);

        //4.创建一单元格
        Cell cell11 = row1.createCell(0);
        cell11.setCellValue("今日新增观众");

        Cell cell12 = row1.createCell(1);
        cell12.setCellValue(777);

        Row row2 = sheet.createRow(1);
        Cell cell21 = row2.createCell(0);
        cell21.setCellValue("统计时间");

        Cell cell22 = row2.createCell(1);
        String time = new DateTime().toString("yyyy-MM-dd HH:mm:ss");
        cell22.setCellValue(time);

        //生成一个表(IO流)
        FileOutputStream file = new FileOutputStream(path + "统计表07.xlsx");

        workbook.write(file);

        file.close();

        System.out.println("Over");


    }

    @Test
    public void testWrite03BigData() throws Exception {
        //Time
        long begin = System.currentTimeMillis();

        Workbook workbook = new HSSFWorkbook();

        //创建一个Sheet
        Sheet sheet = workbook.createSheet();

        for (int rowNum = 0; rowNum < 65536; rowNum++) {
            Row row = sheet.createRow(rowNum);
            for (int cellNum = 0; cellNum < 10; cellNum++) {
                //列
                Cell cell = row.createCell(cellNum);
                //列的值
                cell.setCellValue(cellNum);
            }
        }

        System.out.println("写入完毕");
        FileOutputStream fi = new FileOutputStream(path + "TestWriteBig.xls");
        workbook.write(fi);
        fi.close();
        long end = System.currentTimeMillis();
        System.out.println((double) (end-begin)/1000);
    }

    @Test
    public void testWrite07FastData() throws Exception{
        //Time
        long begin = System.currentTimeMillis();

        Workbook workbook = new SXSSFWorkbook();

        //创建一个Sheet
        Sheet sheet = workbook.createSheet();

        for (int rowNum = 0; rowNum < 655360; rowNum++) {
            Row row = sheet.createRow(rowNum);
            for (int cellNum = 0; cellNum < 10; cellNum++) {
                //列
                Cell cell = row.createCell(cellNum);
                //列的值
                cell.setCellValue(cellNum);
            }
        }

        System.out.println("写入完毕");
        FileOutputStream fi = new FileOutputStream(path + "TestWriteFast.xlsx");
        workbook.write(fi);
        fi.close();
        //清楚临时文件
        ((SXSSFWorkbook)workbook).dispose();

        long end = System.currentTimeMillis();
        System.out.println((double) (end-begin)/1000);
    }
}
