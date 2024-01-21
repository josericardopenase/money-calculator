# API de Intercambio de Divisas

Este proyecto es una API REST para el intercambio de divisas, desarrollada en Java con Spring Boot y siguiendo los principios de Domain-Driven Design (DDD). Ofrece una variedad de endpoints para listar monedas disponibles, obtener detalles de monedas específicas, realizar conversiones de moneda y visualizar gráficos comparativos de monedas.

## Características

- **Listar Monedas (`GET /v1/currencies/`):** Este endpoint proporciona una lista de todas las monedas disponibles. Incluye opciones de filtrado y clasificación para una búsqueda eficiente.
- **Detalles de Moneda (`GET /v1/currencies/:id/`):** Obtiene información detallada de una moneda específica, incluyendo nombre, símbolo y valor actual.
- **Listar Conversiones Realizadas (`GET /v1/currencies/conversions/`):** Muestra un histórico de conversiones de moneda, con opciones de filtrado y paginación.
- **Convertir Moneda (`POST /v1/currencies/:id/convert/:other/amount/:quantity/`):** Realiza conversiones entre monedas. Se utiliza el método POST para mayor seguridad y escalabilidad.
- **Gráfica Comparativa de Monedas (`GET /v1/currencies/:id/chart/:other/`):** Genera gráficos comparativos entre dos monedas, con opciones para limitar el rango de tiempo y la granularidad de los datos.

## Tecnologías Utilizadas

- **Java:** Lenguaje de programación principal.
- **Spring Boot:** Framework para la creación de aplicaciones Spring con mínimo esfuerzo.
- **Domain-Driven Design (DDD):** Enfoque de diseño centrado en el dominio del problema.

## Instalación

1. Clona el repositorio:
   ```bash
   git clone [URL del repositorio]
   ```
2. Navega al directorio del proyecto:
   ```bash
   cd [Nombre del proyecto]
   ```
3. Construye y ejecuta el proyecto usando Maven:
   ```bash
   mvn spring-boot:run
   ```

## Uso

Después de iniciar la aplicación, los endpoints estarán disponibles en `http://localhost:[puerto]/v1/currencies/`. Puedes usar herramientas como Postman o cURL para interactuar con la API.

## Contribuciones

Las contribuciones son bienvenidas. Por favor, lee el archivo `CONTRIBUTING.md` para más detalles sobre cómo contribuir al proyecto.

## Licencia

Este proyecto está bajo la licencia [Nombre de la Licencia]. Consulta el archivo `LICENSE` para más detalles.
