import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IBlender blender = new Blender();
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
                    blender.Fill();
                    break;
                case 2:
                    blender.Fill();
                    break;
                case 3:
                    blender.SpeedUp();
                    break;
                case 4:
                    System.out.println("Velocidad actual: " + blender.GetSpeed());
                    break;
                case 5:
                    System.out.println(blender.IsFull() ? "La licuadora está llena." : "La licuadora está vacía.");
                    break;
                case 6:
                    blender.Empty();
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 7);
        
        scanner.close();
    }
}
