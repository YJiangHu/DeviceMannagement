package com.device.controller;


import com.device.po.DevLog;
import com.device.po.WxPlan;
import com.device.result.Result;
import com.device.service.WxPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class WxPlanController {

    @Autowired
    WxPlanService wxPlanService;

    @RequestMapping("/wxListPlan")
    @ResponseBody
    public Result<List<WxPlan>> wxListPlans(){
        List<WxPlan> list = wxPlanService.wxListPlans();
        return Result.success(list, list.size());
    }
}
