package com.remengo.api.domain.usecases;


import com.remengo.api.domain.model.ProteinsModel;

import java.util.List;

public interface GetProteins {
    List<ProteinsModel> getProteins();
}
