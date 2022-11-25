package com.example.VeterinariaC34S.controller;

import com.example.VeterinariaC34S.entity.Veterinaria;
import com.example.VeterinariaC34S.repository.IVeterinariaRepository;
import com.example.VeterinariaC34S.service.IVeterinariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/veterinaria")
public class VeterinariaController {

    @Autowired
    private IVeterinariaService veterinariaService;

    @PostMapping("/crear")
    public ResponseEntity<?> crearVeterinaria(@RequestBody Veterinaria veterinaria){
        veterinariaService.saveVeterinaria(veterinaria);
        return ResponseEntity.ok(HttpStatus.OK);
    }



}
