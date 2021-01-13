package com.grokonez.jwtauthentication.controller;
import java.util.List;

import com.grokonez.jwtauthentication.model.Pymes;
import com.grokonez.jwtauthentication.repository.PymesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

// @CrossOrigin(origins = "*", maxAge = 3600)
@CrossOrigin()
@RestController
@RequestMapping("/api")
public class PymesController {
    @Autowired
    private PymesRepository pymesRepository;

    @GetMapping("/pymes")
    public List<Pymes> getPymes(
            @RequestParam(value="estado") String estado,
            @RequestParam(value="municipio") String municipio
            )
    {
        return pymesRepository.findPymesByEntidadLocalidad(estado,municipio);
    }
}