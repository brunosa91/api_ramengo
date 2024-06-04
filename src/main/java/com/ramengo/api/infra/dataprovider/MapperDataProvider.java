package com.ramengo.api.infra.dataprovider;


import com.ramengo.api.domain.model.ProteinsModel;
import com.ramengo.api.domain.model.BrothModel;
import com.ramengo.api.infra.entities.BrothEntity;
import com.ramengo.api.infra.entities.ProteinsEntity;

@org.mapstruct.Mapper(componentModel = "spring")

public interface MapperDataProvider {
    BrothModel entityBrothsToModel(BrothEntity brothEntity);
    ProteinsModel entityProteinsToModel(ProteinsEntity proteinsEntity);



}
