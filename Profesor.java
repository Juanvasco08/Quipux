import java.util.Scanner;

public class Profesor extends Persona {
    private String materia;

    public Profesor(String nombre, String cedula, String materia) {
        super(nombre, cedula);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void registrarNotasEstudiante(Estudiante estudiante, Scanner scanner) {
        System.out.print("\n¿Cuántas notas ingresará para el estudiante?: ");
        int cantidadNotas = scanner.nextInt();

        for (int i = 1; i <= cantidadNotas; i++) {
            double nota;
            while (true) {
                System.out.print("Ingrese la nota " + i + " (de 0.0 a 5.0): ");
                nota = scanner.nextDouble();
                if (nota >= 0.0 && nota <= 5.0) {
                    break;
                }
                System.out.println("⚠️ Nota inválida. Debe estar entre 0.0 y 5.0.");
            }
            estudiante.agregarNota(nota);
        }
        System.out.println("-> Notas registradas correctamente por el docente.");
    }
}