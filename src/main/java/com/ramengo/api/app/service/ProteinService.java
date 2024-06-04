package com.ramengo.api.app.service;


import com.ramengo.api.app.dto.ProteinsResponse;
import com.ramengo.api.app.mapper.Mapper;
import com.ramengo.api.domain.model.ProteinsModel;
import com.ramengo.api.domain.usecases.GetProteins;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ProteinService implements ProteinsServiceInterface{
    @Autowired
    GetProteins getProteins;
    @Autowired
    Mapper mapper;

    @Override
    public List<ProteinsResponse> getAllProteins() {

        List<ProteinsModel> proteinsModels = getProteins.getProteins();
        List<ProteinsResponse> proteins = proteinsModels.stream()
                .map(proteinsModel -> mapper.modelProteinsToResponse(proteinsModel) ).toList();


        return proteins;
    }
}
