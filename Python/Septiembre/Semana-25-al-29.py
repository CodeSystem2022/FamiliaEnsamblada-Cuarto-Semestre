// Ejercicio Jesús Mercado
// Corresponde al archivo dar_formato_str.py
# dar formato

nombre = 'Ariel'
edad = 28
mensaje_con_formato = 'Mi nombre es %s y tengo %d años'% (nombre, edad)

# Creamos una tupla
persona = ('Carla', 'Gomez', 5000.00)
mensaje_con_formato = 'Hola %s %s. Tu sueldo es %.2f' # % persona # Aquí le pasamos el objeto que es tupla
# print(mensaje_con_formato % persona)

nombre = 'Juan'
edad = 19
sueldo = 3000
# mensaje_con_formato = 'Nombre {} Edad {} Sueldo {:.2f}'.format(nombre, edad, sueldo)

# mensaje = 'Nombre {0} Edad {1} Sueldo{2:.2f}'.format(nombre, edad, sueldo)
# print(mensaje)

mensaje = 'Nombre {n} Edad {e} Sueldo {:.2f}'.format(n=nombre, e=edad, s=sueldo)
# print(mensaje)

diccionario = {'nombre': 'Ivan', 'edad': 35, 'sueldo':8000.00}
mensaje = 'Nombre {dic[nombre} Edad {dic[edad]} Sueldo {dic[sueldo]:.2f}'.format(dic=diccionario)
print(mensaje)

// Corresponde al archivo f_string.py
nombre = 'Pepe'
edad = 28
sueldo = 3000
mensaje = f'Nombre {nombre} Edad {edad} Sueldo {sueldo:.2f}'
print(mensaje)

print(nombre, edad, sueldo, sep=', ')
// Fin Ejercicio Jesús Mercado
