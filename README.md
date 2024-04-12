Trabajo Practico Spark 
de la materia Arquitectura de Software 
de la carrera Ingenieria en Informatica UNSL

En este trabajo practico tuve que realizar los siguientes ejercicios:

- Ejercicio 1: Dada una palabra ingresada por el usuario, devolver si es palíndromo o no.
- Ejercicio 2: Dado el radio de una circunferencia ingresados por el usuario, calcular su perímetro y área.
- Ejercicio 3: Registrar en memoria un conjunto de personas, sus hijos y los nietos (utilice listas parametrizadas). 
  Obtener las personas registradas y los hijos y los nietos de alguna de esas personas.
  Diseñar el modelo arquitectónico en UML construyendo el modelo de componentes y conectores, y el modelo dinámico entre componentes (diagrama de secuencia).
- Ejercicio 4: Devolver los teléfonos para emergencias, según el dato solicitado por el usuario.
  Por ejemplo, si solicita “policía”, que devuelva “911”. Lo mismo con los bomberos, violencia de género y otros, cargados en memoria durante la ejecución del programa.
- Ejercicio 5: Dado un monto en dinero ingresados por el usuario, devolver el valor que tendrá el mismo luego de un plazo indicado por el usuario (ej.: 1 año, 5 meses, etc),
  de acuerdo con la inflación propuesta por el gobierno Argentino.
  Diseñar el modelo arquitectónico en UML construyendo el modelo de componentes y conectores, y el modelo dinámico entre módulos (diagrama de secuencia).
- Ejercicio 6: Dado un artículo por código solicitado por el usuario, retornar la descripción, el precio neto, el IVA y el total (neto+IVA) del mismo.
- Ejercicio 7: Dado un autor ingresado por el usuario, devolver los libros escritos por él.
- Ejercicio 8: Crear un servicio REST que devuelva los resultados de un torneo de fútbol local en que participan 8 equipos. Servicios a desarrollar:
  - todos los partidos, jugados y por jugar.
  - partidos de fútbol jugados por un equipo dado con el resultado obtenido. Por ejemplo, al consultar sobre “Boca”, se deberá devolver:
        [{"local":"River","visitante":"Boca","goleslocal":"2", "golesvisitante":"2","jugado":true}]
  - equipos con los que jugó de local. Por ejemplo River:
        [{"local":"River","visitante":"Boca","goleslocal":"2", "golesvisitante":"2","jugado":true}, {"local":"River","visitante":"Racing","goleslocal":"0", "golesvisitante":"0","jugado":true}]
  - equipos con los que debe jugar de visitante. Por ejemplo Racing:
        [{"local":"Aldocivi","visitante":"Racing","goleslocal":"", "golesvisitante":"","jugado":false}, {"local":"Talleres","visitante":"Racing","goleslocal":"", "golesvisitante":"","jugado":false}]
  - cantidad de partidos ganados por un equipo
  - cantidad de goles convertidos por un equipo
  Diseñar el modelo arquitectónico en UML construyendo el modelo de componentes y conectores, y el modelo dinámico entre módulos (diagrama de secuencia).
