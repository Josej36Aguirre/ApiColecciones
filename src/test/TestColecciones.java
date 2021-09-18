package test;

import java.util.*;
import javafx.beans.binding.StringBinding;

public class TestColecciones {

    public static void main(String[] args) {
        StringBuilder data = new  StringBuilder();
        data.append("Domingo");
//        data.append("\n");
//        data.append("Lunes");
//        data.append("\n");
//        data.append("Septiembre");
        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        miLista.add("Domingo");
        miLista.add(2);
//        imprimir(miLista);
        Set miset = new HashSet();
        miset.add("Lunes");
        miset.add("Martes");
        miset.add("Miercoles");
        miset.add("Jueves");
        miset.add("Viernes");
        miset.add("Sabado");
        miset.add("Domingo");
        miset.add("Domingo");
        miset.add("domingo");
        miset.add(3);
        miset.add(data);
        
        imprimir(miset);

    Map miMapa = new HashMap();
    miMapa.put("valor1", "Jose");
    miMapa.put("valor2", "Neyda");
    miMapa.put("valor3", "Ana");
    
//    String elemento = (String) miMapa.get("valor1");
//        System.out.println("elemento = " + elemento);
//        
//        imprimir(miMapa.keySet());
//        imprimir(miMapa.values());
    }

    public static void imprimir(Collection colection) {
//        for (Object eleObject : colection) {
//            System.out.println("Dias forecha: " + eleObject);
//        }
        colection.forEach((eleObject) -> {
            System.out.println("Dias forecha: " + eleObject);
        });

    }
}
