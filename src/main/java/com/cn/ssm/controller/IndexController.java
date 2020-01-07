package com.cn.ssm.controller;

import com.cn.ssm.domain.*;
import com.cn.ssm.service.CountService;
import com.cn.ssm.service.IDCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
public class IndexController {
    @Autowired
    private IDCardService idCardService;
    @Autowired
    private CountService countService;

    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/indexNum", method = RequestMethod.POST)
    @ResponseBody
    public Result login(IDCard idCard,Model model) {
        Result<Object> result = new Result();
        String ID = idCard.getID();
        IDCard info = idCardService.selectByNum(ID);
        if (info != null) {
            info.setID(ID);
            model.addAttribute("info",info);
            //插入查询次数
            Count count = new Count();
            count.setCard_id(ID);
            count.setDay(new Date());
            countService.add(count);
            result.setResult(info);
            result.setCode("0");
            return result;
        }else {
            result.setMsg("该身份证号无对应的居住证/登记卡信息");
            result.setCode("1");
            return result;
        }

    }


    @RequestMapping(value = "/indexTable")
    public String indexTable(String ID,String type,Model model) {
        IDCard info = idCardService.selectByNum(ID);
        if (info != null) {
            info.setID(ID);
            if ("1" == info.getType()) {
                info.setTypeName("登记卡");
//                IDCard info1 = idCardService.selectByTypeOne(ID);
            } else {
                info.setTypeName("居住证");
//                IDCard info1 = idCardService.selectByTypeTwo(ID);
            }
        }
        model.addAttribute("info",info);
        return "indexTable";
    }

    @RequestMapping("/searchList")
    @ResponseBody
    public Map<String,Object> getList(String ID){
        List<IDCard> bg01s = idCardService.selectByPage(ID);
        bg01s.get(0).setID(ID);
        if ("1" == bg01s.get(0).getType()) {
            bg01s.get(0).setTypeName("登记卡");
        } else {
            bg01s.get(0).setTypeName("居住证");
        }
        Map<String,Object> resultMap = new HashMap<String, Object>();
        resultMap.put("code",0);
        resultMap.put("msg","");
        resultMap.put("count","1000");
        resultMap.put("data",bg01s);
        return resultMap;
    }

    @RequestMapping("/searchListTwo")
    @ResponseBody
    public Map<String,Object> searchListTwo(String ID,String type){
        Map<String,Object> resultMap = new HashMap<String, Object>();
        List<IDCard> list = new ArrayList<IDCard>();
        if ("2".equals(type)) {
            list = idCardService.selectByTypeOne(ID);
        } else {
            list = idCardService.selectByTypeTwo(ID);
        }
        for (int i = 0;i<list.size();i++){
            if ("1".equals(list.get(i).getDzsffsbh())){
                list.get(i).setDzsffsbh("已变更");
            }else{
                list.get(i).setDzsffsbh("未变更");
            }
            if ("1".equals(list.get(i).getJjtscg())){
                list.get(i).setJjtscg("已取件");
            }else{
                list.get(i).setJjtscg("未取件");
            }
        }
        resultMap.put("data",list);
        resultMap.put("code",0);
        resultMap.put("msg","");
        resultMap.put("count","1000");

        return resultMap;
    }

    @RequestMapping("/searchListThree")
    @ResponseBody
    public Map<String,Object> searchListThree(String ID){
        Map<String,Object> resultMap = new HashMap<String, Object>();
        List<IDCard> list = idCardService.searchListThree(ID);
        for (int i = 0;i<list.size();i++){
            if ("1".equals(list.get(i).getYjmx_sfps())){
                list.get(i).setYjmx_sfps("已配送");
            }else{
                list.get(i).setYjmx_sfps("未配送");
            }
        }
        resultMap.put("code",0);
        resultMap.put("msg","");
        resultMap.put("count","1000");
        resultMap.put("data",list);
        return resultMap;
    }
}
