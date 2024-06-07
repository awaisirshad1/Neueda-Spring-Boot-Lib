package com.Neueda.Library.controller;

import com.Neueda.Library.model.CD;
import com.Neueda.Library.repository.CDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(value = "true")
public class CDController {

    @Autowired
    CDRepository cdRepository;
    @GetMapping("CDs")
    public List<CD> getCDs(){
        return cdRepository.findAll();
    }
}
