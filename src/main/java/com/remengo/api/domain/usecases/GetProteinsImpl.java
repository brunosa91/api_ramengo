package com.remengo.api.domain.usecases;

import com.remengo.api.domain.gateway.ProteinsGateway;
import com.remengo.api.domain.model.ProteinsModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetProteinsImpl implements GetProteins {
    @Autowired
    private ProteinsGateway proteinsGateway;
    @Override
    public List<ProteinsModel> getProteins() {
        return proteinsGateway.proteinsListGateway();
    }
}
