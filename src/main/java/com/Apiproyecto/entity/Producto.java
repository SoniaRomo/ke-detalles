/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Apiproyecto.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "producto")
@Table(name = "producto")

public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "codproducto")
    private Integer codigo;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "precio")
    private double precio;
    @Column(name = "marca")
    private String marca;
    @Column(name = "cantidad")
    private int cantidad;
    @Column(name = "activo")
    private boolean activo;

}


