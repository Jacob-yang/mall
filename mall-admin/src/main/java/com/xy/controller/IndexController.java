package com.xy.controller;

import com.xy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @Auther: JacobYang
 * @Date: 2018/5/26 16:46
 * @Description:
 */
@Controller
@RequestMapping("/admin")
public class IndexController {
    private static final String VIEW_PREFIX = "index/";

    @Autowired
    private UserService userService;

    @RequestMapping({ "/", "index" })
    public String index(HttpServletRequest request, Model model) {
        System.out.println("*************admin**************index********");
        userService.selectByPrimaryKey(1);
        return VIEW_PREFIX + "index";
    }

}
