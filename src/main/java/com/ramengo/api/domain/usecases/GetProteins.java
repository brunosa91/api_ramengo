package com.ramengo.api.domain.usecases;


import com.ramengo.api.domain.model.ProteinsModel;

import java.util.List;

public interface GetProteins {
    List<ProteinsModel> getProteins();
}
