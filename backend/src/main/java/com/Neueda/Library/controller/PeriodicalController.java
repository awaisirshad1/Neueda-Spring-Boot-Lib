package com.Neueda.Library.controller;

import com.Neueda.Library.model.Book;
import com.Neueda.Library.model.Periodical;
import com.Neueda.Library.repository.PeriodicalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@CrossOrigin(value = "true")
public class PeriodicalController {
    @Autowired
    private PeriodicalRepository periodicalRepository;

    @GetMapping("/periodicals")
    public List<Periodical> getPeriodicals(){
        return periodicalRepository.findAll();
    }

    @GetMapping("/periodicals/{id}")
    public Periodical retrievePeriodical(@PathVariable long id) {
        //return todoService.findById(id);
        return periodicalRepository.findById(id).get();
    }
    
     @DeleteMapping("/periodicals/{id}")
    public ResponseEntity<Void> borrowPeriodical(@PathVariable long id) {
        periodicalRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/periodicals")
    public Periodical returnPeriodical(@RequestBody Periodical periodical) {
        periodical.setId(null);
        return periodicalRepository.save(periodical);
    }
}

