package com.small;

import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "fileDown",urlPatterns = "/down")
public class FileServlet extends HttpServlet{

    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    //1. 现在文件路径
        //String realPath = this.getServletContext().getRealPath("//1.jpg");
        String realPath = this.getServletContext().getRealPath("E:\\A_Project\\demo\\maven\\respose\\src\\main\\resources\\1.jpg");
        
        System.out.println("下载文件的路径:"+ realPath);
    //2. 下载的文件名
        String fileName = realPath.substring(realPath.lastIndexOf("\\") + 1);
    //3. 设置浏览器支持下载我们需要的东西
        resp.setHeader("Content-Disposition", "attachment;fileName="+fileName);
    //4. 获取下载文件的输入流
        FileInputStream in = new FileInputStream(realPath);
    //5. 创建缓冲区
        int len = 0;
        byte[] buffer = new byte[1024];
    //6. 获取OutputStream对象
        ServletOutputStream out = resp.getOutputStream();
    //7. 将FileOutputStream流写入buffer缓冲区
        while ((len=in.read(buffer)) > 0) {
            out.write(buffer,0,len);
        }
        in.close();
        out.close();
    //8. 使用InputStream将缓冲区的数据输出到客户端
    }
    
}