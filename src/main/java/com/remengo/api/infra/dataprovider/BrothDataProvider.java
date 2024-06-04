package com.remengo.api.infra.dataprovider;


import com.remengo.api.domain.gateway.BrothsGateway;
import com.remengo.api.domain.model.BrothModel;
import com.remengo.api.infra.entities.BrothEntity;
import com.remengo.api.infra.repository.BrothRepository;
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
