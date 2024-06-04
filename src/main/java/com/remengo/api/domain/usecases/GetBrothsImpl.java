package com.reamegon.domain.usecases;

import com.reamegon.app.dto.BrothResponse;
import com.reamegon.domain.gateway.BrothsGateway;
import com.reamegon.domain.model.BrothModel;
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
