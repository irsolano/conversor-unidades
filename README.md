# Conversor de unidades

Aplicación de consola en Java que permite convertir entre distintas unidades de medida: kilómetros a millas, Celsius a Fahrenheit, kilogramos a libras y centímetros a pulgadas.

Proyecto de la asigantura Introduccion a la Ingenieria de Software

## Integrantes y roles

| Integrante | Rol | Rama | Funcionalidad |
|---|---|---|---|
| Ivan Solano | Integrador y Dev 1 | feature/km-a-millas | Kilómetros a millas |
| laura Ramirez | Dev 2 | feature/celsius-a-fahrenheit | Celsius a Fahrenheit |
| Felipe Martinez | Dev 3 | feature/kg-a-libras | Kilogramos a libras |
| Ivan Solano | Dev 4 | feature/cm-a-pulgadas | Centímetros a pulgadas |

El Integrador creó el repositorio, agregó a los colaboradores, subió el proyecto base y protegió la rama main.

## Funcionalidades

- Menú principal con 5 opciones.
- Conversión de kilómetros a millas.
- Conversión de grados Celsius a Fahrenheit.
- Conversión de kilogramos a libras.
- Conversión de centímetros a pulgadas.
- Validación básica de los valores ingresados.

## Estructura del proyecto

    conversor-unidades/
    ├── README.md
    ├── .gitignore
    └── src/
        ├── Main.java
        ├── ConversorUnidades.java
        └── ConversorUnidadesCli.java

## Instrucciones de ejecución

Requisitos: tener instalado el JDK de Java (versión 11 o superior).

1. Clonar el repositorio:

        git clone URL_DEL_REPOSITORIO
        cd conversor-unidades

2. Compilar:

        javac -d out src/*.java

3. Ejecutar:

        java -cp out Main
