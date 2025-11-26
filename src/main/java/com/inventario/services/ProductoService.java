package com.inventario.services;

import com.inventario.models.Producto;
import com.inventario.repositories.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service //indica que esta clase es un "service" de Spring
public class ProductoService {
    private final ProductoRepository repository; //Aqui guardamos la conexion con la base de datos

    //Inyección de dependencia
    public ProductoService(ProductoRepository repository) {
        this.repository = repository;
    }

    //Guardar un producto o actualizar si ya existe
    public Producto guardaProducto(Producto producto) {
        return repository.save(producto);
    }

    //listar todos los productos
    public List<Producto> listarProductos() {
        return repository.findAll();
    }

    //Buscar un producto por su ID
    public Optional<Producto> obtenerProducto(Long id) {
        return repository.findById(id);
    }

    //Eliminar un producto por su ID
    public void eliminarProducto(Long id) {
        repository.deleteById(id);
    }
}