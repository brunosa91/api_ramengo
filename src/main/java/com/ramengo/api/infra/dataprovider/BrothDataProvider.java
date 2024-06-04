package com.ramengo.api.infra.dataprovider;


import com.ramengo.api.domain.gateway.BrothsGateway;
import com.ramengo.api.domain.model.BrothModel;
import com.ramengo.api.infra.repository.BrothRepository;
import com.ramengo.api.infra.entities.BrothEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class BrothDataProvider implements BrothsGateway {
    @Autowired
    BrothRepository brothRepository;
    @Autowired
    MapperDataProvider mapperDataProvider;
    @Override
    public List<BrothModel> brothListGateway() {
        List<BrothEntity> brothEntities = brothRepository.findAll();
        List<BrothModel> brothModels = brothEntities.stream()
                .map(entity-> mapperDataProvider.entityBrothsToModel(entity)).toList();

        return brothModels;
    }
}
