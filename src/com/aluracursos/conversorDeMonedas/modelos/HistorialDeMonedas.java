package com.aluracursos.conversorDeMonedas.modelos;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class HistorialDeMonedas {

        private List<String> conversiones;
        private List<LocalDateTime> registros;
        private DateTimeFormatter formato;


        public HistorialDeMonedas(){
            this.conversiones= new ArrayList<>();
            this.registros= new ArrayList<>();
            this.formato=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        }

        public void agregarConversion(String conversion){
            LocalDateTime registro= LocalDateTime.now();
            this.conversiones.add(conversion);
            registros.add(registro);

        }

        public void mostrarHistorial(){
            System.out.println("Historial de conversiones: ");
            for (int i=0; i<conversiones.size();i++){
                String formatoFecha=registros.get(i).format(formato);
                System.out.println((i+1)+ ". "+ conversiones.get(i)+"- Registro: "+ formatoFecha);
            }
        }
}
