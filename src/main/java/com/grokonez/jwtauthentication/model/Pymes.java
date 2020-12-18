package com.grokonez.jwtauthentication.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Entity
@Table(name = "pymes", uniqueConstraints = { })
public class Pymes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idpyme;
    
    @Size(max = 7)
    private Long id;
    
    @Size(max = 150)
    private String nom_estab;
    
    @Size(max = 150)
    private String raz_social;

    @Size(max = 6)
    private String codigo_act;
    
    @Size(max = 250)
    private String nombre_act;
    
    @Size(max = 40)
    private String per_ocu;

    @Size(max = 40)
    private String tipo_vial; 
    
    @Size(max = 130)
    private String nom_vial;
    
    @Size(max = 40)
    private String tipo_v_e_1;
    
    @Size(max = 130)
    private String nom_v_e_1;
    
    @Size(max = 40)
    private String tipo_v_e_2;
    
    @Size(max = 130)
    private String nom_v_e_2;
    
    @Size(max = 40)
    private String tipo_v_e_3;
    
    @Size(max = 130)
    private String nom_v_e_3;
    
    @Size(max = 7)
    private Long numero_ext;
    
    @Size(max = 55)
    private String letra_ext;
    
    @Size(max = 55)
    private String edificio;
    
    @Size(max = 55)
    private String edificio_e;
    
    @Size(max = 7)
    private Long numero_int;
    
    @Size(max = 55)
    private String letra_int;
    
    @Size(max = 40)
    private String tipo_asent;
    
    @Size(max = 95)
    private String nomb_asent;
    
    @Size(max = 95)
    private String tipoCenCom;
    
    @Size(max = 95)
    private String nom_CenCom;
    
    @Size(max = 55)
    private String num_local;
    
    @Size(max = 5)
    private String cod_postal;
    
    @Size(max = 2)
    private String cve_ent;
    
    @Size(max = 40)
    private String entidad;
    
    @Size(max = 3)
    private String cve_mun; 
    
    @Size(max = 130)
    private String municipio;
    
    @Size(max = 4)
    private String cve_loc; 
    
    @Size(max = 130)
    private String localidad;
    
    @Size(max = 4)
    private String ageb; 
    
    @Size(max = 3)
    private String manzana;
    
    @Size(max = 40)
    private String telefono; 
    
    @Size(max = 95)
    private String correoelec;
    
    @Size(max = 95)
    private String www; 
    
    @Size(max = 8)
    private String tipoUniEco;
    
    @Size(max = 40)
    private Double latitud;
    
    @Size(max = 40)
    private Double longitud;
    
    @Size(max = 15)
    private String fecha_alta;


    public Pymes() {
    }
    
    public Pymes(String localidad) {
        this.localidad = localidad;
    }

    public Pymes(Long id ,String nom_estab, String raz_social, String codigo_act, String nombre_act, String per_ocu,String tipo_vial, String nom_vial, String tipo_v_e_1, String nom_v_e_1, String tipo_v_e_2, String nom_v_e_2, String tipo_v_e_3, String nom_v_e_3, Long numero_ext, String letra_ext, String edificio, String edificio_e, Long numero_int, String letra_int, String tipo_asent, String nomb_asent, String tipoCenCom, String nom_CenCom, String num_local, String cod_postal, String cve_ent, String entidad, String cve_mun, String municipio, String cve_loc, String localidad, String ageb, String manzana, String telefono, String correoelec, String www, String tipoUniEco, Double latitud, Double longitud, String fecha_alta) {
        this.id = id;
        this.nom_estab = nom_estab;
        this.raz_social = raz_social;
        this.codigo_act = codigo_act;
        this.nombre_act = nombre_act;
        this.per_ocu = per_ocu;
        this.tipo_vial = tipo_vial;
        this.nom_vial = nom_vial;
        this.tipo_v_e_1 = tipo_v_e_1;
        this.nom_v_e_1 = nom_v_e_1;
        this.tipo_v_e_2 = tipo_v_e_2;
        this.nom_v_e_2 = nom_v_e_2;
        this.tipo_v_e_3 = tipo_v_e_3;
        this.nom_v_e_3 = nom_v_e_3;
        this.numero_ext = numero_ext;
        this.letra_ext = letra_ext;
        this.edificio = edificio;
        this.edificio_e = edificio_e;
        this.numero_int = numero_int;
        this.letra_int = letra_int;
        this.tipo_asent = tipo_asent;
        this.nomb_asent = nomb_asent;
        this.tipoCenCom = tipoCenCom;
        this.nom_CenCom = nom_CenCom;
        this.num_local = num_local;
        this.cod_postal = cod_postal;
        this.cve_ent = cve_ent;
        this.entidad = entidad;
        this.cve_mun = cve_mun;
        this.municipio = municipio;
        this.cve_loc = cve_loc;
        this.localidad = localidad;
        this.ageb = ageb;
        this.manzana = manzana;
        this.telefono = telefono;
        this.correoelec = correoelec;
        this.www = www;
        this.tipoUniEco = tipoUniEco;
        this.latitud = latitud;
        this.longitud = longitud;
        this.fecha_alta = fecha_alta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom_estab() {
        return nom_estab;
    }

    public void setNom_estab(String nom_estab) {
        this.nom_estab = nom_estab;
    }

    public String getRaz_social() {
        return raz_social;
    }

    public void setRaz_social(String raz_social) {
        this.raz_social = raz_social;
    }

    public String getCodigo_act() {
        return codigo_act;
    }

    public void setCodigo_act(String codigo_act) {
        this.codigo_act = codigo_act;
    }

    public String getNombre_act() {
        return nombre_act;
    }

    public void setNombre_act(String nombre_act) {
        this.nombre_act = nombre_act;
    }

    public String getTipo_vial() {
        return tipo_vial;
    }

    public void setTipo_vial(String tipo_vial) {
        this.tipo_vial = tipo_vial;
    }

    public String getNom_vial() {
        return nom_vial;
    }

    public void setNom_vial(String nom_vial) {
        this.nom_vial = nom_vial;
    }

    public String getTipo_v_e_1() {
        return tipo_v_e_1;
    }

    public void setTipo_v_e_1(String tipo_v_e_1) {
        this.tipo_v_e_1 = tipo_v_e_1;
    }

    public String getNom_v_e_1() {
        return nom_v_e_1;
    }

    public void setNom_v_e_1(String nom_v_e_1) {
        this.nom_v_e_1 = nom_v_e_1;
    }

    public String getTipo_v_e_2() {
        return tipo_v_e_2;
    }

    public void setTipo_v_e_2(String tipo_v_e_2) {
        this.tipo_v_e_2 = tipo_v_e_2;
    }

    public String getNom_v_e_2() {
        return nom_v_e_2;
    }

    public void setNom_v_e_2(String nom_v_e_2) {
        this.nom_v_e_2 = nom_v_e_2;
    }

    public String getTipo_v_e_3() {
        return tipo_v_e_3;
    }

    public void setTipo_v_e_3(String tipo_v_e_3) {
        this.tipo_v_e_3 = tipo_v_e_3;
    }

    public String getNom_v_e_3() {
        return nom_v_e_3;
    }

    public void setNom_v_e_3(String nom_v_e_3) {
        this.nom_v_e_3 = nom_v_e_3;
    }

    public Long getNumero_ext() {
        return numero_ext;
    }

    public void setNumero_ext(Long numero_ext) {
        this.numero_ext = numero_ext;
    }

    public String getLetra_ext() {
        return letra_ext;
    }

    public void setLetra_ext(String letra_ext) {
        this.letra_ext = letra_ext;
    }

    public String getEdificio() {
        return edificio;
    }

    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }

    public String getEdificio_e() {
        return edificio_e;
    }

    public void setEdificio_e(String edificio_e) {
        this.edificio_e = edificio_e;
    }

    public Long getNumero_int() {
        return numero_int;
    }

    public void setNumero_int(Long numero_int) {
        this.numero_int = numero_int;
    }

    public String getLetra_int() {
        return letra_int;
    }

    public void setLetra_int(String letra_int) {
        this.letra_int = letra_int;
    }

    public String getTipo_asent() {
        return tipo_asent;
    }

    public void setTipo_asent(String tipo_asent) {
        this.tipo_asent = tipo_asent;
    }

    public String getNomb_asent() {
        return nomb_asent;
    }

    public void setNomb_asent(String nomb_asent) {
        this.nomb_asent = nomb_asent;
    }

    public String getTipoCenCom() {
        return tipoCenCom;
    }

    public void setTipoCenCom(String tipoCenCom) {
        this.tipoCenCom = tipoCenCom;
    }

    public String getNom_CenCom() {
        return nom_CenCom;
    }

    public void setNom_CenCom(String nom_CenCom) {
        this.nom_CenCom = nom_CenCom;
    }

    public String getNum_local() {
        return num_local;
    }

    public void setNum_local(String num_local) {
        this.num_local = num_local;
    }

    public String getCod_postal() {
        return cod_postal;
    }

    public void setCod_postal(String cod_postal) {
        this.cod_postal = cod_postal;
    }

    public String getCve_ent() {
        return cve_ent;
    }

    public void setCve_ent(String cve_ent) {
        this.cve_ent = cve_ent;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getCve_mun() {
        return cve_mun;
    }

    public void setCve_mun(String cve_mun) {
        this.cve_mun = cve_mun;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getCve_loc() {
        return cve_loc;
    }

    public void setCve_loc(String cve_loc) {
        this.cve_loc = cve_loc;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getAgeb() {
        return ageb;
    }

    public void setAgeb(String ageb) {
        this.ageb = ageb;
    }

    public String getManzana() {
        return manzana;
    }

    public void setManzana(String manzana) {
        this.manzana = manzana;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoelec() {
        return correoelec;
    }

    public void setCorreoelec(String correoelec) {
        this.correoelec = correoelec;
    }

    public String getWww() {
        return www;
    }

    public void setWww(String www) {
        this.www = www;
    }

    public String getTipoUniEco() {
        return tipoUniEco;
    }

    public void setTipoUniEco(String tipoUniEco) {
        this.tipoUniEco = tipoUniEco;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public String getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(String fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    public String getPer_ocu() {
        return per_ocu;
    }

    public void setPer_ocu(String per_ocu) {
        this.per_ocu = per_ocu;
    }

}
