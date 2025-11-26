package com.inventario.controllers;

import com.inventario.models.Producto;
import com.inventario.services.ProductoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
@CrossOrigin(origins = "*") //permite que cualquier frontend pueda acceder a estos endpoints

public class ProductoController {

    private final ProductoService service;

    //Inyección de dependencia: spring se encarga de crear el objeto service y pasarlo al constructor   
    public ProductoController(ProductoService service) {
        this.service = service;
    }

    //GET /api/productos - lista todos los productos
    @GetMapping
    public List<Producto> listar() {
        return service.listarProductos();
    }
    
    //GET /api/productos/{id} - obtiene un producto por su ID
    @GetMapping("/{id}")
    public Producto obtener(@PathVariable Long id) {
        return service.obtenerProducto(id).orElse(null);
    }

    //POST /api/productos - crea un nuevo producto
    @PostMapping
    public Producto crear(@RequestBody Producto producto) {
        return service.guardaProducto(producto);
    }

    //PUT /api/productos/{id} - actualiza un producto existente
    @PutMapping("/{id}")
    public Producto actualizar(@PathVariable Long id, @RequestBody Producto producto) {
        Producto p = service.obtenerProducto(id).orElse(null);
        if (p != null) {
            p.setNombre(producto.getNombre());
            p.setCodigo(producto.getCodigo());
            p.setPrecio(producto.getPrecio());
            p.setCantidad(producto.getCantidad());
            return service.guardaProducto(p);
        }
        return null;
    }

    //DELETE /api/productos/{id} - elimina un producto por su ID
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminarProducto(id);
    }
}