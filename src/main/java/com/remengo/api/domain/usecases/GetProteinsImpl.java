package com.reamegon.domain.usecases;

import com.reamegon.app.dto.ProteinsResponse;
import com.reamegon.domain.gateway.ProteinsGateway;
import com.reamegon.domain.model.ProteinsModel;
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
