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
