package com.aluracursos.conversorDeMonedas.modelos;

public class Menu {
    //Generacion de variables para contenido de menú

    private String subMenu = """
            *****************************************************************
                     <     \uD83D\uDCB1Conversor de Moneda\uD83D\uDCB1    >
            *****************************************************************
            
                        Sean bienvenid@s a la app de conversión de monedas
            Instrucciones:
            
            A. Elegir una opción para convertir (1 a 8)
            B. Ingresar un valor a convertir
            C. Para salir del sistema presiona cero (0)
            D. Historial de conversiones (9)
            
            ************************************************************************
            
            1   -   Dólar [$USD]            ====>   peso argentino [$ARS]
            
            2   -   Peso argentino [$ARS]   ====>   Dólar [$USD]
            
            3   -   Dólar [$USD]            ====>   Real brasileño [$BRL]
            
            4   -   Real brasileño [$BRL]   ====>   Dólar [$USD]
            
            5   -   Dólar [$USD]            ====>   Peso colombiano [$COP]
            
            6   -   Peso colombiano [$COP]  ====>   Dólar [$USD]
            
            7   -   Dólar  [$USD]           ====>   Euro [€ EUR]
            
            8   -   Euro [€ EUR]            ====>   Dólar  [$USD] 
            
            
            **************************************************************************
            """;
    private String salida = """
            **************************************************************************
            *************   ¡Muchas gracias por utilizar nuestro conversor!  *********
            ***************************  ¡Hasta pronto!💸  ***************************
            """;
    public void usarMenu(){
        System.out.println(subMenu);
        System.out.println("Escoja una opción \uD83D\uDCB1: ");
    }
    //Getters and Setters de variables involucradas

    public String getSubMenu() {
        return subMenu;
    }

    public void setSubMenu(String subMenu) {
        this.subMenu = subMenu;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }
}