# CURRENCY EXCHANGE API

## Endpoints

### GET /v1/currencies/

Este endpoint parece sólido para listar monedas disponibles. Sin embargo, podrías considerar agregar opciones de filtrado o clasificación para permitir a los usuarios encontrar monedas de manera más eficiente. Por ejemplo, podrías permitir que los usuarios filtren monedas por nombre, símbolo o incluso por su valor actual en relación con una moneda específica.

### GET /v1/currencies/:id/

El endpoint para obtener detalles de una moneda específica está bien diseñado. Asegúrate de proporcionar una respuesta JSON completa que incluya información detallada sobre la moneda, como su nombre, símbolo, valor actual, etc.

### GET /v1/currencies/conversions/

Este endpoint es adecuado para listar conversiones de moneda realizadas. Sin embargo, como mencioné anteriormente, podrías considerar agregar opciones de filtrado y paginación para mejorar la usabilidad a medida que la lista crezca.

### GET /v1/currencies/:id/convert/:other/amount/:quantity/

Este endpoint, aunque tiene un propósito claro, podría beneficiarse de un cambio en el método HTTP. Dado que realiza una conversión (que podría considerarse como una operación que modifica datos), podrías usar un método POST en lugar de GET para seguir los principios REST más estrictamente. Esto también permitiría enviar los parámetros de conversión en el cuerpo de la solicitud en lugar de en la URL, lo que podría ser más seguro y escalable.

### GET /v1/currencies/:id/chart/:other/

El endpoint para obtener una gráfica comparativa es interesante, pero nuevamente, ten en cuenta la posible carga de trabajo generada por la generación de gráficos. Asegúrate de que esta operación sea eficiente y, si es posible, considera opciones para limitar el rango de tiempo de la gráfica o la granularidad de los datos para evitar cargas innecesarias en el servidor.