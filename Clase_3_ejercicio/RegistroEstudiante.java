import java.util.Scanner;

public class RegistroEstudiante {
    public static void ValidarEstudiante(String nombre, int edad , double indice) throws EstudianteInvalidoExcepcion {
         
        if ( nombre.isEmpty()) {
            throw new EstudianteInvalidoExcepcion("El nombre del estudiante no puede estar vacío.");
        }
        if (edad < 18 || edad > 122) {
            throw new EstudianteInvalidoExcepcion("La edad del estudiante debe ser mayor de 18 años.");
        }
        if (indice < 0 || indice > 4.0) {
            throw new EstudianteInvalidoExcepcion("El índice académico del estudiante debe ser entre 0 y 4.0");
        }
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Edad: ");
        int edad = scanner.nextInt();
        System.out.println("Indice académico: ");
        double indice = scanner.nextDouble();

        try {
         ValidarEstudiante(nombre, edad, indice);

         System.out.println("El estudiante registrado correctamente .");
        } catch (EstudianteInvalidoExcepcion e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("proceso de registro finalizado");
        }
        scanner.close();

    }
}


   

   
