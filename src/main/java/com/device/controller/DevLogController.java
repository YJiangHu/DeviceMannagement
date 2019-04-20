package com.device.controller;

import com.device.po.DevLog;
import com.device.result.Result;
import com.device.service.DevLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class DevLogController {

    @Autowired
    private DevLogService devLogService;

    @RequestMapping("/devlogs")
    @ResponseBody
    public Result<List<DevLog>> listDevLogs() {
        List<DevLog> list = devLogService.listDevLogs();
        return Result.success(list, list.size());
    }

    @InitBinder
    protected void initBinder(WebDataBinder binder)
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd hh:mm:ss");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat,false));
    }
}
