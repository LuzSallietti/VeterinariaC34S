package com.example.VeterinariaC34S.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//anotacion que nos sirve para indicarle a Jackson, que ignore el resto de atributos que tiene la entidad y que no están en el DTO.
@JsonIgnoreProperties(ignoreUnknown = true)
public class MascotaDTO {
    private String nombre;
    private String tipo;
    private Long veterinaria_id;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Long getVeterinaria_id() {
        return veterinaria_id;
    }

    public void setVeterinaria_id(Long veterinaria_id) {
        this.veterinaria_id = veterinaria_id;
    }
}
