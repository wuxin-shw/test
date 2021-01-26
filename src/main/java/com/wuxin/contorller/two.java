package com.wuxin.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 孙豪文
 * 2020/12/12
 */
@Controller
@RequestMapping("/two")
public class two {

    @RequestMapping("/obj")
    public String showHello(){


        return "redirect:/jsp/hehe.jsp";
    }
}
