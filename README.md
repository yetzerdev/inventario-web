# Sistema de Inventario Web
Proyecto desarrollado con Spring Boot, Thymeleaf y MySQL, como parte de las tareas prácticas del curso. Permite gestionar productos mediante operaciones CRUD (Crear, Leer, Actualizar y Eliminar).

## Tecnologías
### Backend y Base de Datos
- Java 25
- Spring Boot: Framework principal para la aplicación.
- Spring Data JPA: Para el manejo ORM y acceso a datos.
- MySQL: Base de datos relacional para persistencia de datos.

### Frontend y Herramientas
- Thymeleaf: Motor de plantillas para la capa de presentación.
- Bootstrap: Framework de CSS para diseño responsivo.
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

