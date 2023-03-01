/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.cantinadelcopernic.moduloTareas.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Enric
 */
@Controller
public class ControladorHorarioTareas {

    @GetMapping("/horarioTareas")
    public String inici(Model model) {
        model.addAttribute("crearTurnoLimpiezaWord", "Crear torn de neteja");
        model.addAttribute("lunesWord", "Dilluns");
        model.addAttribute("martesWord", "Dimarts");
        model.addAttribute("miercolesWord", "Dimecres");
        model.addAttribute("juevesWord", "Dijous");
        model.addAttribute("viernesWord", "Divendres");
        model.addAttribute("sabadoWord", "Dissabte");
        model.addAttribute("domingoWord", "Diumenge");
        model.addAttribute("horarioWord", "Horari");
        
        model.addAttribute("listaTareasWord", "Llista de tasques");
        model.addAttribute("crearTareaWord", "Crear tasca");
        
        return "/paginasTareas/horarioTareas";
    }
}