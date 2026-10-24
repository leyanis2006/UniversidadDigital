public class Main {
    public static void main(String[] args) {
        int aprobadas = 0, totales = 0;

        // CASO 1: nodo intermedio
        ListaEstudiantes l1 = new ListaEstudiantes();
        l1.agregarAlFinal(new Estudiante("EXP01", "Ana",   "Medicina", 7.5, 2));
        l1.agregarAlFinal(new Estudiante("EXP02", "Luis",  "Derecho",  8.0, 1));
        l1.agregarAlFinal(new Estudiante("EXP03", "Marta", "Ing.",     6.5, 3));
        int r1 = l1.actualizarPromedioEstudiante("EXP02", 9.2);
        totales++;  if (r1 == 1 && l1.getHead().siguiente.dato
                        .getPromedioAcademico() == 9.2) aprobadas++;

        // CASO 2: estudiante en head
        ListaEstudiantes l2 = new ListaEstudiantes();
        l2.agregarAlFinal(new Estudiante("EXP01", "Ana",  "Med", 7.5, 2));
        l2.agregarAlFinal(new Estudiante("EXP02", "Luis", "Der", 8.0, 1));
        int r2 = l2.actualizarPromedioEstudiante("EXP01", 8.8);
        totales++;  if (r2 == 1 && l2.getHead().dato
                        .getPromedioAcademico() == 8.8) aprobadas++;

        // CASO 3: estudiante en tail
        ListaEstudiantes l3 = new ListaEstudiantes();
        l3.agregarAlFinal(new Estudiante("EXP01", "Ana",  "Med", 7.5, 2));
        l3.agregarAlFinal(new Estudiante("EXP02", "Luis", "Der", 8.0, 1));
        int r3 = l3.actualizarPromedioEstudiante("EXP02", 9.0);
        totales++;  if (r3 == 1) aprobadas++;

        // CASO 4: expediente inexistente
        int r4 = l3.actualizarPromedioEstudiante("EXP999", 5.0);
        totales++;  if (r4 == 0) aprobadas++;

        // CASO 5: lista vacía
        ListaEstudiantes vacia = new ListaEstudiantes();
        int r5 = vacia.actualizarPromedioEstudiante("EXP01", 9.0);
        totales++;  if (r5 == 0) aprobadas++;

        // CASO 6: lista de un solo nodo
        ListaEstudiantes unico = new ListaEstudiantes();
        unico.agregarAlFinal(new Estudiante("EXP01", "Ana", "Med", 7.0, 2));
        int r6 = unico.actualizarPromedioEstudiante("EXP01", 9.5);
        totales++;  if (r6 == 1) aprobadas++;

        // CASO 7: expediente null
        int r7 = l1.actualizarPromedioEstudiante(null, 9.0);
        totales++;  if (r7 == 0) aprobadas++;

        // CASO 8: promedio extremo 0.0
        int r8 = unico.actualizarPromedioEstudiante("EXP01", 0.0);
        totales++;  if (r8 == 1) aprobadas++;

        System.out.println("Pruebas superadas: " + aprobadas + "/" + totales);
    }
}
