package LuisOtB.CraftealoTu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import LuisOtB.CraftealoTu.Services.TraductorService;

@RestController
public class Funcionalidades {
 


    @RequestMapping("/")
    public String saludar() {
        return "Esta es tu primera página web backend";
    }

    @RequestMapping("/despidete")
    public String despidete() {
        return "Adios amigo";
    }

    @Autowired
    TraductorService traductorService;

    @GetMapping("/damepalabro/{word}")
    public String damepalabro() {
        String palabro = TraductorService.getTraduccion();
        return "Nueva palabra: " +palabro+ " a que mola eh" ;
    }
    
    @GetMapping("/contar/{palabra}")
    public String damepalabra(@PathVariable String palabra) {
        int contador1 = 0, contador2 = 0, consonantes;
        for (int i = 0; i < palabra.length(); i++) {
            contador1++;
        }
        for (int i = 0; i < palabra.length(); i++) {

            if (palabra.charAt(i) == 'a' || palabra.charAt(i) == 'e' || palabra.charAt(i) == 'i'
                    || palabra.charAt(i) == 'o' || palabra.charAt(i) == 'u') {

                contador2++;
            }
        }
        consonantes = contador1 - contador2;

        return "Consonantes: "+consonantes+ " Vocales: "+contador2;
    }
    @GetMapping("/modifica/{texto}")
    public String dametexto(@PathVariable String texto) {
        String ascii = "";
        for (int i = 0; i < texto.length(); i++) {
          ascii += "<br>" + (int) texto.charAt(i)  +texto.charAt(i);
        }
        return "La traduccion a asci es: " +ascii;
      }
       
  }



