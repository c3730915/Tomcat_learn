package cn.itcast.web.servlet.Response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ServletWriteToBrow")
public class ServletWriteToBrow extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        //获取字符串输出流
//        response.setCharacterEncoding("utf-8");
//        response.setHeader("content-type","text/html;charset=utf-8"); //告诉浏览器当前的编码，防止中文乱码
        response.setContentType("text/html;charset=utf-8");
        //输出数据
        writer.write("hi response222 你好");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);

    }
}
