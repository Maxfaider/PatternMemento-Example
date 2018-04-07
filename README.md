# PatternMemento -Example

![vista-logica](vista-logica.png)


## Prop�sito
Representa y externaliza el estado interno de un objeto sin violar la encapsulaci�n, de forma que �ste puede volver a dicho estado m�s tarde.

Hoy en d�a, muchos aplicativos permiten el "deshacer" y "rehacer" de manera muy sencilla. Para ciertos aplicativos es casi una obligaci�n tener estas funciones y ser�a impensado el hecho que no las posean. Sin embargo, cuando queremos llevar esto a c�digo puede resultar complejo de implementar. Este patr�n de dise�o permite capturar y exportar el estado interno de un objeto para que luego se pueda restaurar, sin romper la encapsulaci�n.

Su finalidad es almacenar el estado de un objeto (o del sistema completo) en un momento dado, de manera que se pueda restaurar posteriormente si fuese necesario.

