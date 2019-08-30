package com.example.demo;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
@RequestMapping("/")
public String login()
{

return "login.jsp";
}
@RequestMapping("/verify")
public String greet(HttpServletRequest request)
{
String user=request.getParameter("uname");
String pwd=request.getParameter("pwd");
System.out.println("Username : "+user);
System.out.println("Password : "+pwd);
HttpSession session=request.getSession();
session.setAttribute("username", user);
return "welcome.jsp";
}
}
