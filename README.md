# 🔗 API REST - Sistema de Gestión de Stock

## 📑 Descripción
API REST desarrollada con Spring Boot para la gestión de stock de un negocio.
Permite administrar entidades como productos, clientes, proveedores, ventas y cuentas corrientes, implementando una arquitectura en capas para mantener un código limpio, mantenible y escalable.

## ⚙️ Funcionalidades
- 📦 Gestión de productos
- 👤 Gestión de clientes y proveedores
- 🛒 Registro de ventas y detalles de venta
- 💳 Control de cuentas corrientes
- 🏷 Gestión de rubros, estados y condiciones de IVA
- 📊 Reportes de ventas por período
- 🔄 Operaciones CRUD completas para todas las entidades

## 🏗 Arquitectura
El proyecto sigue una arquitectura en capas:

- **Controller** → Manejo de endpoints (HTTP)
- **Service** → Lógica de negocio
- **Repository** → Acceso a datos con Spring Data JPA
- **Model** → Entidades y relaciones

## 🛠 Tecnologías
- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- Maven
- MySQL

## 🧪 Testing
Se implementaron pruebas unitarias sobre la capa de servicios utilizando:
- JUnit 5
- Mockito

### ✔ Cobertura de tests
Se testearon múltiples servicios del sistema, incluyendo:
- CiudadService
- ClienteService
- CondicionIvaService
- CuentaCorrienteService
- EstadoService
- ProveedorService
- RubroService
- VentaService

### 🧠 Ejemplo de test
- Mock de repositorios con Mockito
- Validación de resultados con Assertions
- Pruebas de métodos como:
  - Obtener por ID
  - Listar entidades
  - Guardar registros

## 📦 Requisitos
- Java 8+
- Maven
- MySQL

## ⚙️ Configuración
1. Clonar el repositorio  
2. Configurar la base de datos en `application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/tu_db
spring.datasource.username=usuario
spring.datasource.password=contraseña
```
3. Ejecutar el proyecto:
```bash
mvn spring-boot:run
```

## 🌐 Endpoints principales

Ejemplo de endpoints:

- GET /productos → Listar productos
- POST /productos → Crear producto
- PUT /productos/{id} → Actualizar producto
- DELETE /productos/{id} → Eliminar producto

(Aplicable a todas las entidades: clientes, proveedores, ventas, etc.)

## 🗄 Entidades principales
- Producto
- Cliente
- Proveedor
- Venta
- DetalleVenta
- CuentaCorriente
- Ciudad
- Rubro
- Estado
- CondicionIva

## 📊 Reportes

La API incluye consultas para:
- Cantidad de ventas por período
- Información de stock

## ⚠️ Notas
- Verificar que MySQL esté en ejecución
- Configurar correctamente las credenciales de base de datos
- Proyecto orientado a backend (sin interfaz gráfica)

## Autor ✒️
**Lucas Barrera**
* [LinkedIn](https://www.linkedin.com/in/lucas-barrera-dev)
