package org.application.controller;


import lombok.AllArgsConstructor;
import org.application.dto.IPhoneDto;
import org.application.service.IPhoneService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class IPhoneController {
@Autowired
      IPhoneService iPhoneService;

   /* @Autowired

    public IPhoneController(IPhoneService iPhoneService) {
        this.iPhoneService = iPhoneService;
    }*/

    @PostMapping("/save-iPhone")
    public String saveIPhone(@RequestBody IPhoneDto request){
        return iPhoneService.save(request);

    }
}
