/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cat.copernic.cantinadelcopernic.DAO;



import cat.copernic.cantinadelcopernic.modelo.Sugerencia;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 *
 * @author andre
 */
public interface SugerenciaDAO extends JpaRepository<Sugerencia,Integer>{
    
     
}
