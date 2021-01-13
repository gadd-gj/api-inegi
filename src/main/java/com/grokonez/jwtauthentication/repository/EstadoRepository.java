package com.grokonez.jwtauthentication.repository;

import com.grokonez.jwtauthentication.model.Estado;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {
    
    @Query(
      value = "SELECT NEW com.grokonez.jwtauthentication.model.Estado(E.idestado, E.estado) FROM Estado E ORDER BY E.estado ASC"
    )
    
    List<Estado> showAll();
    
}