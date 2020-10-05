package cn.itcast.web.servlet;

import javax.servlet.*;
import java.io.IOException;

public class ServletDemo02 implements Servlet {
    @Override
    //初始化方法，再servlet创建的时候执行
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init.....");

    }

    @Override
    //提供服务方法，每一次呗servlet访问的时候就会执行 执行多次
    public ServletConfig getServletConfig() {

        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        System.out.println("service ....");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    //在服务器正常关闭的时候会执行
    public void destroy() {
        System.out.println("destroy....");

    }
}
