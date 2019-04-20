package com.device.controller;

import com.device.po.DevCount;
import com.device.result.Result;
import com.device.service.DevCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DevCountController {


    @Autowired
    private DevCountService devCountService;

    @RequestMapping("/devcounts")
    @ResponseBody
    public Result<List<DevCount>> listDevCounts() {
        List<DevCount> list = devCountService.listDevCounts();
        return Result.success(list, list.size());
    }

}
