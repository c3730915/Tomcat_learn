package cn.itcast.web.servlet_session_project;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;

@WebServlet( "/loginServlet")
public class ServletLogin extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String checkCode = request.getParameter("checkCode");
        //获取生成的验证码
        HttpSession session = request.getSession();
        String checkCode_session =(String) session.getAttribute("checkCode_session");
        session.removeAttribute("checoCode"); //立马移除验证码 防止多次使用
        //判断是否正确
        if (checkCode_session.equalsIgnoreCase(checkCode)){

            if("zhangsan".equals(username) && "123".equals(password)){
                //登陆成功存储用户信息
//               session.setAttribute("user",username);
//               response.sendRedirect(request.getContextPath()+"/success.jsp");
                //此处有bug 暂未修复！登陆成功会报错

            }else {

                request.setAttribute("login_error","invalided password or username");
                request.getRequestDispatcher("/index.jsp").forward(request,response);
            }
            request.getRequestDispatcher("/index.jsp").forward(request,response);
        }else {
            //验证码错误
            request.setAttribute("cc_error","invalided checkcode");
            //转发到登陆页面
            request.getRequestDispatcher("/index.jsp").forward(request,response);
            //转发给本页面
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
