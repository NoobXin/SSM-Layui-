package com.cn.ssm.controller;

import com.cn.ssm.domain.Count;
import com.cn.ssm.domain.IDCard;
import com.cn.ssm.domain.Result;
import com.cn.ssm.domain.Users;
import com.cn.ssm.service.CountService;
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
public class CountController {

    @Autowired
    private CountService countService;

    @RequestMapping(value = "/selectIDNum")
    public String selectIDNum() {
        return "indexSel";
    }
    @RequestMapping(value = "/selectNumByID", method = RequestMethod.POST)
    @ResponseBody
    public Result login(Count count, Model model) {
        Result<Object> result = new Result();
        Count info = countService.selectNumByID(count);
        if (info != null) {
            model.addAttribute("num",info.getSE_Num());
            result.setMsg("该身份证在"+count.getStartDay()+"-"+count.getEndDay()+"日期内查询次数为"+info.getSE_Num());
            result.setCode("0");
            return result;
        }else {
            model.addAttribute("num",0);
            result.setMsg("改时间范围内无此身份证查询次数");
            result.setCode("1");
            return result;
        }

    }
}
