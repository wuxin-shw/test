package com.wuxin.contorller;

import com.wuxin.pojo.Users;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 孙豪文
 * 2020/12/11
 */
@Controller
@RequestMapping("/haha")
public class Hello {

    @RequestMapping("/index")
    public String showIndex(){
        return "index";
    }

    @RequestMapping("/zhendema")
    public String showHello(String uname, String uage, HttpSession session, HttpServletRequest request){
        if("wuxin".equals(uname) && "22".equals(uage)){
            session.setAttribute("uname",uname);
            return "hehe";
        }else{
            request.setAttribute("msg","年龄姓名不正确");
            return "index";
        }


    }


}
