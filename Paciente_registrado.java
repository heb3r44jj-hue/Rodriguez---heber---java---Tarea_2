public class Paciente_registrado {
    public static void ejecutar() {
        System.out.println(" Pacientes registrados ");
        if (Menu_paciente.contadorPacientes == 0) {
            System.out.println("No existen registros de pacientes en el sistema");
            return;
        }
        for (int i = 0; i < Menu_paciente.contadorPacientes; i++) {
            Paciente p = Menu_paciente.listaPacientes[i];
            System.out.println("Paciente: " + p.nombre);
        }
        System.out.println();
    }
}
