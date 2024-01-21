# API de Intercambio de Divisas

Este proyecto es una API REST para el intercambio de divisas, desarrollada en Java con Spring Boot y siguiendo los principios de Domain-Driven Design (DDD). Ofrece una variedad de endpoints para listar monedas disponibles, obtener detalles de monedas específicas, realizar conversiones de moneda y visualizar gráficos comparativos de monedas.

## Características

### Endpoints

1. **Listar Monedas (`GET /v1/currencies/`):**
   - Devuelve una lista de todas las monedas disponibles.
   - **Respuesta de ejemplo:**
     ```json
     {
         "status": 200,
         "result": {
             "AED": "United Arab Emirates Dirham",
             "ALL": "Albanian Lek",
             "AFN": "Afghan Afghani"
         }
     }
     ```

2. **Detalles de Moneda (`GET /v1/currencies/:id/`):**
   - Obtiene información detallada de una moneda específica.

3. **Convertir Moneda (`POST /v1/currencies/:id/convert/:other/amount/:quantity/`):**
   - Realiza conversiones entre monedas.
   - **Ejemplo de solicitud:**
     `http://localhost:8080/v1/currencies/AED/convert/USD/amount/200/`
   - **Respuesta de ejemplo:**
     ```json
     {
         "status": 200,
         "result": {
             "id": 2.0,
             "quantity": 200.0,
             "result": 278.8623851252771,
             "from": "AED",
             "to": "USD"
         }
     }
     ```

4. **Listar Conversiones Realizadas (`GET /v1/currencies/conversions/`):**
   - Muestra un histórico de conversiones de moneda.
   - **Respuesta de ejemplo:**
     ```json
     {
         "status": 200,
         "result": [
             {
                 "id": 2.0,
                 "quantity": 200.0,
                 "result": 278.8623851252771,
                 "from": "AED",
                 "to": "USD"
             }
         ],
         "page": 0,
         "pageSize": 20
     }
     ```

5. **Gráfica Comparativa de Monedas (`GET /v1/currencies/:id/chart/:other/`):**
   - Genera datos para gráficos comparativos entre dos monedas.
   - **Ejemplo de solicitud:**
     `http://localhost:8080/v1/currencies/USD/chart/AED/`
   - **Respuesta de ejemplo:**
     ```json
     {
         "status": 200,
         "result": [...]
     }
     ```
   - La respuesta incluye una serie de valores que representan la comparación histórica entre las dos monedas.

## Tecnologías Utilizadas

- **Java:** Lenguaje de programación principal.
- **Spring Boot:** Framework para la creación de aplicaciones Spring con mínimo esfuerzo.
- **Gradle Wrapper:** Sistema de automatización de construcción.

## Instalación

1. Clona el repositorio:
   ```bash
   git clone [URL del repositorio]
   ```
2. Navega al directorio del proyecto:
   ```bash
   cd [Nombre del proyecto]
   ```
3. Construye y ejecuta el proyecto usando Gradle Wrapper:
   ```bash
   ./gradlew bootRun
   ```

## Uso

Después de iniciar la aplicación, los endpoints estarán disponibles en `http://localhost:8080/v1/currencies/`. Puedes usar herramientas como Postman o cURL para interactuar con la API.

## Contribuciones

Las contribuciones son bienvenidas. Por favor, lee el archivo `CONTRIBUTING.md` para más detalles sobre cómo contribuir al proyecto.

## Licencia

Este proyecto está bajo la licencia [Nombre de la Licencia]. Consulta el archivo `LICENSE` para más detalles.

---

Este README incluye ahora ejemplos de respuestas para cada endpoint, lo cual ayudará a los usuarios a entender mejor cómo funciona tu API. Recuerda reemplazar `[URL del repositorio]`, `[Nombre del proyecto]`, y `[Nombre de la Licencia]` con los datos específicos de tu proyecto.

## Licencia

Este proyecto está bajo la licencia [Nombre de la Licencia]. Consulta el archivo `LICENSE` para más detalles.
