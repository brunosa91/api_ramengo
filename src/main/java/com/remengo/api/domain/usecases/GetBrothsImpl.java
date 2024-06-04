package com.remengo.api.domain.usecases;

import com.remengo.api.domain.gateway.BrothsGateway;
import com.remengo.api.domain.model.BrothModel;
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
