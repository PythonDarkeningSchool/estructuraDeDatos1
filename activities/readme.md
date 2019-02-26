# Listas enlazadas simples

## Definicion

Las listas son estructuras de datos que permiten tener cierta flexibilidad en su manejo, pueden crecer o acortarse según se lo requiera, existen varias formas de implementar una lista en Java en este caso se presenta un ejemplo en código utilizando punteros mediante la referencia a objetos.

## Diagrama

![Lista simple enlazada](img/lista_enlazada_simple.png)

## Caracteristicas

- El último nodo de la lista no apunta a ninguno (null).
- Se accede a la lista mediante el primer nodo o también llamado inicio de la lista.
- No tiene acceso aleatorio es decir para acceder a un valor se debe recorrer toda la lista.

## Operaciones basicas

- agregar (valor): agrega el valor al final de la lista.
- insertar (referencia, valor): inserta el valor después del valor de referencia en la lista. 
- remover (referencia): elimina el nodo con el valor que coincida con la referencia. 
- editar (referencia): actualiza el valor de nodo con el valor que coincida con la referencia.
- esVacia (): retorna true si la lista está vacía, false en caso contrario. 
- buscar (valor): retorna la true si el elemento existe en la lista, false caso contrario.
- eliminar(): elimina la lista
- listar (): imprime en pantalla los elementos de la lista.

# Listas doblemente enlazadas

Las listas doblemente enlazadas son estructuras de datos semejantes a las listas enlazadas simples.

La asignación de memoria es hecha al momento de la ejecución.

En cambio, en relación a la listas enlazada simple el enlace entre los elementos se hace gracias a dos punteros (uno que apunta hacia el elemento anterior y otro que apunta hacia el elemento siguiente).



El puntero **anterior** del primer elemento debe apuntar hacia `NULL` (el inicio de la lista).

El puntero **siguiente** del último elemento debe apuntar hacia `NULL` (el fin de la lista).



Para acceder a un elemento, la lista puede ser recorrida en ambos sentidos:

- comenzando por el inicio, el puntero **siguiente** permite el desplazamiento hacia el próximo elemento.

- comenzando por el final, el puntero **anterior** permite el desplazamiento hacia el elemento anterior.



## Operaciones basicas

- **Insertar**: inserta un nodo con dato x en la lista, pudiendo realizarse esta inserción al principio o final de la lista o bien en orden.
- **Eliminar**: elimina un nodo de la lista, puede ser según la posición o por el dato.
- **Buscar**: busca un elemento en la lista.
- **Localizar**: obtiene la posición del nodo en la lista.
- **Imprimir**: imprime los elementos de la lista



## Algoritmo

Pending ...



# Arboles

## Definicion

Un árbol se define como una colección de nodos donde cada uno además de almacenar información, guarda las direcciones de sus sucesores.

Los árboles representan las estructuras **no-lineales** y **dinámicas** de datos más importantes en computación.

- **Dinámicas**, puesto que la estructura árbol puede cambiar durante la ejecución de un programa.
- **No- lineales** puesto que a cada elemento del árbol pueden seguirle varios elementos.

## Caracteristicas

- **Hijo**: Es aquel nodo que siempre va a tener un nodo antecesor o padre, son aquellos que se encuentran en el mismo nivel
- **Padre**: Es aquel que tiene hijos y también puede tener o no antecesores.
- **Hermano**: Dos nodos son hermanos si son apuntados por el mismo nodo, es decir si tienen el mismo padre.
- **Raíz**: Es el nodo principal de un árbol y no tiene antecesores.
- **Hoja** o terminal: Son aquellos nodos que no tienen hijos o también los nodos finales de un árbol.
- **Interior**: Se dice que un nodo es interior si no es raíz ni hoja.
- **Nivel de un nodo**: Se dice que el nivel de un nodo es el numero de arcos que deben ser recorridos, partiendo de la raíz para llegar hasta el.
- **Altura del árbol**: Se dice que la altura de un árbol es el máximo de los niveles considerando todos sus nodos.
- **Grado de un nodo**: se dice que el grado de un nodo es el número de hijos que tiene dicho nodo.

## Tipos de arboles

- **Árboles Binarios:** Un árbol binario es un conjunto finito de elementos, el cual está vacío o dividido en tres subconjuntos separados: raíz del árbol, subárbol izquierdo y subárbol derecho
- **Árbol de búsqueda binario auto-balanceable:** Es el que intenta mantener su *altura*, o el número de niveles de nodos bajo la raíz, tan pequeños como sea posible en todo momento, automáticamente
- **Árboles AVL:** están siempre equilibrados de tal modo que para todos los nodos, la altura de la rama izquierda no difiere en más de una unidad de la altura de la rama derecha o viceversa.
- **Árboles Rojo-Negro :** Un árbol rojo-negro es un árbol binario de búsqueda en el que cada nodo tiene un atributo de color cuyo valor es **rojo** o **negro**.
- **Árboles AA:** utilizado para almacenar y recuperar información ordenada de manera eficiente
- **Árbol de segmento:** es una estructura de datos en forma de árbol para guardar intervalos o segmentos. Permite consultar cuál de los segmentos guardados contiene un punto.
- **Árboles Multicamino:** es un árbol ordenado cuyos nodos deben tener un número específico de hijos.
- **Árboles B:** Es un árbol de búsqueda que puede estar vacío o aquel cuyos nodos pueden tener varios hijos, existiendo una relación de orden entre ellos.

## Recorridos

### Preorden

1. Visitar la **Raíz**
2. Recorrer el subarbol **izquierdo**
3. Recorrer el subarbol **derecho**



### Inorden

1. Recorrer el subarbol **izquierdo**
2. Visitar la **raíz**
3. Recorrer el subarbol **derecho**



### Postorden

1. Recorrer el subarbol **izquierdo**
2. Recorrer el subarbol **derecho**
3. Visitar la **raíz**

# Fuentes

[Listas enlazadas simples](http://codigolibre.weebly.com/blog/listas-simples-en-java)

[Listas enlazadas dobles](http://coodigob.blogspot.com/2013/03/listas-enlazadas-dobles.html)

[Arboles en Java](https://blog.michelletorres.mx/arboles-en-java/)

