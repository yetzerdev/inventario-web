# Sistema de Inventario Web

## Descripción
Este proyecto es un sistema de inventario full-stack desarrollado con Java y Spring Boot. Su principal objetivo es permitir la gestión completa de productos mediante operaciones CRUD (Crear, Leer, Actualizar y Eliminar).

El desarrollo se ha realizado como parte de las tareas prácticas de un curso, integrando tecnologías web modernas para una solución robusta y funcional.

## Tecnologías
El sistema se construye sobre la siguiente pila tecnológica:

### Backend y Base de datos
- Java 25
- Spring Boot

## Cómo ejecutar
1. Abrir el proyecto en tu IDE
2. Ejecutar `InventarioWebApplication.java`
3. Verificar que Spring Boot arranca correctamente
4. Abrir H2 console: http://localhost:8080/h2-console  
   - JDBC URL: `jdbc:h2:mem:inventario`  
   - Usuario: `sa`  
   - Contraseña: (vacío)

## Próximos pasos
- Crear controlador `ProductoController` para exponer endpoints REST
- Crear frontend básico para interactuar con el backend
