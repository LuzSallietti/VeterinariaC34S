package com.example.VeterinariaC34S.service.implementation;

import com.example.VeterinariaC34S.dto.MascotaDTO;
import com.example.VeterinariaC34S.entity.Mascota;
import com.example.VeterinariaC34S.entity.Veterinaria;
import com.example.VeterinariaC34S.repository.IMascotaRepository;
import com.example.VeterinariaC34S.repository.IVeterinariaRepository;
import com.example.VeterinariaC34S.service.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MascotaService implements IMascotaService {

    @Autowired
    private IMascotaRepository mascotaRepository;
    @Autowired
    private IVeterinariaRepository veterinariaRepository;

    @Override
    public Mascota crearMascota(MascotaDTO mascotaDTO) {
        //creo la mascota con el constructor vacío y seteo
        Mascota mascota = new Mascota();
        mascota.setNombre(mascotaDTO.getNombre());
        mascota.setTipo(mascotaDTO.getTipo());
        //por el DTO de mascota mando veterinaria_id, busco ese id en Veterinaria y so existe, las aigno en la relacion
        Optional <Veterinaria> veterinariaOptional =
                veterinariaRepository.findById(mascotaDTO.getVeterinaria_id());
        if(veterinariaOptional.isPresent()){
            mascota.setVeterinaria(veterinariaOptional.get());
        }
        return mascotaRepository.save(mascota);
    }

    @Override
    public List<MascotaDTO> findAllDogs() {
        List <Mascota> mascotaList = mascotaRepository.findAllDogs("perro");
        List <MascotaDTO> perrosList = new ArrayList<>();

        for (Mascota mascota : mascotaList) {
            MascotaDTO perro = new MascotaDTO();
            perro.setNombre(mascota.getNombre());
            perro.setTipo(mascota.getTipo());
            perro.setVeterinaria_id(mascota.getVeterinaria().getId());
            perrosList.add(perro);
        }

        return perrosList;
    }
    public List<MascotaDTO> listar(){
        List <Mascota> mascotaList = mascotaRepository.findAll();
        List <MascotaDTO> mascotasDTOList = new ArrayList<>();

        for (Mascota mascota : mascotaList) {
            MascotaDTO mascotaDTO = new MascotaDTO();
            mascotaDTO.setNombre(mascota.getNombre());
            mascotaDTO.setTipo(mascota.getTipo());
            mascotaDTO.setVeterinaria_id(mascota.getVeterinaria().getId());
            mascotasDTOList.add(mascotaDTO);
        }
        return mascotasDTOList;
    }
}
