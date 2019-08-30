package com.acme.controller;

import com.acme.businessService.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.UnknownHostException;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class BasicController {

    @Autowired
    private BasicService basicService;

    @GetMapping(value = "/data")
    public String getData() throws UnknownHostException {
        return basicService.getData();
    }
}