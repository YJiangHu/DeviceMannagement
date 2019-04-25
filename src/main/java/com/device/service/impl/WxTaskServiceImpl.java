package com.device.service.impl;

import com.device.mapper.WxTaskMapper;
import com.device.po.WxTask;
import com.device.service.WxTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class WxTaskServiceImpl implements WxTaskService {

    @Autowired
    WxTaskMapper wxTaskMapper;

    @Override
    public int upTask(WxTask wxTask) {
        return wxTaskMapper.upTask(wxTask);
    }
}
