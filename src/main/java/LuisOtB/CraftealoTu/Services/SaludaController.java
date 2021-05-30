package LuisOtB.CraftealoTu.Services;

import java.text.MessageFormat;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class SaludaController {
    @GetMapping("/saludame/{nombre}")
    public String saludame(@PathVariable String nombre) {
        return "Hola que tal " + nombre;
    }

    @GetMapping("/saluda")
    public String SaludaPorQuery(@RequestParam String nombre, @RequestParam String apellidos) {
        // return "Hola que tal estás" + nombre + " " + apellidos;
        Object params[] = { nombre, apellidos };
        return MessageFormat.format("Qué tal estás {0} {1}", params);
    }

    @PostMapping("/guardar")
    public String Guardar(@RequestParam Map<String, String> body) {
        // Normalmente aquí guardamos algo en el sistema
        return "Datos enviados: " + body.get("nombre") + " y la edad: " + body.get("edad");
    }

}