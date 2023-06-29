package com.ji.hash.controller;


import com.ji.hash.entity.JwtRequest;
import com.ji.hash.entity.JwtResponse;
import com.ji.hash.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class JwtController {

    @Autowired
    private JwtService jwtService;

    @PostMapping({"/authenticate"})
    public JwtResponse createJwtToken(@RequestBody JwtRequest jwtRequest)throws Exception{

        return jwtService.createJwtToken(jwtRequest);

    }
}
