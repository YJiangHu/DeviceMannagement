package com.device.controller;


import com.device.po.DevPlan;
import com.device.result.Result;
import com.device.service.DevPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DevPlanController {
    @Autowired
    DevPlanService devPlanService;


    @RequestMapping("/listPlans")
    @ResponseBody
    public Result<List<DevPlan>> listPlans(){
        List<DevPlan> list = devPlanService.ListPlans();
        return Result.success(list,list.size());
    }
  }
