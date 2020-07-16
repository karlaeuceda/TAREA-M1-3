

import java.util.Scanner;

public class HERENCIA {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double wlado, walt, wbas, wrad, wlar;
        
        System.out.print("Lado del Cuadrado.......:");
        wlado=entrada.nextDouble();
        System.out.print("Base del Triangulo.......:");
        wbas=entrada.nextDouble();
        System.out.print("Altura del Triangulo.......:");
        walt=entrada.nextDouble();
        System.out.print("Radio del Circulo.......:");
        wrad=entrada.nextDouble();
        System.out.print("Largo de la Lineas.......:");
        wlar=entrada.nextDouble();
        
        CUADRADO objcuad = new CUADRADO(wlado);
        Triangulo objtrian = new Triangulo(wbas, walt);
        Circulo objcir = new Circulo(wrad);
        Lineas objlinea = new Lineas(wlar);    
        objcuad.setarea();
        objcuad.dibujar();
        objtrian.setarea();
        objtrian.dibujar();
        objcir.setarea();
        objcir.dibujar();
        objlinea.setarea();
        objlinea.dibujar();
        
    }
    
}
