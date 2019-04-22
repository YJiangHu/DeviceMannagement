package com.device.service.impl;

import com.device.mapper.WxPlanMapper;
import com.device.po.WxPlan;
import com.device.service.WxPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class WxPlanServiceImpl implements WxPlanService {

    @Autowired
    WxPlanMapper wxPlanMapper;
    @Override
    public List<WxPlan> wxListPlans() {

        return wxPlanMapper.wxListPlans();
    }
}
