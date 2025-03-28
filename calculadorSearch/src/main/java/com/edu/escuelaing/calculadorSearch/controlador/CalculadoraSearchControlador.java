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
        for(int i =0; i< lista.size();i++){
            if(lista.get(i).equals(valor)){
                respuesta = -1;
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

    private int calculaBinario(List<Integer> lista,int valor){
        int resultado = -2;
        int medio = lista.size()/2;
        int inicio = 0;
        int fin = lista.size();
        while(resultado == -2 || inicio == fin){
            if(inicio==fin){
                if(valor == lista.get(medio)){
                    resultado = medio;
                } else{
                    resultado = -1;
                }
            }
            else if(valor<lista.get(medio)){
                fin = medio;
                
                medio = medio/2;
            }else{
                int temp = medio;
                medio = fin/2;
                inicio = temp;
            }
            
        }
        return resultado;
    }
}
