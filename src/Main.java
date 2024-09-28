import java.util.Scanner;//LLAMA LA LIBRERIA
public class Main {
    public static void main(String[] args) {
        String clave="12345";
        Scanner scanner=new Scanner(System.in);//CREA EL LECTOR
        System.out.println("Digite la clave:");
        String contrasena=scanner.nextLine();
        //== verifica si las dos variables apuntan al mismo objeto en la memoria,
        //equals compara el contenido de dos Strings
        // contrasena==clave
        if (contrasena.equals(clave)){
            System.out.println("BIENVENIDO");
        } else {
            System.out.println("CLAVE INCORRECTA");
        }
    }
}