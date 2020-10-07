package cn.itcast.web.servlet.old;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//演示Request对象获取请求行数据
@WebServlet("/requestDemo1")
public class RequestServletDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String method = request.getMethod();
        System.out.println(method);
        //获取虚拟目录
        String contestPath = request.getContextPath();
        System.out.println(contestPath);
        //获取servlet路径
        String servletPath = request.getServletPath();
        //获取get方式请求参数 name =zhangsan
        String queryString = request.getQueryString();
        String requestURI = request.getRequestURI();
        StringBuffer requestURL = request.getRequestURL();
        System.out.println(requestURI+requestURL);
        //获取协议版本HTTP1.1
        String protocol = request.getProtocol();
        System.out.println(protocol);
        //获取远程ip
        String remoteAddr = request.getRemoteAddr();
        System.out.println(remoteAddr);


    }
}
