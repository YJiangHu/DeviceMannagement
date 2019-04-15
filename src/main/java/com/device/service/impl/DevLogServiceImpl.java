package com.device.service.impl;

import com.device.mapper.DevLogMapper;
import com.device.po.DevLog;
import com.device.service.DevLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DevLogServiceImpl implements DevLogService {

    @Autowired
    private DevLogMapper devLogMapper;

    @Override
    public List<DevLog> listDevLogs() {
        return devLogMapper.listDevLogs();
    }
}
