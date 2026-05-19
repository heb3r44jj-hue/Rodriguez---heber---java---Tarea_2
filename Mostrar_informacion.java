public class Mostrar_informacion {
    public static void ejecutar() {
        System.out.println(" Lista General de Pacientes Registrados ");
        
        if (Menu_paciente.contadorPacientes == 0) {
            System.out.println("No existen registros de pacientes en el sistema.\n");
            return;
        }
        
        for (int i = 0; i < Menu_paciente.contadorPacientes; i++) {
            Paciente p = Menu_paciente.listaPacientes[i];
            
            System.out.println("Paciente ID: " + (i + 1));
            System.out.println("Nombre: " + p.nombre);
            System.out.println("Edad: " + p.edad + " años");
            System.out.println("Peso: " + p.peso + " kg");
            System.out.println("Altura: " + p.altura + " m");
            System.out.println("Sexo: " + p.sexo);
            System.out.println("Síntomas: " + p.sintomas);
        }
        System.out.println(); 
    }
}