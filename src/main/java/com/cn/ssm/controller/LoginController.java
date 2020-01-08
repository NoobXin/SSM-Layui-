package com.cn.ssm.controller;

import com.cn.ssm.domain.Result;
import com.cn.ssm.domain.Users;
import com.cn.ssm.service.IDCardService;
import com.cn.ssm.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    private UsersService usersService;
    @Autowired
    private IDCardService idCardService;
    /**
     * 用户登录
     *
     * @param user
     * @param model
     * @param session
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public Result login(Users user, Model model, HttpSession session ) {
        Result<Object> result = new Result();
        //获取用户名和密码
        String username = user.getUsername();
        String password = user.getPassword();
        //些处横板从数据库中获取对用户名和密码后进行判断
        Users userInfo = usersService.selectByName(username);
        if (userInfo == null) {
            result.setCode("1");
            result.setMsg("用户名或密码错误");
            return result;
        }else {
            String pwd = userInfo.getPassword();
            if (pwd.equals(password)) {
                session.setAttribute("USER_SESSION", userInfo);
                return result;
            } else {
                result.setCode("1");
                result.setMsg("用户名或密码错误");
                return result;
            }
        }
    }
}
