package cn.itcast.web.servlet.old;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/RequestServletDemo2")
public class RequestServletDemo2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //演示获取请求头数据 user-agent
        String agent = request.getHeader("user-agent");
        if (agent.contains("Chrome")){
            System.out.println("google");
        }
        else if(agent.contains("Firefox")){
            System.out.println("Firefox");
        }

    }
}
