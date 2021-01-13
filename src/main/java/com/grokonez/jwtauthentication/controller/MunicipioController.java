package com.grokonez.jwtauthentication.controller;

import java.util.List;

import com.grokonez.jwtauthentication.model.Pymes;
import com.grokonez.jwtauthentication.repository.MunicipioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@CrossOrigin()
@RestController
@RequestMapping("/api")
public class MunicipioController {
    
     @Autowired
    private MunicipioRepository municipioRepository;

    @GetMapping("/municipios")
    public List<Pymes> getPymes(
            @RequestParam(value="entidad") String entidad
            )
    {
        return municipioRepository.findEstadoByEntidad(entidad);
    }
    
}