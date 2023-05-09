package com.trainadvisor.app.rest.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Table(name = "valoraciones")
@Data
@AllArgsConstructor @NoArgsConstructor @Builder
public class Valoracion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String origen;

    private String destino;

    private String compania;

    private String servicio;

    @JsonFormat(pattern = "dd-MM-yyyy")
    @Temporal(TemporalType.DATE)
    private Date fecha;

    private String horaSalida;

    private String horaLlegada;

    private int puntuacion;

    private String comentario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuarios_id")
    private Usuario usuario;

}
