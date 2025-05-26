# 🧮 API Calculadora - Spring Boot

Una API REST sencilla hecha con Spring Boot que permite realizar operaciones matemáticas básicas: suma, resta, multiplicación y división.

---

## 🚀 Tecnologías utilizadas

- Java 21 
- Spring Boot
- Spring Web & Spring Boot DevTools
- Springdoc OpenAPI (Swagger)
- Maven

---

## 📚 Endpoints disponibles

| Operación        | Método | Endpoint                          | Parámetros             |
|------------------|--------|-----------------------------------|------------------------|
| Suma             | GET    | `/api/calculadora/suma`           | `a`, `b` (double)      |
| Resta            | GET    | `/api/calculadora/resta`          | `a`, `b` (double)      |
| Multiplicación   | GET    | `/api/calculadora/multiplicacion` | `a`, `b` (double)      |
| División         | GET    | `/api/calculadora/division`       | `a`, `b` (double)      |

---

## 🔍 Ejemplo de uso

```http
GET http://localhost:9090/api/calculadora/suma?a=10&b=5

15.0
```

## ⚠️ Manejo de errores
Si se intenta dividir entre 0, el servidor responde con:

```http
HTTP/1.1 400 Bad Request
```

Cuerpo de la respuesta:

```json
{
  "mensaje": "No se puede dividir entre 0!!"
}
```
El error es manejado en el controlador mediante ResponseEntity.

## 📖 Documentación Swagger
Una vez iniciada la aplicación, podés ver y probar los endpoints desde el explorador:
- 📎 http://localhost:9090/swagger-ui.html

## ▶️ Cómo ejecutar el proyecto
### 🔧 Requisitos
- Java 21+
- Maven 3.6+

## 🛠️ Pasos para correr la aplicación

### Clonar el repositorio
git clone https://github.com/tu-usuario/tu-repo.git
cd tu-repo

### Ejecutar con Maven
./mvnw spring-boot:run
La aplicación estará disponible en:
📍 http://localhost:9090

## 📦 Compilar el proyecto
./mvnw clean package
Esto genera un .jar ejecutable dentro de la carpeta target.

## 👤 Autor
Desarrollado por Jonathan Hernandez
