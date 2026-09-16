import java.util.ArrayList;

public class Estudiante extends Persona {
    private String carrera;
    private ArrayList<Double> notas;

    public Estudiante(String nombre, String cedula, String carrera) {
        super(nombre, cedula);
        this.carrera = carrera;
        this.notas = new ArrayList<>();
    }

    public String getCarrera() {
        return carrera;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void agregarNota(double nota) {
        this.notas.add(nota);
    }

    public double calcularPromedio() {
        if (notas.isEmpty()) {
            return 0.0;
        }
        double suma = 0;
        for (double n : notas) {
            suma += n;
        }
        return suma / notas.size();
    }

    public boolean estaAprobado() {
        return calcularPromedio() >= 3.0;
    }
}