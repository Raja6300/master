package org.application.service.impl;

import org.application.dto.IPhoneDto;
import org.application.entity.IPhone;
import org.application.repository.IPhoneRepository;
import org.application.service.IPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IPhoneServiceImpl implements IPhoneService {
    @Autowired
    IPhoneRepository iPhoneRepository;
    @Override
    public String save(IPhoneDto request) {
        IPhone iPhone=new IPhone();
        iPhone.setId(request.getId());
        iPhone.setModelName(request.getModelName());
        iPhone.setPrice(request.getPrice());
        iPhoneRepository.save(iPhone);
        return "saved successfully";
    }
}
