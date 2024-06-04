package com.ramengo.api.app.service;



import com.ramengo.api.app.dto.ProteinsResponse;

import java.util.List;

public interface ProteinsServiceInterface {
    List<ProteinsResponse> getAllProteins();
}
