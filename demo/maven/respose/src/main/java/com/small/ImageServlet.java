package com.small;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "image",urlPatterns = "/image")
public class ImageServlet extends HttpServlet {

    /**
     *
     */
    private static final long serialVersionUID = -2384497574150017530L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 浏览器3秒自动刷新一次
        resp.setHeader("refresh", "3");

        // 在内从创建一个图片
        BufferedImage image = new BufferedImage(80, 20, BufferedImage.TYPE_3BYTE_BGR);

        // 得到一个图片
        Graphics2D g = (Graphics2D) image.getGraphics();

        //这是图片颜色
        g.setColor(Color.white);
        g.fillRect(0, 0, 80, 20);

        //给图片写数据
        g.setColor(Color.BLUE);
        g.setFont(new Font(null,Font.BOLD,20));
        g.drawString(makeNum(), 0, 20);


        //告诉浏览器,这个请求用图片方式打开
        resp.setContentType("image/jpg");
        //网站存在缓存,不让浏览器缓存
        resp.setDateHeader("expires", -1);
        resp.setHeader("Cache-Control", "no-cache");
        resp.setHeader("Pragma", "no-cache");

        //把图片写给浏览器
        ImageIO.write(image, "jpg", resp.getOutputStream());



    }

	private	String makeNum() {
            Random random = new Random();
            String num = random.nextInt(99999999) +  "";
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < 7-num.length(); i++) {
                sb.append("0");
            }
            num = sb.toString() + num;
            return num;
    }
}