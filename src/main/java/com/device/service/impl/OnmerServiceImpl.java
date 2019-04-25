package com.device.service.impl;

import com.device.mapper.OnmerMapper;
import com.device.po.Onmer;
import com.device.service.OnmerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OnmerServiceImpl implements OnmerService {

    @Autowired
    OnmerMapper onmerMapper;


    @Override
    public List<Onmer> listOnmers() {

        return onmerMapper.listOnmers();
    }
}
