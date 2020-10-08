package cn.itcast.web.servlet.Response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ServletRedirDemo1")
public class ServletRedirDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setStatus(302);
        response.setHeader("location","/tomcat/ServletRedirDemo2"); //跳转设置响应头
        System.out.println("demo1....");
        String contextPath = request.getContextPath();
        //动态获取虚拟目录

        response.sendRedirect(contextPath +"ServletRedirDemo2");
        //简单的跳转

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);

    }
}
