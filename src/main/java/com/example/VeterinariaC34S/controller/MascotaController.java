package com.example.VeterinariaC34S.controller;

import com.example.VeterinariaC34S.dto.MascotaDTO;
import com.example.VeterinariaC34S.entity.Mascota;
import com.example.VeterinariaC34S.repository.IMascotaRepository;
import com.example.VeterinariaC34S.service.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/mascotas")
public class MascotaController {

    @Autowired
    private IMascotaService mascotaService;


    @GetMapping("/perros")
    public ResponseEntity<List<MascotaDTO>> obtenerPerros(){
        return new ResponseEntity<>(mascotaService.findAllDogs(), HttpStatus.OK);
    }
    @GetMapping("/all")
    public ResponseEntity<List<MascotaDTO>> listar(){
        return new ResponseEntity<>(mascotaService.listar(),HttpStatus.OK);
    }
    @PostMapping("/crear")
    public ResponseEntity<Mascota> crearMascota(@RequestBody MascotaDTO mascota){
        return new ResponseEntity<>(mascotaService.crearMascota(mascota), HttpStatus.CREATED);
    }

}
