package Exercicio;

public class Exercicio13 {
    
    public static void main(String [] args){

         //número 1

        int a = 10;
        int b = 5;
        int abs = 2;
        //número 2

        int a2 = 20;
        int b2 = 45;
        int abs2 = 80;
        //Número 3

        int a3 =20;
        int b3 = 55;
        int abs3 =2;

        //resultado

        int maior1 = ((a+b+abs)*(a-b));
        int r1 = (maior1/2);

        int maior2 = ((a2+b2+abs2)*(a2-b2));
        int r2 = (maior2/2);

        int maior3 = ((a3+b3+abs3)*(a3-b3));
        int r3 = (maior3/2);

       System.out.println(r1 + " eh maior");
        

    }
}
