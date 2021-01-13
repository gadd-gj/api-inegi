package com.grokonez.jwtauthentication.controller;

import com.grokonez.jwtauthentication.model.Estado;
import com.grokonez.jwtauthentication.repository.EstadoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

// @CrossOrigin(origins = "*", maxAge = 3600)
@CrossOrigin()
@RestController
@RequestMapping("/api")
public class EstadoController {

    @Autowired
    private EstadoRepository estadoRepository;

    @GetMapping("/estados")
    //Protegues la api y validas el role
    //@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public List<Estado> getEstados() {
        return estadoRepository.showAll();
    }
  
    
}