package com.example.VeterinariaC34S.service.implementation;

import com.example.VeterinariaC34S.entity.Mascota;
import com.example.VeterinariaC34S.entity.Veterinaria;
import com.example.VeterinariaC34S.repository.IVeterinariaRepository;
import com.example.VeterinariaC34S.service.IVeterinariaService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class VeterinariaService implements IVeterinariaService {

    @Autowired
    private IVeterinariaRepository veterinariaRepository;

    @Override
    public Veterinaria saveVeterinaria(Veterinaria veterinaria) {
        return veterinariaRepository.save(veterinaria);
    }

    @Override
    public Mascota saveMascotaVeterinaria(Mascota mascota, Long id) {
        return null;
    }

    @Override
    public Set<Mascota> findAllMascotas(Long id) {
        return veterinariaRepository.findAllMascotas(id);
    }
}
