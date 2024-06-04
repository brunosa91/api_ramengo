package com.ramengo.api.app.service;


import com.ramengo.api.app.dto.BrothResponse;
import com.ramengo.api.app.mapper.Mapper;
import com.ramengo.api.domain.usecases.GetBroths;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Transactional
public class BrothsService implements BrothServiceInterface {
    @Autowired
    Mapper mapper;
    @Autowired
    GetBroths getBroths;

    public List<BrothResponse> getAllBroth() {


        List<BrothResponse> brothResponses = getBroths.getBroths().stream()
                .map(brothModel -> mapper.modelBrothToResponse(brothModel)).toList();


        return brothResponses;
    }

}
