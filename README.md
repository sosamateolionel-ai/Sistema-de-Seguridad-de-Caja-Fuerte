# Sistema de Seguridad de Caja Fuerte

## Descripción

Este proyecto implementa una clase `CajaFuerte` en Java que simula el funcionamiento de una caja fuerte protegida por una combinación secreta. Permite abrir la caja mediante una clave, cambiar la combinación y bloquear el acceso después de tres intentos fallidos consecutivos.

## Funcionamiento

El programa crea una caja fuerte con una combinación inicial y realiza distintas pruebas para comprobar sus mecanismos de seguridad.

* **Apertura de la caja:** verifica si la combinación ingresada es correcta.
* **Control de intentos fallidos:** incrementa un contador cada vez que se ingresa una clave incorrecta.
* **Reinicio del contador:** cuando la clave es correcta, los intentos fallidos vuelven a cero.
* **Bloqueo automático:** después de tres intentos fallidos consecutivos, la caja queda bloqueada.
* **Cambio de combinación:** permite actualizar la clave únicamente si la caja no está bloqueada y se proporciona la combinación actual correcta.
* **Protección de la clave:** la combinación se mantiene privada y no puede consultarse directamente desde otras clases.
* **Restricción de acceso:** una vez bloqueada, la caja no acepta nuevas aperturas ni cambios de combinación.

## Clases principales

### `CajaFuerte`

Representa una caja fuerte con una combinación secreta y un mecanismo de bloqueo por intentos fallidos.

**Atributos:**

* `MAX_INTENTOS`: constante que establece el máximo de tres intentos fallidos.
* `combinacion`: almacena la clave secreta.
* `bloqueada`: indica si la caja está bloqueada.
* `intentosFallidos`: registra la cantidad de intentos incorrectos consecutivos.

**Métodos principales:**

* `isBloqueada()`: devuelve el estado de bloqueo de la caja.
* `getIntentosFallidos()`: devuelve el contador de intentos fallidos.
* `abrir(String intentoClave)`: comprueba la combinación, actualiza el contador y bloquea la caja cuando se alcanza el límite.
* `cambiarCombinacion(String claveActual, String nuevaClave)`: modifica la combinación después de validar la clave actual y la nueva clave.

### `Main`

Contiene el método `main`, crea una caja fuerte y ejecuta pruebas de apertura, cambio de combinación, reinicio del contador y bloqueo automático.

## Conceptos de programación utilizados

* **Programación orientada a objetos (POO):** representación de una caja fuerte mediante una clase.
* **Encapsulamiento:** protección de los atributos mediante el modificador `private`.
* **Constantes:** utilización de `static final` para establecer el máximo de intentos.
* **Validación de datos:** comprobación de las claves ingresadas antes de realizar operaciones.
* **Estructuras condicionales:** uso de `if` para controlar las aperturas, los cambios y el bloqueo.
* **Contadores:** registro de los intentos fallidos consecutivos.
* **Métodos con retorno booleano:** indican si una operación fue exitosa.
* **Control de acceso:** restricción de las operaciones cuando la caja está bloqueada.

## Tecnologías utilizadas

* Java
* IntelliJ IDEA
* Git y GitHub

## Ejecución

<img width="621" height="657" alt="image" src="https://github.com/user-attachments/assets/3bb68c4a-085f-4735-b96e-1e57f68647b1" />

## Resultado esperado

El programa debe demostrar que:

* La combinación inicial permite abrir la caja.
* Una combinación incorrecta impide la apertura.
* El cambio de combinación requiere la clave actual correcta.
* Una apertura exitosa reinicia el contador de intentos fallidos.
* Tres intentos incorrectos consecutivos bloquean la caja.
* Una vez bloqueada, no es posible abrirla ni cambiar su combinación.

El estado final esperado es `bloqueada: true`.

## Objetivo del ejercicio

Aplicar los principios de encapsulamiento, validación y control de acceso en Java mediante una clase que administre una combinación secreta, limite los intentos fallidos y bloquee las operaciones cuando se detecten demasiados errores.
