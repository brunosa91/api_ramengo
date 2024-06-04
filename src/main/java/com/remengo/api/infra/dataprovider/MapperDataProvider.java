package com.remengo.api.infra.dataprovider;


import com.remengo.api.domain.model.BrothModel;
import com.remengo.api.domain.model.ProteinsModel;
import com.remengo.api.infra.entities.BrothEntity;
import com.remengo.api.infra.entities.ProteinsEntity;

@org.mapstruct.Mapper(componentModel = "spring")

public interface MapperDataProvider {
    BrothModel entityBrothsToModel(BrothEntity brothEntity);
    ProteinsModel entityProteinsToModel(ProteinsEntity proteinsEntity);



}
