package com.prova.eliel.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String nome;
    String cargaHoraria;
    String matricula;

    //======================================================================

    public Curso() {
    }

    //======================================================================

    public String getNome() {
        return nome;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public String getMatricula() {
        return matricula;
    }

    //======================================================================

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
