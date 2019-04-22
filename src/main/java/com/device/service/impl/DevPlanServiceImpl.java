package com.device.service.impl;


import com.device.mapper.DevPlanMapper;
import com.device.po.DevPlan;
import com.device.service.DevPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DevPlanServiceImpl implements DevPlanService {
    @Autowired
    DevPlanMapper devPlanMapper;

    @Override
    public List<DevPlan> ListPlans() {
        return devPlanMapper.listPlans();
    }
}
