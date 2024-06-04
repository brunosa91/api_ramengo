package com.ramengo.api.app.mapper;

import com.ramengo.api.app.dto.BrothResponse;
import com.ramengo.api.app.dto.OrderReponse;
import com.ramengo.api.app.dto.OrderRequest;
import com.ramengo.api.app.dto.ProteinsResponse;
import com.ramengo.api.domain.model.BrothModel;
import com.ramengo.api.domain.model.ProteinsModel;

@org.mapstruct.Mapper(componentModel = "spring")
public interface Mapper {
    OrderReponse requestToResponse(OrderRequest orderRequest);
    ProteinsResponse modelProteinsToResponse(ProteinsModel proteinsModel);
    BrothResponse modelBrothToResponse(BrothModel proteinsModel);
}
