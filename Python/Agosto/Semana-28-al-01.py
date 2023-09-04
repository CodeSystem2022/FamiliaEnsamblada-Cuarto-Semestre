#Ejercicio Gerardo Duckwitz
# Profundizando en los sistemas de numeracion

#Sistema decimal
a = 10
print(f'a decimal: {a}')

#Sistema binario
a = 0b1010
print(f'a binario: {a}')

#Sistema octal
a = 0o12
print(f'a octal: {a}')

# Sistema hexadecimal
a = 0xA
print(f'a hexadecimal: {a}')

# Base decimal
a = int('23', 10)
print(f'a = base decimal: {a}')

# Base binario
a = int('10111', 2)
print(f'a = base binario: {a}')

# Base octal
a = int('27', 8)
print(f'a = base octal: {a}')

#Base hexadecimal
a = int('17', 16)
print(f'a = base hexadecimal: {a}')

#Base 5 sus valores son de 0 a 4
a = int('34', 5)
print(f'a = base 5: {a}')


#Fin ejercicio Gerardo Duckwitz

#Ejercicio de Yesica López

#Profundizando en el tipo float
a = 3.0

#Constructor de tipo float -> puede recibir int y str
a = float(10) # Le pasamos un tipo entero (int)
a = float('10')
print(f'a: {a:.2f}')

#Notamos exponencial (valores positivos o negativos)
a = 3e5
print(f'a: {a:.2f}')

a = 3e-5
print(f'a: {a:.5f}')

#Cualquier calculo que incluye un float, todo cambia a float

a= 4.0 + 5
print(a)
print(type(a))

#Fin Ejercicio Yesica López

# Ejercício Jesús Mercado

import math
from decimal import Decimal

# Manejo de valores infinitos
infinito_positivo = float('inf')
print(f'Infinito Positivo: {infinito_positivo}')
print(f'Es infinito?: {math.isinf(infinito_positivo)}')

infinito_negativo = float('-inf')
print(f'Infinito Negativo: {infinito_negativo}')
print(f'Es infinito?: {math.isinf(infinito_negativo)}')

# Módulo math
infinito_positivo = math.inf
print(f'Infinito Positivo: {infinito_positivo}')
print(f'Es infinito?: {math.isinf(infinito_positivo)}')

infinito_negativo = -math.inf
print(f'Infinito Negativo: {infinito_negativo}')
print(f'Es infinito?: {math.isinf(infinito_negativo)}')

# Módulo decimal
infinito_positivo = Decimal('Infinity')
print(f'Infinito Positivo: {infinito_positivo}')
print(f'Es infinito?: {math.isinf(infinito_positivo)}')

infinito_negativo = Decimal('-Infinity')
print(f'Infinito Negativo: {infinito_negativo}')
print(f'Es infinito?: {math.isinf(infinito_negativo)}')

# Fin Ejercicio Jesús Mercado

#Ejercicio de Jose Remaggi

#Profundizando en el tipo float
a = 3.0

#Constructor de tipo float -> puede recibir int y str
a = float(10) # Le pasamos un tipo entero (int)
a = float('10')
print(f'a: {a:.2f}')

#Notamos exponencial (valores positivos o negativos)
a = 3e5
print(f'a: {a:.2f}')

a = 3e-5
print(f'a: {a:.5f}')

#Cualquier calculo que incluye un float, todo cambia a float

a= 4.0 + 5
print(a)
print(type(a))

#Fin Ejercicio Jose Remaggi

