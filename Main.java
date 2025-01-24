import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("\n===== MENÚ LICUADORA =====");
            System.out.println("1. Prender la licuadora (Llenar)");
            System.out.println("2. Llenar la licuadora");
            System.out.println("3. Incrementar velocidad");
            System.out.println("4. Consultar velocidad actual");
            System.out.println("5. Consultar si la licuadora está llena");
            System.out.println("6. Vaciar la licuadora");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
            }
        } while (opcion != 7);
        
        scanner.close();
    }
}
