package com.example.VeterinariaC34S.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
@Table
public class Veterinaria {
    @Id
    //@SequenceGenerator(name = "veterinaria_sequence", sequenceName = "veterinaria_sequence", allocationSize = 0)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private int costo;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "veterinaria")
    @JsonIgnore
    private Set<Mascota> mascotas = new HashSet<>();

    public Veterinaria(){
    }

    public Veterinaria(Long id, String nombre, int costo) {
        this.id = id;
        this.nombre = nombre;
        this.costo = costo;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCosto() {
        return costo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
}

