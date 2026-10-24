public class Estudiante {
    private String expediente;
    private String nombreCompleto;
    private String carrera;
    private double promedioAcademico;
    private int asignaturasPendientes;

    public Estudiante(String expediente, String nombreCompleto,
                      String carrera, double promedioAcademico,
                      int asignaturasPendientes) {
        this.expediente = expediente;
        this.nombreCompleto = nombreCompleto;
        this.carrera = carrera;
        this.promedioAcademico = promedioAcademico;
        this.asignaturasPendientes = asignaturasPendientes;
    }

    public String getExpediente() { return expediente; }
    public double getPromedioAcademico() { return promedioAcademico; }
    public void setPromedioAcademico(double p) { this.promedioAcademico = p; }

    @Override
    public String toString() {
        return "Estudiante{exp=" + expediente +
               ", nombre='" + nombreCompleto + '\'' +
               ", promedio=" + promedioAcademico +
               ", pendientes=" + asignaturasPendientes + '}';
    }
}
