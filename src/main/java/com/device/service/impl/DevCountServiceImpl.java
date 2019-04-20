package com.device.service.impl;

import com.device.mapper.DevCountMapper;
import com.device.po.DevCount;
import com.device.service.DevCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DevCountServiceImpl implements DevCountService {

    @Autowired
    DevCountMapper devCountMapper;

    @Override
    public List<DevCount> listDevCounts() {
        return devCountMapper.listDevCounts();
    }
}
