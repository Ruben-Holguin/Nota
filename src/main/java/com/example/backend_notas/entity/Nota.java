package com.example.backend_notas.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="notas")
public class Nota {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="nota1")
    private double nota1;
    @Column(name="nota2")
    private double nota2;
    @Column(name="nota3")
    private double nota3;
    @Column(name="promedio")
    private double promedio;

    
    @ManyToOne
    @JoinColumn(name="alumno_id", nullable = false)
    private Alumno alumno;
    @ManyToOne
    @JoinColumn(name="curso_id", nullable = false)
    private Curso curso;
}
