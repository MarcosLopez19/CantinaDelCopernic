package cat.copernic.cantinadelcopernic.DAO;


import cat.copernic.cantinadelcopernic.modelo.Pedido;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author fta
 */

/*Interface DAO necessaria per intercanviar les dades entre la capa de presentació i le capa de dades
 *mitjançant les funcions bàsiques CRUD d'accés a les BBDD.
 *Les interfaces d'aquest tipus extenen de la interface genèrica CrudRepository, que el que fa és insertar
 *de manera automàtica les funcions CRUD, és a dir, insertar, modificar, eliminar i consultar dades, d'aquesta
 *manera no cal implementar la interface DAO.
*/

/*Els tipus de classes que en el nostre cas utilitza CrudRepository són Gos i Long, Gos fa refèrencia a 
 *la classe que defineix l'entitat amb la que treballarem i Integer el tipus de l'atribut que defineix la clau 
 *primaria d'aquesta entitat.
*/
    

public interface PedidoDAO extends CrudRepository<Pedido,Integer>{ 
    
    //Aqui podrem afegir altres mètodes que necessitem i que no estiguin definits a la interface CrudRepository,
    //com el següent mètode, findByNom que retornarà els gossos amb el nom passat per paràmetre

}