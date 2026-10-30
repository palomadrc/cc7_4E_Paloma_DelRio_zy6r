package com.example.zy6r_4E_Paloma_DelRio_cc7.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Videojuego {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nombreSolicitante;

    @Column
    private Date fechaPrestamo;

    @Column
    private Date fechaDevolucion;

    @Column
    private Estado estado;

    @JoinColumn
    @ManyToOne("")
    private String videojuego;

}



