package com.example.zy6r_4E_Paloma_DelRio_cc7.repository;

import com.example.zy6r_4E_Paloma_DelRio_cc7.model.Videojuego;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideojuegoRepo extends JpaRepository<Videojuego, Long> {
}
