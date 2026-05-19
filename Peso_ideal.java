public class Peso_ideal {
     public static void ejecutar() {
        System.out.println(" Peso ideal ");
        if (Menu_paciente.contadorPacientes == 0) {
            System.out.println("No existen registros de pacientes en el sistema");
            return;
        }
        for (int i = 0; i < Menu_paciente.contadorPacientes; i++) {
            Paciente p = Menu_paciente.listaPacientes[i];
            double pesoIdeal;
            if (p.sexo == 'M' || p.sexo == 'm') {
                pesoIdeal = (p.altura * 100 - 100) - ((p.altura * 100 - 150) / 4);
            } else {
                pesoIdeal = (p.altura * 100 - 100) - ((p.altura * 100 - 150) / 2.5);
            }
            System.out.println("    Paciente: " + p.nombre + " - Peso ideal: " + String.format("%.2f", pesoIdeal) + " kg");
        }
        System.out.println();
        
     }
}

