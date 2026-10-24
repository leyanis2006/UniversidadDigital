# UniversidadDigital – Actualizar promedio por expediente

**Autora:** Leyanis de la Caridad Serrano García  
**Asignatura:** Estructuras de Datos — Examen Parcial Individual 2026–2027

## Descripción
Lista simplemente enlazada en Java. Método:
`public int actualizarPromedioEstudiante(String expediente, double nuevoPromedio)`

Recorre la lista desde `head`; si encuentra el expediente con `.equals()`,
actualiza `promedioAcademico` y retorna `1`. Si no existe (o lista vacía),
retorna `0` sin excepciones.

## Estructura
- `src/Estudiante.java` – entidad
- `src/Nodo.java` – nodo de la lista
- `src/ListaEstudiantes.java` – lista + método del examen
- `src/Main.java` – casos de prueba (normales y límite)
- `presentacion.pdf` – diapositivas de la defensa

## Complejidad
Tiempo O(n), espacio O(1).

## Casos de prueba
Nodo intermedio, head, tail, expediente inexistente, lista vacía,
lista de un nodo, expediente `null`, promedio 0.0.
Resultado esperado: `Pruebas superadas: 8/8`.

## Declaración de uso de IA
Se utilizó IA (ChatGPT/Claude) para generar los casos de prueba y redactar
este README. La lógica del método, las clases y la validación fueron
revisadas y comprendidas íntegramente por la autora. Todo el código fue
ejecutado y validado antes de la entrega.
