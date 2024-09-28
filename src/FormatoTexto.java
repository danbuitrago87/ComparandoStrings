//import java.util.Scanner;
public class FormatoTexto {
    public static void main(String[] args){
        //Scanner scanner=new scanner (System.in);
        String nombre="Daniel";
        int edad=28;
        double decimal=3.1416;
        System.out.println(String.format("Mi nombre es %s, tengo %d y pi es %f", nombre, edad, decimal));
    }
}
