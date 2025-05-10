import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String nombre;
        String clave;
        System.out.println("Por favor ingresa tu nombre de usuario: ");
        nombre = sc.nextLine();
        System.out.println("Por favor ingresar: ");
        clave = sc.nextLine();
        if (nombre.equals("admin") && clave.equals("clave123")) {
            System.out.println("Bienvenido");
        } else {
            System.out.println("Datos incorrectos");
        } sc.close();
    }
}
