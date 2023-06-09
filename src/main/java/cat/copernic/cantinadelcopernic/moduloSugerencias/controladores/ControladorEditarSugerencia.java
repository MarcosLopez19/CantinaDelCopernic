/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.cantinadelcopernic.moduloSugerencias.controladores;

import cat.copernic.cantinadelcopernic.DAO.SugerenciaDAO;
import cat.copernic.cantinadelcopernic.modelo.Profesor;
import cat.copernic.cantinadelcopernic.modelo.Sugerencia;
import cat.copernic.cantinadelcopernic.moduloRRHH.servicios.ProfesorService;
import cat.copernic.cantinadelcopernic.moduloSugerencias.servicios.SugerenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author andre
 */
@Controller
public class ControladorEditarSugerencia {

    @Autowired
    private SugerenciaService sugerenciaService;
    
    @GetMapping("/editarSuggeriment/{idSugerencia}")
    public String inici(Sugerencia sugerencia, Model model) {

        /*var sugerencia = new Sugerencia();
        sugerencia.setTitulo("titulo sugerencia");
        sugerencia.setDescripcion("descripción sugerencia");*/
 /*var sugerenciaX = SugerenciaDao.findById(4);
        
        var sugerencia2X = sugerenciaX.get();
        
        model.addAttribute("sugerencia", sugerencia2X);*/
        model.addAttribute("sugerencia", sugerenciaService.buscarSugerencia(sugerencia));

        var titulo = "EDITAR SUGGERIMENT";
        var tituloSugerencia = "Titul del suggeriment:";
        var descripcionSugerencia = "Descripció del suggeriment:";

        model.addAttribute("titulo", titulo);

        model.addAttribute("tituloSugerencia", tituloSugerencia);

        model.addAttribute("descripcionSugerencia", descripcionSugerencia);

        return "/paginasSugerencias/editarSugerencia";
    }
    
}
