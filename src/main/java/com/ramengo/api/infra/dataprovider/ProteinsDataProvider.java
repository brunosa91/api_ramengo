package com.ramengo.api.infra.dataprovider;

import com.ramengo.api.domain.gateway.ProteinsGateway;
import com.ramengo.api.domain.model.ProteinsModel;
import com.ramengo.api.infra.repository.ProteinsRepository;
import com.ramengo.api.infra.entities.ProteinsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ProteinsDataProvider implements ProteinsGateway {
    @Autowired
    ProteinsRepository proteinsRepository;
    @Autowired
    MapperDataProvider mapperDataProvider;
    @Override
    public List<ProteinsModel> proteinsListGateway() {

        List<ProteinsEntity> proteinsEntities = proteinsRepository.findAll();
        List<ProteinsModel> proteinsModels = proteinsEntities.stream()
                .map(entity->  mapperDataProvider.entityProteinsToModel(entity)).toList();
        return proteinsModels;
    }
}
