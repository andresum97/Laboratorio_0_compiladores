# Laboratorio_0_compiladores Analizador Léxico y Análizador Sintáctico de Decaf

## Compilar grámtica en Powershell
```
antlr4 Decaf.g4
javac Decaf*.java
```

## Mostrar análisis léxico y árbol sintáctico
```
grun <nombre_gramatica> <start_rule_name> -gui -tokens <archivo_entrada>
```

Se mostraran los arboles por archivo, y los tokens correspondientes de cada archivo se encuentran en la carpeta de tokens_files

### Archivo Prueba.decaf

<p align="center">
  <img src="https://github.com/andresum97/Laboratorio_0_compiladores/blob/main/images/arbol_Prueba.png">
</p>


### Archivo WhileP.decaf

<p align="center">
  <img src="https://github.com/andresum97/Laboratorio_0_compiladores/blob/main/images/arbol_WhileP.png">
</p>



### Archivo boolP.decaf

<p align="center">
  <img src="https://github.com/andresum97/Laboratorio_0_compiladores/blob/main/images/arbol_boolP.png">
</p>

### Archivo ForLoopP.decaf
#### Este archivo posee un error en el cual en el ciclo for se removieron los parentesis

<p align="center">
  <img src="https://github.com/andresum97/Laboratorio_0_compiladores/blob/main/images/arbol_ForLoopP.png">
</p>

