package com.reamegon.domain.gateway;

import com.reamegon.app.dto.BrothResponse;
import com.reamegon.domain.model.BrothModel;

import java.util.List;

public interface BrothsGateway {
    List<BrothModel> brothListGateway();
}
