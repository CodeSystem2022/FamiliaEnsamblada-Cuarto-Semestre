# Ejercicio Jesús Mercado
# mi_clase.py
class MiClase:
    """
    Este es un ejemplo de la documentación
    de esta clase.
    es sólo para saber que aquí está MiClase
    """
    def __init__(self):
        """
        Aquí está el método dunder init
        Este método es el de inicio
        para esta clase
        """

    def mi_metodo(self, param1, param2):
        """
        Este es el método creado por mi que recibe parámetros
        Detectó los parámetros automaticamente
        :param param1: Este es el parámetro número 1
        :param param2: Este es el parámetro número 2
        :return: Este es el valor de retorno
        """
      
# doc_str.py
from mi_clase import MiClase

# help(MiClase)

# print/MiClase.__doc__)
# print(MiClase.__init__.__doc__)
# print(MiClase.mi_metodo.__doc__)
print(MiClase.mi_metodo)
print(type(MiClase.mi_metodo))

# str_inmutable.py
# help(str.capitalize)
mensaje1 = 'hola mundo'
mensaje2 = mensaje1.capitalize()
print(f'Mensaje1: {mensaje1}, id: {id(mensaje1)}')
print(f'Mensaje2: {mensaje2}, id: {id(mensaje2)}')

mensaje1 += 'Adios'
print(f'Mensaje1: {mensaje1}, id: {id(mensaje1)}')

# metodo_join.py
# help(str.join)

tupla_str = ('Hola', 'alumnos', 'Tecnicatura', 'Universitaria')
mensaje = ' '.join(tupla_str)
print(f'Mensaje: {mensaje}')

lista_cursos = ['Java', 'Python', 'Angular', 'Spring']
mensaje = ', '.join(lista_cursos)
print(f'Mensaje: {mensaje}')

cadena = 'HolaMundo'
mensaje = ', '.join(cadena)
print(f'Mensaje: {mensaje}')

diccionario = {'nombre': 'Juan', 'apellido': 'Perez', 'edad': '18'}
llaves = '-'.join(diccionario.keys())
valores = '-'.join(diccionario.values())
print(f'Llaves: {llaves}, Type: {type(llaves)}')
print(f'Valores: {valores}, Type: {type(valores)}')

# metodo_split.py
# help(str.split)

cursos = 'Java JavaScript Node Python Diseño'
lista_cursos = cursos.split()
print(f'Lista de cursos: {lista_cursos}')
print(type(lista_cursos))

cursos_separados_coma = 'Java,Python,Node,JavaScript,Spring'
lista_cursos = cursos_separados_coma.split(',', 2)
print(f'Lista de cursos: {lista_cursos}')
print(len(lista_cursos))

# Fin Ejercicio Jesús Mercado
