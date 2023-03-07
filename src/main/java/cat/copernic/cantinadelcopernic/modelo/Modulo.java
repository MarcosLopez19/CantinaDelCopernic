/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.cantinadelcopernic.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author andre
 */
@Data
@Entity
@Table(name = "modulos")
public class Modulo implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "idmodulos")
    private int idModulo;
    
    @Column(name = "nombre_modulo")
    private String nombreModulo;
    
    @Column(name = "visible_cliente")
    private boolean visibleCliente;
    
    @Column(name = "visible"
            + "_alumno")
    private boolean visibleAlumno;
    
    @Column(name = "habilitado")
    private boolean habilitado;
}
