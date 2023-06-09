/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.cantinadelcopernic.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import lombok.Data;

@Data
@Entity
@Table(name = "deuda")
public class Deuda implements Serializable{
    
    private static final long serialVersionUID = 1L; 
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iddeuda")
    private int idDeuda;
    
    @Column(name = "fecha")
    private LocalDate fechaDeLaDeuda;
    
    @Column(name = "cantidad")
    private float cantidad;
    
    @ManyToOne()
    @JoinColumn(name = "usuarios_correo")
    private Profesor profesor;

}

