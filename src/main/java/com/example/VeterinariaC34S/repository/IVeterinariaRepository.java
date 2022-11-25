package com.example.VeterinariaC34S.repository;

import com.example.VeterinariaC34S.entity.Mascota;
import com.example.VeterinariaC34S.entity.Veterinaria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Set;
@Repository
public interface IVeterinariaRepository extends JpaRepository<Veterinaria, Long> {
    @Query("SELECT v.mascotas FROM Veterinaria v WHERE v.id = ?1")
    Set<Mascota> findAllMascotas(Long id);
}
