package com.device.controller;


import com.device.po.Onmer;
import com.device.result.Result;
import com.device.service.OnmerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OnmerController {

    @Autowired
    OnmerService onmerService;

    @RequestMapping("/listOnmers")
    @ResponseBody
    public Result<List<Onmer>> listOnmers() {
        List<Onmer> list = onmerService.listOnmers();
        for(Onmer onmer : list){
            System.out.println(onmer);
        }
        return Result.success(list,list.size());


    }

}
