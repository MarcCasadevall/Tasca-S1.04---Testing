Proyecto: Tests con JUnit

Descripción: Aprender a aplicar tests automatizados en Java con JUnit 5, trabajando funciones prácticas como la gestión de libros, cálculo de DNI y control de excepciones.

📌 Enunciado de los ejercicios
Ejercicio 1: Tests unitarios con JUnit

Gestionar una colección de libros de una biblioteca con funcionalidades como agregar, eliminar, obtener libros y devolver la lista ordenada.

Implementar tests unitarios para validar la correcta ejecución de todos los métodos y evitar duplicados.

Ejercicio 2: Test parametrizado

Crear una clase CalculoDni para calcular la letra del DNI a partir del número.

Implementar tests parametrizados con varios casos válidos e inválidos para validar la funcionalidad.

Ejercicio 3: Control de Excepciones

Crear un método que provoque un ArrayIndexOutOfBoundsException.

Implementar tests que comprueben que la excepción se lanza correctamente bajo las condiciones esperadas.

✨ Funcionalidades

Agregar, eliminar y consultar libros en una colección.

Ordenación alfabética de la colección sin modificar la original.

Cálculo de la letra de DNI con validación de números inválidos.

Control de lanzamiento y comprobación de excepciones en Java.

Tests unitarios y parametrizados con JUnit 5.

🛠 Tecnologías

Frontend: React, Tailwind (si se quiere visualizar resultados o interfaz)

Backend: Java, Maven/Gradle, JUnit 5

Base de datos: MySQL, MongoDB (solo si el proyecto se amplía con persistencia, opcional)

🚀 Instalación y Ejecución

Clonar el repositorio: git clone <enlace-repositorio>

Variables de entorno: Crear .env con las configuraciones necesarias (si se conecta con DB)

Ejecución de la aplicación:

Compilar con Maven: mvn compile

Ejecutar tests: mvn test

Pruebas: Los tests JUnit se encuentran en src/test/java. Ejecutar todos para validar el comportamiento de las clases.

📸 Demo

Capturas de pantalla de los tests pasando correctamente o enlace a un proyecto de demostración con Vercel/Netlify (opcional si hay frontend).

🧩 Diagramas y justificación de decisiones técnicas

Estructura de clases simple y modular: una clase para cada funcionalidad (LibraryManager, CalculoDni, ArrayExceptionExample).

Uso de tests unitarios y parametrizados para separar lógica y validación.

Evitación de duplicados y manipulación segura de colecciones.

Seguridad con excepciones: comprobación de valores inválidos y control de errores previsibles.
