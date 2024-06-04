package com.reamegon.domain.usecases;

import com.reamegon.app.dto.BrothResponse;
import com.reamegon.domain.model.BrothModel;

import java.util.List;

public interface GetBroths {
    List<BrothModel> getBroths();

}
