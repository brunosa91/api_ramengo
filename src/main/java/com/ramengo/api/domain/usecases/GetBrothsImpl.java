package com.ramengo.api.domain.usecases;

import com.ramengo.api.domain.gateway.BrothsGateway;
import com.ramengo.api.domain.model.BrothModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class GetBrothsImpl implements GetBroths {
    @Autowired
    private BrothsGateway brothsGateway;
    @Override
    public List<BrothModel> getBroths() {
        return brothsGateway.brothListGateway();
    }
}
