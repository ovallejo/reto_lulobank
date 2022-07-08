# Automatización Dummy Rest API Example

## Comenzando 🚀
 _Estas instrucciones te permitirán ejecutar la automatización de Dummy Rest API Example._
  * _Obtener todos los datos de los empleados_
  * _Obtener los datos de un solo empleado_
  * _Crear un nuevo registro en la base de datos_
  * _Actualizar el registro de un empleado_
  * _Borrar un registro de empleado_

## Pre-Requisitos 🌎

  *  _JDK 8_

## Ejecución de las Pruebas⛷️

### Ejecución del set de Prueba de Obtener todos los datos de los empleados
```
gradlew clean test --tests *ObtenerTodosDatosEmpleadosTest -i

```

### Ejecución del set de Prueba de Obtener los datos de un solo empleado
```
gradlew clean test --tests *ObtenerDatosEmpleadoTest -i

```

### Ejecución del set de Prueba de Crear un nuevo registro en la base de datos
```
gradlew clean test --tests *CrearRegistroEmpleadoTest -i

```

### Ejecución del set de Prueba de Actualizar el registro de un empleado
```
gradlew clean test --tests *ActualizarRegistroEmpleadoTest -i

```

### Ejecución del set de Prueba de Borrar un registro de empleado
```
gradlew clean test --tests *BorrarRegistroEmpleadoTest -i

```


## Construido con 🛠

_Herramientas utilizadas para crear el proyecto_
* [Gradle](https://maven.apache.org/) - Gradle es una herramienta de automatización de construcción de código abierto que está diseñada para ser lo suficientemente flexible como para construir casi cualquier tipo de software.
* [Serenity-BDD](http://www.thucydides.info/) - Es una librería de código abierto que ayuda a escribir pruebas de aceptación automatizadas de mayor calidad y más rápido. Sus principales características son: Escribir test flexibles y fáciles de mantener.


## Versionado 📌
Usamos [GitHub](https://github.com/ovallejo/reto_lulobank) para el versionado del proyecto.