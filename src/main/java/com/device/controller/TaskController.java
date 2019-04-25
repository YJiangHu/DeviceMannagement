package com.device.controller;


import com.device.po.Task;
import com.device.result.Result;
import com.device.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TaskController {

    @Autowired
    TaskService taskService;

    @RequestMapping("/listTasks")
    @ResponseBody
    public Result<List<Task>> listTasks(){

        List<Task> list = taskService.listTasks();
        for(Task x : list){
            System.out.println(x.getTaskDevName());
        }
        return Result.success(list,list.size());
    }
}
