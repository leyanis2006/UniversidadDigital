# UniversidadDigital – Actualización de promedio por expediente

## Autor
**Leyanis de la Caridad Serrano García**  
Asignatura: Estructuras de Datos  
Curso Académico: 2026–2027  
Modalidad: Examen Parcial Individual

## Descripción del ejercicio
Sistema de Gestión Académica **UniversidadDigital** implementado con una
**lista simplemente enlazada** (SinglyLinkedList) en Java.

Método asignado:

    public int actualizarPromedioEstudiante(String expediente, double nuevoPromedio)

Recorre la lista buscando al estudiante por su `expediente`. Si lo encuentra,
actualiza su `promedioAcademico` con el valor recibido y retorna `1`.
Si no existe (o la lista está vacía), retorna `0` sin lanzar excepciones.

## Entidad
Clase `Estudiante` con los atributos:

| Atributo | Tipo |
|---|---|
| expediente | String |
| nombreCompleto | String |
| carrera | String |
| promedioAcademico | double |
| asignaturasPendientes | int |

## Estructura del repositorio

    UniversidadDigital/
    ├── README.md
    ├── presentacion.pdf
    └── src/
        ├── Estudiante.java
        ├── Nodo.java
        ├── ListaEstudiantes.java
        └── Main.java

## Funcionamiento del algoritmo
1. Se parte del nodo `head` de la lista.
2. Se recorre con `while (actual != null)`.
3. Se compara el expediente con `actual.dato.getExpediente().equals(expediente)`
   (se usa `equals`, nunca `==`, porque `==` compara referencias y no contenido).
4. Si coincide, se actualiza el promedio con `setPromedioAcademico` y se retorna `1`.
5. Si el recorrido termina sin encontrar (incluido el caso de lista vacía),
   se retorna `0`.

## Complejidad
- **Tiempo:** O(n) — se recorre la lista como máximo una vez.
- **Espacio:** O(1) — no se usan estructuras auxiliares.

## Casos de prueba cubiertos
Todos los casos están implementados en `Main.java`:

| # | Caso | Resultado esperado |
|---|---|---|
| 1 | Estudiante en nodo intermedio | retorna 1 y actualiza |
| 2 | Estudiante en la cabeza (`head`) | retorna 1 y actualiza |
| 3 | Estudiante en la cola (`tail`) | retorna 1 y actualiza |
| 4 | Expediente inexistente | retorna 0 |
| 5 | Lista vacía | retorna 0, sin NullPointerException |
| 6 | Lista de un solo nodo | retorna 1 y actualiza |
| 7 | Expediente `null` | retorna 0 (control defensivo) |
| 8 | Nuevo promedio extremo (0.0) | retorna 1 y actualiza |

Resultado al ejecutar: `Pruebas superadas: 8/8`

## Cómo ejecutar
Desde la carpeta `src/`:

    javac *.java
    java Main

## Presentación
[Ver diapositivas en Google Drive](https://1drv.ms/b/c/6ebe1fcae7bacf72/IQD2yJTkX9CxT7VbY7q2cxYXAfhCth8x0tcvbYqFBvsgIe8)

## Declaración de uso de Inteligencia Artificial
De acuerdo con los principios de transparencia académica, se declara:

- **Herramientas de IA utilizadas:** asistente conversacional (ChatGPT/Claude).
- **Partes del desarrollo asistidas por IA:**
  - Generación de la batería de casos de prueba en `Main.java`.
  - Redacción y estructuración de este archivo `README.md`.
  - Revisión de buenas prácticas y detección de posibles errores.
- **Partes desarrolladas y comprendidas íntegramente por la autora:**
  - Lógica del método `actualizarPromedioEstudiante`.
  - Diseño de las clases `Estudiante`, `Nodo` y `ListaEstudiantes`.
  - Verificación manual de todos los casos de prueba.
- **Compromiso:** todo el código entregado fue ejecutado y validado localmente,
  y la autora es capaz de explicar y defender oralmente cada decisión de diseño.
