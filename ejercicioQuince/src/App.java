import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String nombreCliente;
        String clave;
        System.out.println("Por favor ingresa tu nombre de usuario: ");
        nombreCliente = sc.nextLine();
        System.out.println("Por favor ingresar tu clave personal: ");
        clave = sc.nextLine();
        if (nombreCliente.equals("admin") && clave.equals("clave123")) {
            System.out.println("Bienvenido");
        } else {
            System.out.println("Datos incorrectos");
        } sc.close();
    }
}
