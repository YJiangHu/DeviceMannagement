package com.device.service.impl;

import com.device.mapper.TaskMapper;
import com.device.po.Task;
import com.device.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    TaskMapper taskMapper;

    @Override
    public List<Task> listTasks() { return taskMapper.listTasks(); }


}
