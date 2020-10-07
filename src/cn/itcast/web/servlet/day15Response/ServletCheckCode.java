package cn.itcast.web.servlet.day15Response;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

@WebServlet("/ServletCheckCode")
public class ServletCheckCode extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.创建一对象，在内存中（验证码图片对象)
        int width =100;
        int height =50;
        //设置图片大小
        BufferedImage bufferedImage = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);


        //2.美化图片
        Graphics g = bufferedImage.getGraphics(); //画笔对象
        g.setColor(Color.PINK);
        g.fillRect(0,0,width,height);
        g.setColor(Color.BLUE);
        g.drawRect(0,0, width-2,height-2); //画边框，-2是防止越界

        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghigklmnopqrstuvwxyz123456789";
        Random random = new Random();
        for (int i = 0; i <= 4; i++) {
            int index = random.nextInt(str.length());
            char ch = str.charAt(index); //随机字符
            g.drawString(ch+"",(width/5*i)+2,height/2);
        }
        //画干扰线
        for (int i = 0; i < 6; i++) { //i为干扰线的数量

            g.setColor(Color.BLUE);
            int x1 = random.nextInt(width);
            int x2 = random.nextInt(width);
            int y1 = random.nextInt(height);
            int y2 = random.nextInt(height);
            g.drawLine(x1,x2,y1,y2);
        }



        //3.将图片输出到页面展示
        ImageIO.write(bufferedImage,"jpg",response.getOutputStream());
        //参数为图片名，图片格式名，写入的流

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);

    }
}
