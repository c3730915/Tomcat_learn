<%--
  Created by IntelliJ IDEA.
  User: c3730
  Date: 9/27/2020
  Time: 6:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>注册页面2</title>
  <style>
    *{
      margin: 0px;
      padding: 0px;
      box-sizing: border-box;
    }
    body{
      background: url("imgs/day06/logo.jpg") no-repeat center;
      padding-top: 25px;
    }

    .rg_layout{
      width: 900px;
      height: 500px;
      border: 8px solid #EEEEEE;
      background-color: white;
      /*让div水平居中*/
      margin: auto;
    }

    .rg_left{
      /*border: 1px solid red;*/
      float: left;
      margin: 15px;
    }
    .rg_left > p:first-child{
      color:#FFD026;
      font-size: 20px;
    }

    .rg_left > p:last-child{
      color:#A6A6A6;
      font-size: 20px;

    }


    .rg_center{
      float: left;
      /* border: 1px solid red;*/

    }

    .rg_right{
      /*border: 1px solid red;*/
      float: right;
      margin: 15px;
    }

    .rg_right > p:first-child{
      font-size: 15px;

    }
    .rg_right p a {
      color:pink;
    }

    .td_left{
      width: 100px;
      text-align: right;
      height: 45px;
    }
    .td_right{
      padding-left: 50px ;
    }

    #username,#password,#email,#name,#tel,#birthday,#checkcode{
      width: 251px;
      height: 32px;
      border: 1px solid #A6A6A6 ;
      /*设置边框圆角*/
      border-radius: 5px;
      padding-left: 10px;
    }
    #checkcode{
      width: 110px;
    }

    #img_check{
      height: 32px;
      vertical-align: middle;
    }

    #btn_sub{
      width: 150px;
      height: 40px;
      background-color: #FFD026;
      border: 1px solid #FFD026 ;
    }

  </style>
  <script>
    //给表单绑定submit事件,在监听器中判断哪一个方法校验的结果 如果都为真，那么监听器返回真 否则返回假

  </script>


</head>
<body>

<div class="rg_layout">
  <div class="rg_left">
    <p>新用户注册</p>
    <p>USER REGISTER</p>

  </div>

  <div class="rg_center">
    <div class="rg_form">
      <!--定义表单 form-->
      <form action="get" method="post" id="form" >
        <table>
          <tr>
            <td class="td_left"><label for="username">用户名</label></td>
            <td class="td_right"><input type="text" name="username" id="username" placeholder="请输入用户名"></td>
          </tr>

          <tr>
            <td class="td_left"><label for="password">密码</label></td>
            <td class="td_right"><input type="password" name="password" id="password" placeholder="请输入密码"></td>
          </tr>

          <tr>
            <td class="td_left"><label for="email">Email</label></td>
            <td class="td_right"><input type="email" name="email" id="email" placeholder="请输入邮箱"></td>
          </tr>

          <tr>
            <td class="td_left"><label for="name">姓名</label></td>
            <td class="td_right"><input type="text" name="name" id="name" placeholder="请输入姓名"></td>
          </tr>

          <tr>
            <td class="td_left"><label for="tel">手机号</label></td>
            <td class="td_right"><input type="text" name="tel" id="tel" placeholder="请输入手机号"></td>
          </tr>

          <tr>
            <td class="td_left"><label>性别</label></td>
            <td class="td_right">
              <input type="radio" name="gender" value="male"> 男
              <input type="radio" name="gender" value="female"> 女
            </td>
          </tr>

          <tr>
            <td class="td_left"><label for="birthday">出生日期</label></td>
            <td class="td_right"><input type="date" name="birthday" id="birthday" placeholder="请输入出生日期"></td>
          </tr>

          <tr>
            <td class="td_left"><label for="checkcode" >验证码</label></td>
            <td class="td_right"><input type="text" name="checkcode" id="checkcode" placeholder="请输入验证码">
              <img id="img_check" src="img/verify_code.jpg">
            </td>
          </tr>


          <tr>
            <td colspan="2" align="center"><input type="submit" id="btn_sub" value="注册"></td>
          </tr>
        </table>

      </form>


    </div>

  </div>

  <div class="rg_right">
    <p>已有账号?<a href="#">立即登录</a></p>
  </div>


</div>


</body>
