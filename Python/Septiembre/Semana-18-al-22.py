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
