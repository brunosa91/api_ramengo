package com.reamegon.domain.gateway;

import com.reamegon.app.dto.ProteinsResponse;
import com.reamegon.domain.model.ProteinsModel;

import java.util.List;

public interface ProteinsGateway {
    List<ProteinsModel> proteinsListGateway();

}
