package com.device.controller;


import com.device.po.WxTask;
import com.device.result.Result;
import com.device.service.WxTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WxTaskController {

    @Autowired
    WxTaskService wxTaskService;

    @RequestMapping("/wxUpTask")
    @ResponseBody
    public Result upTask( WxTask wxTask){

        return Result.success( wxTaskService.upTask(wxTask));

    }
}
