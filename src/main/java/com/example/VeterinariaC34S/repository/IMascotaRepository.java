package com.example.VeterinariaC34S.repository;

import com.example.VeterinariaC34S.entity.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;
@Repository
public interface IMascotaRepository extends JpaRepository<Mascota, Long> {
    @Query("SELECT m FROM Mascota m WHERE m.tipo = ?1")
    List<Mascota> findAllDogs(String tipo);
}
