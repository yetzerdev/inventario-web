# Sistema de Inventario Web

## Descripción
Sistema de inventario web fullstack usando Java + Spring Boot.  
Actualmente se ha implementado:
- Modelo `Producto` con atributos: id, nombre, código, cantidad, precio
- Repositorio `ProductoRepository` para CRUD en base de datos H2
- Servicio `ProductoService` con métodos para guardar, listar, obtener y eliminar productos

## Tecnologías
- Backend: Java 25, Spring Boot, H2 Database
- Herramientas: GitHub, VS Code

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
