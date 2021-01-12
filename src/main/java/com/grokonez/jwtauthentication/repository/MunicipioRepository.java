package com.grokonez.jwtauthentication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.grokonez.jwtauthentication.model.Pymes;

@Repository
public interface MunicipioRepository extends JpaRepository<Pymes, Long>{
    @Query(
      value = "SELECT NEW com.grokonez.jwtauthentication.model.Pymes(P.localidad) FROM Pymes P WHERE P.entidad = ?1 GROUP BY P.localidad"
    )
    
    List<Pymes> findEstadoByEntidad(String entidad);
}
