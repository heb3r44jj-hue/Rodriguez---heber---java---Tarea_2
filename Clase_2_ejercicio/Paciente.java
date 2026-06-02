public class Paciente {
    public String nombre;
    public int edad;
    public double peso;
    public double altura;
    public char sexo;
    public String sintomas;

    public Paciente(String nombre, int edad, double peso, double altura, char sexo, String sintomas) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
        this.sintomas = sintomas;
    }
}