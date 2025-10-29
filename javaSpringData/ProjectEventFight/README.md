# Proyecto MMA Manager - Spring Data JPA
## Descripción del Proyecto
Este proyecto es un sistema de gestión de información sobre peleas de Artes Marciales Mixtas (MMA), luchadores, entrenadores y estadios, implementado con Java y Spring Boot. Utiliza Spring Data JPA para la persistencia de datos, demostrando las capacidades de modelado de entidades y la creación de consultas complejas para la obtención de estadísticas relevantes del mundo de la MMA.

El objetivo principal es gestionar las entidades y permitir la consulta eficiente de datos, como los salarios de los entrenadores o la asistencia a los estadios.

---

## Tecnologías Utilizadas
  - Java 17+
  - Spring Boot 3+
  - Spring Data JPA
  - Maven
  - Base de datos relacional MySQL

---

## Modelo de Entidades (Requisitos)
El sistema se basa en las siguientes relaciones y reglas de negocio:

  - Luchadores (Fighters): Participan en peleas.
  - Entrenadores (Coaches): Tienen un porcentaje de comisión sobre la taquilla de las peleas.
      - Un Luchador tiene un Entrenador de forma obligatoria.
      - Un Entrenador puede no tener luchadores a su cargo.
      - La comisión del entrenador es fija, independientemente del luchador.
      - Los entrenadores pueden cambiar a lo largo de la carrera del luchador (implica una posible relación de muchos a muchos con fechas o historial, o simplemente un campo mutable).
  - Peleas (Fights):
      - Cada pelea es protagonizada por 2 Luchadores.
      - Se celebran en un Estadio.
      - El mismo par de luchadores puede pelear en el mismo estadio en distintas fechas.
  - Estadios (Arenas): Lugar donde se celebran las peleas.
    
Con toda esta información dada, podemos hacernos una idea de cómo será nuestra Relación entre Entidades:

---

## Funcionalidades Implementadas (Consultas Spring Data JPA)
El repositorio de datos se ha configurado para cumplir con los siguientes requerimientos de consulta, utilizando las capacidades de Spring Data JPA (@Query o métodos derivados):

  1. Filtrar Luchadores por Nombre: Permite buscar luchadores utilizando su nombre (o parte de él).

  2. Saber el Salario Percibido en Comisiones por un Entrenador: Calcula la suma total de las comisiones (porcentaje aplicado al total de taquilla de las peleas de sus luchadores) que ha percibido un entrenador.

  3. Saber el Luchador que Cobró Menos Dinero en Pelea: Identifica al luchador que obtuvo el menor ingreso total (asumiendo que el "dinero cobrado" es la taquilla de la pelea menos el porcentaje de comisión del entrenador, o solo la taquilla total de sus peleas, dependiendo de la interpretación del sistema). Se recomienda aclarar la lógica de cálculo en el código.

  4. Saber en qué Estadio se Celebraron Más Peleas: Devuelve el estadio con la mayor cantidad de peleas registradas.

## Instalación y Uso
  1. Requisitos Previos
  Asegurate de tener instalado:

  - JDK 17+
  - Git
  3. Clonar el Repositorio
```
git clone https://github.com/hugopiramide/java-spring-boot
cd java-spring-boot/javaSpringData/ProjectEventFight
```
  3. Configuracion de la Base de Datos
     Modifica el archivo src/main/resources/application.properties con la configuración de tu base de datos (si usas una externa). Si usas H2 en memoria, generalmente la configuración por defecto es suficiente.
  4. Ejecuta el Proyecto
     Puedes ejecutar r la aplicación desde tu IDE o usando Maven:
```
./mvnw spring-boot:run
```
