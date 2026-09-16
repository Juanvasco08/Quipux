import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("==================================================");
        System.out.println("   SISTEMA DE GESTIÓN ACADÉMICA - UCO ");
        System.out.println("==================================================");

        // Datos del Docente
        System.out.println("\n--- DATOS DEL DOCENTE ---");
        System.out.print("Nombre del profesor: ");
        String nombreProf = scanner.nextLine();
        System.out.print("Cédula: ");
        String cedulaProf = scanner.nextLine();
        System.out.print("Materia: ");
        String materiaProf = scanner.nextLine();

        Profesor profesor = new Profesor(nombreProf, cedulaProf, materiaProf);

        // Datos del Estudiante
        System.out.println("\n--- DATOS DEL ESTUDIANTE ---");
        System.out.print("Nombre del estudiante: ");
        String nombreEst = scanner.nextLine();
        System.out.print("Cédula: ");
        String cedulaEst = scanner.nextLine();
        System.out.print("Carrera universitaria: ");
        String carreraEst = scanner.nextLine();

        Estudiante estudiante = new Estudiante(nombreEst, cedulaEst, carreraEst);

        // Captura de notas
        profesor.registrarNotasEstudiante(estudiante, scanner);

        // Boletín Final
        System.out.println("\n==================================================");
        System.out.println("          BOLETÍN DE NOTAS FINAL - UCO            ");
        System.out.println("==================================================");
        System.out.println("Docente          : " + profesor.getNombre() + " (" + profesor.getMateria() + ")");
        System.out.println("Estudiante       : " + estudiante.getNombre() + " (C.C. " + estudiante.getCedula() + ")");
        System.out.println("Carrera          : " + estudiante.getCarrera());
        System.out.println("--------------------------------------------------");
        System.out.println("Notas asignadas  : " + estudiante.getNotas());
        
        double promedioFinal = estudiante.calcularPromedio();
        System.out.printf(Locale.US, "Promedio Final   : %.2f\n", promedioFinal);
        
        if (estudiante.estaAprobado()) {
            System.out.println("Estado materia   : APROBADO");
        } else {
            System.out.println("Estado materia   : NO APROBADO");
        }
        System.out.println("==================================================");

        scanner.close();
    }
}