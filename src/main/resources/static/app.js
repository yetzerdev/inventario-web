const API_URL = "/api/productos";

// Cargar lista al inicio
document.addEventListener("DOMContentLoaded", cargarProductos);

function cargarProductos() {
    fetch(API_URL)
        .then(res => res.json())
        .then(data => mostrarProductos(data))
        .catch(err => console.error("Error cargando productos:", err));
}

// Mostrar productos
function mostrarProductos(lista) {
    const tabla = document.getElementById("productos-table");
    tabla.innerHTML = "";

    lista.forEach(p => {
        tabla.innerHTML += `
            <tr>
                <td>${p.id}</td>
                <td>${p.nombre}</td>
                <td>${p.codigo}</td>
                <td>${p.cantidad}</td>
                <td>L. ${p.precio}</td>
                <td>
                    <button onclick="editar(${p.id})">Editar</button>
                    <button onclick="eliminar(${p.id})">Eliminar</button>
                </td>
            </tr>
        `;
    });
}


// Guardar producto
const form = document.getElementById("producto-form");
form.addEventListener("submit", function(e) {
    e.preventDefault();

    const producto = {
        id: document.getElementById("id").value || null,
        nombre: document.getElementById("nombre").value,
        codigo: document.getElementById("codigo").value,
        cantidad: document.getElementById("cantidad").value,
        precio: document.getElementById("precio").value
    };

    fetch(API_URL, {
        method: producto.id ? "PUT" : "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(producto)
    })
    .then(() => {
        cargarProductos();
        limpiarFormulario();
    });
});


// Editar producto
function editar(id) {
    fetch(`${API_URL}/${id}`)
        .then(res => res.json())
        .then(p => {
            document.getElementById("id").value = p.id;
            document.getElementById("nombre").value = p.nombre;
            document.getElementById("codigo").value = p.codigo;
            document.getElementById("cantidad").value = p.cantidad;
            document.getElementById("precio").value = p.precio;
        });
}

// Eliminar producto
function eliminar(id) {
    if (!confirm("¿Eliminar producto?")) return;

    fetch(`${API_URL}/${id}`, { method: "DELETE" })
        .then(() => cargarProductos());
}

// Limpiar formulario
function limpiarFormulario() {
    document.getElementById("id").value = "";
    form.reset();
}

function validarCampo(input, condicion, mensajeErrorId) {
    const errorMsg = document.getElementById(mensajeErrorId);

    if (!condicion) {
        input.classList.remove("success");
        input.classList.add("error");
        errorMsg.classList.add("active");
        return false;
    } else {
        input.classList.remove("error");
        input.classList.add("success");
        errorMsg.classList.remove("active");
        return true;
    }
}
