# Guion Modelo Porrazo

## Interfaces

### Interface ProdcutBuilder
 - Tendra interfaces hijas (Atributos obligados y opcionales).
 - No se que pinta aqui porque no se usa ( Opinion personal, no Hate ).

### Interfaces Obligatorias
 - Se crearan el mismo numero de atributos requerido menos 1 (n-1).
 - Ddevolveran la siguiente interfaz Obligatoria.
 - La ultima ddevolvera interfaz de Opcionales.

### Interface Opcional
 - Solo habra una, donde se meteran todos metodos para obtener todos los atributos opcionales.
 - Todos los metodos menos build(), retornara una interface Opcional.
 - Tendra si o si el metodo build():Product -> retornando el producto.

## Clase

### Cosas en contras
- No pone sett y get, cosa que no me gusta , ni me cuadra
- Deberia de tener setters 

### Setters
- Que BuildProuct sete los valores

## BuilderProuct (Clase Implementaa)
- Se implementan las interfaces Obligasas y la interface Opcional

## Metodo Builder() en la Clase Product
- El metodo builder() retornara la interfaz del primer atributo Obligado.