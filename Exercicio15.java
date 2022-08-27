package Exercicio;

public class Exercicio15{

    public static void main(String[] args){
    
        double x1;
        double x2;
        double y1;
        double y2;
        double c1;
        double c2;
        double r1;
        double r2;
        double pt;
        double rt;
        x1 = 1.0;
        x2 = 7.0;
        y1 = 5.0;
        y2 = 9.0;
        c1 = (x2 - x1);
        c2 = (y2 - y1);
        r1 = c1 * 2;
        r2 = c2 * 2;
        pt = r1 + r2;
        rt = Math.sqrt(pt);

        System.out.print(rt);
        
        
       }
}