package org.n4iken.dzclase2.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/calculadora")
@Tag(name = "Calculadora REST API", description = "Operaciones aritmeticas basicas")
public class CalculadoraController {

    @GetMapping("/suma")
    public ResponseEntity<Double> suma(@RequestParam double a, @RequestParam double b) {
        return ResponseEntity.ok(a + b);
    }
    @GetMapping("/resta")
    public ResponseEntity<Double> resta (@RequestParam double a, @RequestParam double b) {
        return ResponseEntity.ok(a - b);
    }
    @GetMapping("/multiplicacion")
    public ResponseEntity<Double> multiplicacion(@RequestParam double a, @RequestParam double b) {
        return ResponseEntity.ok(a * b);
    }

    @GetMapping("/division")
    public ResponseEntity<?> division(@RequestParam double a, @RequestParam double b){
        if (b == 0) {
            return ResponseEntity
                    .badRequest()
                    .body("No se puede dividir entre 0!!");
        }
        return ResponseEntity.ok(a / b);
    }
}
