import java.util.Scanner;

public class Menu_paciente {
    
    public static Scanner sc = new Scanner(System.in);
    public static Paciente[] listaPacientes = new Paciente[100]; 
    public static int contadorPacientes = 0; 
    public Menu_paciente() {
    }

    
    public static void main(String[] args) {
        int opcion = 0;

        do { 
          
            System.out.print("Ingrese una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch(opcion) {
                case 1:
                    Registrar_paciente.ejecutar();
                    break;
                case 2:
                    Mostrar_informacion.ejecutar();
                    break;
                case 3:
                    Calacular_IMC.ejecutar();
                    break;
                case 4:
                    Peso_ideal.ejecutar();
                    break;
                case 5:
                    Paciente_registrado.ejecutar();
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
            
        } while (opcion != 6);
        
        sc.close();
    }

    static void mostrarMenu() {
        System.out.println("=== MENÚ PRINCIPAL ===");
        System.out.println("1. Registrar paciente");
        System.out.println("2. Mostrar informacion del paciente");
        System.out.println("3. Calcular IMC");
        System.out.println("4. Peso ideal");
        System.out.println("5. Pacientes registrados");
        System.out.println("6. Salir del programa");
    }
}