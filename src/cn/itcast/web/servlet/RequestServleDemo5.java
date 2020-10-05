package cn.itcast.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

@WebServlet("/requestDemo5")
public class RequestServleDemo5 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8"); //防止中文乱码
        //获取请求消息体 --请求参数
        //获取字符流
//        System.out.println("demo5");
//        BufferedReader br = request.getReader();
//        //读取数据
//        String line =null;
//        while ((line=br.readLine())!=null)
//        {
////            System.out.println(line);
//        }
        //第二种方法
//        String username = request.getParameter("username");
//        System.out.println(username);
//        String password = request.getParameter("password");
//        System.out.println(password);
//        String[] hobbies = request.getParameterValues("hobby");
//        for(String hobby: hobbies){
//            System.out.println(hobby);
//        }
//
        //第三种方法，使用map进行遍历
        Map<String, String[]> parameterMap = request.getParameterMap();
        Set<String> keySet = parameterMap.keySet();
        for (String name : keySet) {
            //根据键值对获取值
            String[] values = parameterMap.get(name);
            System.out.println(name);
            for (String value : values) {
                System.out.println(value);
            }
            System.out.println("----------------------------------");

        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        System.out.println("demo5");
        this.doPost(request,response);
        //post和get没有差异 直接调用post方法完成
    }
}
