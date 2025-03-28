package main.java.com.edu.escuelaing.calculadorSearch.modelo;

import java.util.ArrayList;
import java.util.List;

public class ParametrosDTO {
    private List<Integer> lista;
    private int value;

    public ParametrosDTO(int value, List<Integer> lista) {
        this.value = value;
        this.lista = lista;
    }

    public ParametrosDTO() {
        this.lista = new ArrayList<>();
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setLista(List<Integer> lista) {
        this.lista = lista;
    }

    public int getValue() {
        return value;
    }

    public List<Integer> getLista() {
        return lista;
    }
}
