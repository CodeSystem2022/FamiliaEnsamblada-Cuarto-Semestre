#Ejercicio Gerardo Duckwitz
from logger_base import log
class UsuarioDAO:
    '''
    DAO -> Data Access Object para la tabla usuario
    CRUD -> Create-read-update-delete
    '''
    _SELECT = 'SELECT * FROM usuario ORDER BY id_usuario'
    _INSERTAR = 'INSERT INTO usuario(username, password) VALUES (%s,%s)'
    _ACTUALIZAR = 'UPDATE usuario SET username=%s, password=%s WHERE id_usuario=%s'
    _ELIMINAR = 'DELETE FROM usuario WHERE id_usuario=%s'

    @classmethod
    def seleccionar(cls):
        with CursorDelPool() as cursor:
            log.debug('Seleccionando usuarios')
            cursor.execute(cls._SELECT)
            registros = cursor.fetchall()
            usuarios = []
            for registro in registros:
                usuario = Usuario(registro[0], registro[1], registro[2])
                usuarios.append(usuario)
            return usuarios
    @classmethod
    def insertar(cls, usuario):
        with CursorDelPool() as cursor:
            log.debug(f'Usuario a insertar: {usuario}')
            valores = (usuario.username, usuario.password)
            cursor.execute(cls._INSERTAR, valores)
            return cursor.rowcount

    @classmethod
    def actualizar(cls, usuario):
        with CursorDelPool() as cursor:
            log.debug(f'Usuario a actualizar {usuario}')
            valores = (usuario.username, usuario.password, usuario.id_usuario)
            cursor.execute(cls._ACTUALIZAR, valores)
            return cursor.rowcount

    @classmethod
    def eliminar(cls, usuario):
        with CursorDelPool() as cursor:
            log.debug(f'Usuario a eliminar: {usuario}')
            valores=(usuario.id_usuario,)
            cursor.execute(cls._ELIMINAR,valores)
            return cursor.rowcount

#Fin ejercicio Gerardo Duckwitz


#Ejercicios Matías Villa

from capa_datos_personas.Usuario import Usuario
from capa_datos_personas.usuario_dao import UsuarioDAO
from logger_base import log


opcion = None
while opcion != 5:
    print('Opciones: ')
    print('1.Listar Usuarios')
    print('2.Agregar Usuarios')
    print('3.Modificar usuarios')
    print('4.Eliminar usuario')
    print('5.Salir')
    opcion= int(input('Digite una opción (1-5): '))
    if opcion == 1 :
        usuarios = UsuarioDAO.seleccionar() #desde personaDAO se añade listar
        for usuario in usuarios:
            log.info(usuario)

    elif opcion == 2:
        username_var = input('Digite el nombre de usuario: ')
        password_var = input('Digite contraseña: ')
        usuario = Usuario(username=username_var, password=password_var)
        usuario_insertado = UsuarioDAO.insertar(usuario)
        log.info(f'Usuario insertado: {usuario_insertado}')

    elif opcion == 3:
        id_usuario_var = int(input('Digite id de usuario a modificar: '))
        username_var = input('Digite el nombre del usuario a modificar: ')
        password_var = input('Digite la contraseña del usuario a modificar: ')
        usuario = Usuario(id_usuario=id_usuario_var, username=username_var, password=password_var)
        usuario_actualizado = UsuarioDAO.actualizar(usuario)
        log.info(f'Usuario actualizado: {usuario_actualizado}')
    elif opcion == 4:
        id_usuario_var= int(input('Digite el usuario  a eliminar'))
        usuario = Usuario(id_usuario=id_usuario_var)
        usuario_eliminado= UsuarioDAO.eliminar(usuario)
        log.info(f'Usuario eliminado: {usuario_eliminado}')
else:
    log.info('Salimos de la Aplicación, Hasta pronto!')

#Fin Ejercicio Matías
