public class Calacular_IMC {
    public static void ejecutar() {
        System.out.println(" Cálculo del Índice de Masa Corporal (IMC) ");
        
        if (Menu_paciente.contadorPacientes == 0) {
            System.out.println("No existen registros de pacientes en el sistema.\n");
            return;
        }
        
        for (int i = 0; i < Menu_paciente.contadorPacientes; i++) {
            Paciente p = Menu_paciente.listaPacientes[i];
            double imc = p.peso / (p.altura * p.altura);
            
            System.out.printf("Paciente: %s - IMC: %.2f - ", p.nombre, imc);
            
            if (imc < 18.5) {
                System.out.println("Bajo peso");
            } else if (imc < 25) {
                System.out.println("Peso normal");
            } else if (imc < 30) {
                System.out.println("Sobrepeso");
            } else {
                System.out.println("Obesidad");
            }
        }
        System.out.println(); 
    }
}
