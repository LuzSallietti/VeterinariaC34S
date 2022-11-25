package com.example.VeterinariaC34S.entity;

import javax.persistence.*;
@Entity
@Table
public class Mascota {
    @Id
    //@SequenceGenerator(name = "mascota_sequence", sequenceName = "mascota_sequence", allocationSize = 0)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String tipo;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "veterinaria_id", nullable = false)
    private Veterinaria veterinaria;

    public Mascota(){
    }

    public Mascota(Long id, String nombre, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
    }

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

    public Veterinaria getVeterinaria() {
        return veterinaria;
    }

    public void setVeterinaria(Veterinaria veterinaria) {
        this.veterinaria = veterinaria;
    }

    public Long getId() {
        return id;
    }
}
