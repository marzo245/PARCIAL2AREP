package main.java.com.edu.escuelaing.calculadorSearch.modelo;

import javax.management.ListenerNotFoundException;
import java.util.*;

public class ParametrosDTO {
    public List<Integer> lista = new ArrayList<Integer>();
    public int value;

    public void parametrosDTO(int value,List<Integer> lista){
        this.value= value;
        this.lista = lista;
    }
    public void parametroDTO(){

    }
    public void setValue(int value){
        this.value= value;
    }

    public void setLista(List<Integer> lista){
        this.lista = lista;
    }

    public int getValue(){
        return value;
    }

    public List<Integer> getLista(){
        return lista;
    }
}
