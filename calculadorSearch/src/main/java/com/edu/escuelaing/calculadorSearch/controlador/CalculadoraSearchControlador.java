package main.java.com.edu.escuelaing.calculadorSearch.controlador;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import main.java.com.edu.escuelaing.calculadorSearch.modelo.ParametrosDTO;

@RestController
public class CalculadoraSearchControlador {

    @GetMapping("/linealSearch")
    public int calcularLineal(@RequestParam ParametrosDTO parametrosDTO) {
        int valor = parametrosDTO.getValue();
        List<Integer> lista = parametrosDTO.getLista();
        int respuesta = -1;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals(valor)) {
                respuesta = i; 
                break;
            }
        }
        return respuesta;
    }

    @GetMapping("/binarySearch")
    public int calcularBinario(@RequestParam ParametrosDTO parametrosDTO) {
        int valor = parametrosDTO.getValue();
        List<Integer> lista = parametrosDTO.getLista();
        return calculaBinario(lista, valor);
    }

    private int calculaBinario(List<Integer> lista, int valor) {
        int inicio = 0;
        int fin = lista.size() - 1;
        while (inicio <= fin) { 
            int medio = (inicio + fin) / 2;
            if (lista.get(medio).equals(valor)) {
                return medio;
            } else if (valor < lista.get(medio)) {
                fin = medio - 1;
            } else {
                inicio = medio + 1;
            }
        }
        return -1; 
    }
}
