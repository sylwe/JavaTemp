package com.swlodyga.JavaTemp.controller;

import com.swlodyga.JavaTemp.database.TemperaturesRepository;
import com.swlodyga.JavaTemp.model.Temperatures;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
public class MvcController {

    @RequestMapping("/")
    public String hello(){
        return "Hello Word";
    }

    @RequestMapping("/user*")
    public String user(){
        return "User id";
    }
    @RequestMapping("/admin*")
    public String admin(){
        return "Admin id";
    }

    @Autowired
    private TemperaturesRepository temperaturesRepository;

    @GetMapping("/rest/temp/getall")
    public Page<Temperatures> getTemp(Pageable pageable){
        return temperaturesRepository.findAll(pageable);
    }

    @GetMapping("/rest/temp/{id}")
    public Optional<Temperatures> getTemp(@PathVariable Long id){
        return temperaturesRepository.findById(id);
    }

    @PostMapping("/rest/temp")
    public Temperatures createTemp(@RequestBody Temperatures createTemp)throws Exception{
        return temperaturesRepository.save(createTemp);
    }


}
