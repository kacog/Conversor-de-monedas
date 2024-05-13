package com.aluracursos.conversorDeMonedas.modelos;

import com.aluracursos.conversorDeMonedas.modelos.Menu;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SeleccionarMoneda {
    private final Scanner scanner = new Scanner(System.in);
    private final CalcularMoneda calcularMoneda = new CalcularMoneda();
    private final Menu menu = new Menu();
    private final HistorialDeMonedas historial=new HistorialDeMonedas();

    public void seleccionar() {
        int opcion=0;
        menu.usarMenu();

        do {
            try{
                opcion = scanner.nextInt();

            } catch (InputMismatchException e){
                System.out.println("Error: Por favor, ingresa un número válido.");
                scanner.next();
                continue;
            }

            switch (opcion) {

                case 0:
                    Menu salida = new Menu();
                    System.out.println(salida.getSalida());
                    break;
                case 1:
                    convertirMoneda("USD", "Dólar", "ARS", "Peso argentino");
                    break;
                case 2:
                    convertirMoneda("ARS", "Peso argentino", "USD", "Dólar");
                    break;
                case 3:
                    convertirMoneda("USD", "Dólar", "BRL", "Real brasileño");
                    break;
                case 4:
                    convertirMoneda("BRL", "Real brasileño", "USD", "Dólar");
                    break;
                case 5:
                    convertirMoneda("USD", "Dólar", "COP", "Peso colombiano");
                    break;
                case 6:
                    convertirMoneda("COP", "Peso colombiano", "USD", "Dólar");
                    break;
                case 7:
                    convertirMoneda("USD", "Dólar", "EUR", "Euro");
                    break;
                case 8:
                    convertirMoneda("EUR", "Euro", "USD", "Dólar");
                    break;
                case 9:
                    mostrarHistorial();
                    break;

                // Números diferentes
                default:
                    System.out.println("Por favor, ingresa una opción válida");
            }

        }
        while (opcion != 0);
        scanner.close();
    }

        private void convertirMoneda(String monedaBase,
                                     String nombreMonedaBase,
                                     String monedaAConvertir,
                                     String nombreDeMonedaAConvertir) {
        double valorConvertido=calcularMoneda.calcularMoneda(monedaBase,nombreMonedaBase,monedaAConvertir,nombreDeMonedaAConvertir);

            //System.out.println("Valor convertido:"+valorConvertido);
        // Agregar la conversión al historial junto con el valor convertido

        String conversion = "Valor convertido de" + nombreMonedaBase + " a " + nombreDeMonedaAConvertir + ": "+valorConvertido+"   "+monedaBase+" ----->"+monedaAConvertir;
        historial.agregarConversion(conversion);
    }

        private void mostrarHistorial(){
        historial.mostrarHistorial();
        }
    }








