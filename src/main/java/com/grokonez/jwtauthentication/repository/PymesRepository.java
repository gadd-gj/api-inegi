package com.grokonez.jwtauthentication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.grokonez.jwtauthentication.model.Pymes;

@Repository
public interface PymesRepository extends JpaRepository<Pymes, Long>{
    @Query(
      value = "SELECT NEW com.grokonez.jwtauthentication.model.Pymes(P.id,P.nom_estab, P.raz_social, P.codigo_act, P.nombre_act, P.per_ocu, P.tipo_vial, P.nom_vial, P.tipo_v_e_1, P.nom_v_e_1, P.tipo_v_e_2, P.nom_v_e_2, P.tipo_v_e_3, P.nom_v_e_3, P.numero_ext, P.letra_ext, P.edificio, P.edificio_e, P.numero_int, P.letra_int, P.tipo_asent, P.nomb_asent, P.tipoCenCom, P.nom_CenCom, P.num_local, P.cod_postal, P.cve_ent, P.entidad, P.cve_mun, P.municipio, P.cve_loc, P.localidad, P.ageb, P.manzana, P.telefono, P.correoelec, P.www, P.tipoUniEco, P.latitud, P.longitud, P.fecha_alta) FROM Pymes P WHERE P.entidad = ?1 AND localidad = ?2"
    )
    
    List<Pymes> findPymesByEntidadLocalidad(String estado, String municipio);

    
}
