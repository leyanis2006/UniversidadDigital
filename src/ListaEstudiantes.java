public class ListaEstudiantes {
    private Nodo head;
    private int tamanio;

    public ListaEstudiantes() {
        this.head = null;
        this.tamanio = 0;
    }

    public void agregarAlFinal(Estudiante e) {
        Nodo nuevo = new Nodo(e);
        if (head == null) {
            head = nuevo;
        } else {
            Nodo actual = head;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
        tamanio++;
    }

    public int getTamanio() { return tamanio; }
    public Nodo getHead() { return head; }

    public int actualizarPromedioEstudiante(String expediente,
                                            double nuevoPromedio) {
        if (expediente == null) return 0;

        Nodo actual = head;
        while (actual != null) {
            if (actual.dato.getExpediente().equals(expediente)) {
                actual.dato.setPromedioAcademico(nuevoPromedio);
                return 1;
            }
            actual = actual.siguiente;
        }
        return 0;
    }
}
