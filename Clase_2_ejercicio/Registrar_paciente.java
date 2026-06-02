public class Registrar_paciente {

    public static String nombre;
    public static int edad;
    public static double peso;
    public static double altura;
    public static char sexo;
    public static String sintomas;

    public static void ejecutar() {
        System.out.println(" Formulario de Registro de Paciente ");

        System.out.print("Nombre: ");
        nombre = Menu_paciente.sc.nextLine();

        System.out.print("Edad: ");
        edad = Menu_paciente.sc.nextInt();

        System.out.print("Peso: ");
        peso = Menu_paciente.sc.nextDouble();

        System.out.print("Altura: ");
        altura = Menu_paciente.sc.nextDouble();

        System.out.print("Sexo (M/F): ");
        sexo = Menu_paciente.sc.next().charAt(0);

        Menu_paciente.sc.nextLine();

        System.out.print("Síntomas: ");
        sintomas = Menu_paciente.sc.nextLine();

        Paciente nuevo = new Paciente(nombre, edad, peso, altura, sexo, sintomas);

        
        Menu_paciente.listaPacientes[Menu_paciente.contadorPacientes] = nuevo;

        
        Menu_paciente.contadorPacientes++;

        System.out.println("Paciente guardado \n");
        
    }
}