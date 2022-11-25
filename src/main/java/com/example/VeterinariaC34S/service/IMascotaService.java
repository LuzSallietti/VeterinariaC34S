package com.example.VeterinariaC34S.service;

import com.example.VeterinariaC34S.dto.MascotaDTO;
import com.example.VeterinariaC34S.entity.Mascota;

import java.util.List;
import java.util.Set;

public interface IMascotaService {

    Mascota crearMascota(MascotaDTO mascota);
    List<MascotaDTO> findAllDogs();

    List<MascotaDTO> listar();
}
