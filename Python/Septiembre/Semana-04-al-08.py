# Ejercicio Gerardo Duckwitz

import math
from decima import Decimal
# NaN (Not a Number)
a =  float('NaN')
print(f'a: {a}')

#Modulo math
a = float('nan')
print(f'Es de tipo NaN(Not a number): {math.isnan(a)}')

#Modulo decimal
a = Decimal('nan')
print(f'Es de tipo NaN(Not a number): {math.isnan(a)}')


#Bool contiene los valores True y False
#Los tipos numericos, es false para el 0 (cero), true para los demas valores

valor = 0
resultado = bool(valor)
print(f'Valor: {valor}, Resultado: {resultado}')

valor = -1
resultado = bool(valor)
print(f'Valor: {valor}, Resultado: {resultado}')


#Tipo string -> False '', True demas valores
valor = ''
resultado = bool(valor)
print(f'Valor: {valor}, Resultado: {resultado}')

//Fin ejercicio Gerardo Duckwitz

// Ejercicio Jesús Mercado

import math
from decimal import Decimal

# NaN(Not a Number)
a = float('nan')
print(f'a: {a}')

# Módulo math
a = float('nan')
print(f'Es de tipo NaN(Not a Number)?: {math.isnan(a)}')

# Módulo decimal
a = Decimal('nan')
print(f'Es de tipo NaN(Not a Number)?: {math.isnan(a)}')

# Bool contiene los valores True y False
# Los tipos numéricos, es false para el 0 (cero), true para los demás valores
valor = 0
resultado = bool(valor)
print(f'valor: {valor}, Resultado: {resultado}')

valor = 0.1
resultado = bool(valor)
print(f'valor: {valor}, Resultado: {resultado}')

# Tipo string -> False '', True demás valores
valor = ''
resultado = bool(valor)
print(f'valor: {valor}, Resultado: {resultado}')

valor = 'Hola'
resultado = bool(valor)
print(f'valor: {valor}, Resultado: {resultado}')

# Tipo colecciones -> False para colecciones vacias
# Tipo colecciones -> True para todas las demás
# lista
valor = []
resultado = bool(valor)
print(f'valor de una lista vacía: {valor}, Resultado: {resultado}')

valor = [2, 3, 4]
resultado = bool(valor)
print(f'valor de una lista con elementos: {valor}, Resultado: {resultado}')

# Tupla
valor = ()
resultado = bool(valor)
print(f'valor de una tupla vacía: {valor}, Resultado: {resultado}')

valor = (5,)
resultado = bool(valor)
print(f'valor de una tupla con elementos: {valor}, Resultado: {resultado}')

# Diccionario
valor = {}
resultado = bool(valor)
print(f'valor de un diccionario vacío: {valor}, Resultado: {resultado}')

valor = {'Nombre':'Juan', 'Apellido':'Perez'}
resultado = bool(valor)
print(f'valor de un diccionario con elementos: {valor}, Resultado: {resultado}')

# Sentencias de control con bool
if (1,):
    print('Regresa verdadero')
else:
    print('Regresa falso')

# Ciclos
variable = 3
while variable:
    print('Regresa verdadero')
    break
else:
    print('Regresa falso')

  
// Fin Ejercicio Jesús Mercado

#Ejercicio de Yesica López

#Bool contiene los valores True y False
#Los tipos numéricos, es false para el 0 (cero), true para los demás valores

valor = 0
resultado = bool(valor)
print(f'Valor: {valor}, Resultado: {resultado}')

valor = 15
resultado = bool(valor)
print(f'Valor: {valor}, Resultado: {resultado}')


#Tipo string -> False ' ', True demás valores
valor = ' '
resultado = bool(valor)
print(f'Valor: {valor}, Resultado: {resultado}')

valor = 'Hola'
resultado = bool(valor)
print(f'Valor: {valor}, Resultado: {resultado}')


#Tipo colecciones -> False para colecciones vacias
#Tipo colecciones -> True para todas las demás

#Lista
valor = [ ]
resultado = bool(valor)
print(f'valor de una lista vacia: {valor}, Resultado: {resultado}')

valor = [2,3,4]
resultado = bool(valor)
print(f'valor de una lista con elementos: {valor}, Resultado: {resultado}')

#Tupla 
valor = ( )
resultado = bool(valor)
print(f'valor de una tupla vacia: {valor}, Resultado: {resultado}')

valor = (5, )
resultado = bool(valor)
print(f'valor de una tupla de elementos: {valor}, Resultado: {resultado}')

#Diccionario
valor = { }
resultado = bool(valor)
print(f'valor de un diccionario vacio: {valor}, Resultado: {resultado}')

valor = {'Nombre': 'Juan', 'Apellido': 'Perez'}
resultado = bool(valor)
print(f'valor de una diccionario con elementos: {valor}, Resultado: {resultado}')


#Sentencias de control con bool

if 'Hola':
    print('Regresa verdadero')
else:
    print('Regresa False')


#Ciclos

variable = 18
while variable:
    print('Regresa verdadero')
    break
else:
    print('Regresa falso')

#Fin Ejercicio Yesica López
