package com.example.VeterinariaC34S.service;

import com.example.VeterinariaC34S.entity.Mascota;
import com.example.VeterinariaC34S.entity.Veterinaria;
import com.example.VeterinariaC34S.repository.IMascotaRepository;

import java.util.List;
import java.util.Set;

public interface IVeterinariaService {
    Veterinaria saveVeterinaria(Veterinaria veterinaria);
    Mascota saveMascotaVeterinaria(Mascota mascota, Long id);
    Set<Mascota> findAllMascotas(Long id);
}
