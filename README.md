# Sistema de Inventario Web

## Descripción
Este proyecto es un sistema de inventario full-stack desarrollado con Java y Spring Boot. Su principal objetivo es permitir la gestión completa de productos mediante operaciones CRUD (Crear, Leer, Actualizar y Eliminar).

El desarrollo se ha realizado como parte de las tareas prácticas de un curso, integrando tecnologías web modernas para una solución robusta y funcional.

## ✨ Novedades (Última Actualización)
El proyecto ha alcanzado una etapa de desarrollo clave con la implementación completa de la capa de presentación:
- Frontend Creado: Se ha desarrollado una interfaz de usuario limpia y funcional utilizando HTML, Thymeleaf y JavaScript.
- Interacción CRUD Completa: Los formularios y las vistas ahora permiten realizar todas las operaciones CRUD (Crear, Listar, Editar, Eliminar) directamente desde el navegador.
- Consumo del Backend: La aplicación frontend consume los endpoints REST del backend de Spring Boot utilizando la API `fetch()` de JavaScript para la comunicación asíncrona.

## Tecnologías
El sistema se construye sobre la siguiente pila tecnológica:

### Backend y Base de datos
- Java 25
- Spring Boot

### Frontend y Herramientas
- Maven: Herramienta de gestión de dependencias y construcción de proyectos.

## Estructura del Proyecto
``` bash
src/
 └─ main/
     ├─ java/
     │   └─ com.inventario/
     │        ├─ controller/
     │        ├─ entity/
     │        ├─ repository/
     │        ├─ service/
     │        └─ InventarioWebApplication.java
     └─ resources/
         ├─ templates/
         ├─ static/
         └─ application.properties
```

## Funcionalidades Implementadas
Actualmente, el proyecto soporta las siguientes características a nivel de backend y servicio:
### Operaciones CRUD
- Agregar productos (Crear)
- Ver lista de productos (Leer)
- Editar productos (Actualizar)
- Eliminar productos (Eliminar)
- Mostrar el total de productos registrados.

### Componenentes de Servicio
- Modelo `Producto`: Define la entidad de la base de datos con atributos clave: `id`, `nombre`, `codigo`, `cantidad` y `precio`.
- Repositorio `ProductoRepository`: Intefaz que extiene `JpaRepository` para la abstraccion de operaciones CRUD.
- Servicio `ProductoService`: Contiene la lógica de negocio para interactuar con el repositorio (métodos para guardar, listar, obtener por ID y eliminar productos)

## Ejecución
Sigue estos pasos para poner en marcha el proyecto localmente:
1. Clonar el repositorio
```bash
  git clone https://github.com/yetzerdev/inventario_web.git
```
2. Abrir el proyecto en tu IDE
3. Ejecutar la clase:
```bash
  InventarioWebApplication
```
4. Abrir el navegador en:
```bash
  http://localhost:8080/productos
```
 
## Feedback

Si tiene algún comentario, comuníquese conmigo a banegasyared27@gmail.com

## Autores

- [@yetzerdev](https://www.github.com/yetzerdev)
