// Ejercicio Jesús Mercado
// metodo_split.py

# help(str.split)

cursos = 'Java JavaScript Node Python Diseño'
lista_cursos = cursos.split()
print(f'Lista de cursos: {lista_cursos}')
print(type(lista_cursos))

cursos_separados_coma = 'Java,Python,Node,JavaScript,Spring'
lista_cursos = cursos_separados_coma.split(',', 2)
print(f'Lista de cursos: {lista_cursos}')
print(len(lista_cursos))

// Fin Ejercicio Jesús Mercado

//Ejercicio Gerardo Duckwitz

  

class MiClase:
    '''
    Este es un ejemplo de la documentacion
    de esta clase.
    es solo para saber que aqui esta MiClase
    '''
    def __init__(self):
        '''
        Aqui esta el metodo dunder init
        Este metodo es el de inicio
        para esta clase
        '''

    def mi_metodo(self, param1, param2):
        '''
        Este  es el metodo creado por mi que recibe  parametros
        Detecto los parametros automaticamente
        :param param1: Este es el parametro numero 1
        :param param2: Este es el parametro numero 2
        :return: Este es el valor de retorno
        '''

  #Archivo doc_str

  from mi_clase import MiClase

#help(MiClase)
print(MiClase.__doc__)


//Fin ejercicio Gerardo Duckwitz

#Ejercicio de Yesica López

#str_inmutable.py

#help(str.capitalize)
mensaje1='hola mundo'
mensaje2= mensaje1.capitalize()
print(f'Mensaje1: {mensaje1}, id: {id(mensaje1)}')
print(f'Mensaje2: {mensaje2}, id: {id(mensaje2)}')

mensaje1 += 'Adios'
print(f'Mensaje1: {mensaje1}, id: {id(mensaje1)}')


#metodo_join.py

tupla_str= ('Hola', 'alumnos', 'Tecnicatura', 'Universitaria')
mensaje= ' '.join(tupla_str)
print(f'Mensaje: {mensaje}')

cadena= 'HolaMundo'
mensaje= '.'.join(cadena)
print(f'Mensaje: {mensaje}')

diccionario= {'nombre': 'Juan', 'apellido': 'Perez', 'edad': '18'}
llaves= '-'.join(diccionario.key())
valores= '-'.join(diccionario.value())
print(f'llaves: {llaves}, Type: {type(llaves)}')
print(f'Valores: {valores}, Type: {type(valores)}')


#Fin Ejercicio Yesica López

