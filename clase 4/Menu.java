import java.util.Scanner;

public class Menu {
    public static void guardar (Estudiante e ){
        try {
            java.io.FileWriter fw = new java.io.FileWriter("estudiantes.txt", true);
            fw.write(e.nombre + "," + e.Matricula + "," + e.carrera + "\n");
            fw.close();
            System.out.println("Guardado");
        }catch (Exception error){
            System.out.println("Error al guardar: " + error.getMessage());
        }
    }

    public static void mostrar (){
        try {
            java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader("estudiantes.txt"));
            String linea;
            int i = 1;
            while ((linea = br.readLine()) != null){
                String[] datos = linea.split(",");
                System.out.println(i + ". Nombre: " + datos[0] + ", Matricula: " + datos[1] + ", Carrera: " + datos[2]);
                i++;
            }
            br.close();
        }catch (Exception error){
            System.out.println("no hay estudiantes");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Mostrar estudiantes");
            System.out.println("3. Salir");
            opcion = sc.nextInt();
            sc.nextLine(); 
            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Matricula: ");
                    String Matricula = sc.nextLine();
                    System.out.print("Carrera: ");
                    String carrera = sc.nextLine();
                    Estudiante e = new Estudiante(nombre, Matricula, carrera);
                    guardar(e);
                    break;
                case 2:
                    mostrar();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 3);
    }
}
