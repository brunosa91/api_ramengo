package com.reamegon.domain.usecases;

import com.reamegon.app.dto.ProteinsResponse;
import com.reamegon.domain.model.ProteinsModel;

import java.util.List;

public interface GetProteins {
    List<ProteinsModel> getProteins();
}
