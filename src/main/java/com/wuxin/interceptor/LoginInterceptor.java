package com.wuxin.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 孙豪文
 * 2020/12/14
 */
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        if(session.getAttribute("uname") == null){
            request.setAttribute("msg","您还没有登录,请先去登录!");
            request.getRequestDispatcher("index.jsp").forward(request,response);
            return false;
        }
        return true;
    }
}
