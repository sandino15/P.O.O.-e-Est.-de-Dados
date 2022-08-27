package Exercicio;

public class Exercicio12 {
    
    public static void main(String [] args){
        double pi = 3.14159;
        double a = 2.0;
        double b = 5.0;
        double c = 3.0;
        
        //alternativa A
        double a1 = ((a*c)/2);

        System.out.println("TRIANGULO: " + a1);

        //alternativa B

        double a2 = ((c*c)*pi);
        System.out.println("CIRCULO: " + a2);

        //alternativa C

        double a3 = (((a+b)*c)/2);

        System.out.println("TRAPEZIO: " + a3);

        //alternativa D

        double a4 = b*b;

        System.out.println("QUADRADO: " + a4);

        //alternativa E

        double a5 = a*b;

        System.out.println("RETANGULO: " + a5);
    }
}
