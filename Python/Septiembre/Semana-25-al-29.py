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

//Ejercicio Gerardo Duckwitz
  
# dar formato a un string
nombre  ='Ariel'
edad = 28
mensaje_con_formato = 'Mi nombre es %s y tengo %d años'%(nombre, edad)

#Creamos una tupla
persona = ('Carlos', 'Gomez', 5000.00)
mensaje_con_formato = 'Hola %s %s, tu sueldo es %.2f' #% persona # Aqui le pasamos el objeto que es la tupla

#print(mensaje_con_formato  % persona)

nombre = 'Juan'
edad = 19
sueldo = 3000
#mensaje_con_formato = 'Nombre {} Edad {} Sueldo {:2f}'.format(nombre, edad, sueldo)
mensaje = 'Nombre {0} Edad {1} Sueldo {2:.2f}'.format(nombre, edad, sueldo)
#print(mensaje)
mensaje = 'Nombre {n} Edad {e} Sueldo {s:.2f}'.format(n=nombre, e=edad, s=sueldo)

#print(mensaje)

diccionario = {'nombre': 'Ivan', 'edad' : 35, 'sueldo':8000.00}

mensaje = 'Nombre {persona[nombre]} Edad{persona[edad]} Sueldo{persona[sueldo]:.2f}'.format(persona=diccionario)
print(mensaje)

//Fin ejercicio Gerardo Duckwitz

//Ejercicio Matías Villa
#Dar formato a un string
nombre='Ariel'
edad=28
mensaje_con_formato='Mi nombre es %s y tengo %d años'%(nombre,edad) #parametro posicional apunta a la varible

print(mensaje_con_formato)
#tupla
persona=('Carla','Gomez',5000.00)
mensaje_con_formato='Hola %s %s. Tu sueldo es: %.2f' #% persona #Aqui le pasamos el objeto
#print(mensaje_con_formato %persona)

nombre='Juan'
edad=19
sueldo=3000
mensaje_con_formato='Nombre {} Edad {} Sueldo {:.2f}'.format(nombre, edad, sueldo) #placeHolder(marcador de posición)
print(mensaje_con_formato)
mensaje='Nombre {0} Edad {1} sueldo {2:.02f}'.format(nombre, edad, sueldo)
print(mensaje)

diccionario = {'nombre':'Ivan','edad':35,'sueldo': 8000.00}
mensaje= 'Nombre{dic[nombre]} Edad{dic[edad]} Sueldo{dic[sueldo]}:.2f'.format(dic=diccionario)
print(mensaje)

nombre = 'Pepe'
edad= 28
sueldo=5000
mensaje= f'Nombre {nombre} Edad {edad} sueldo {sueldo:.2f}'
print(mensaje)

print(nombre,edad,sueldo, sep=', ')

//Fin ejercicio Matías

#Ejercicio Jose Remaggi
# Corresponde al archivo dar_formato_str.py
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

#Corresponde al archivo f_string.py
nombre = 'Pepe'
edad = 28
sueldo = 3000
mensaje = f'Nombre {nombre} Edad {edad} Sueldo {sueldo:.2f}'
print(mensaje)

print(nombre, edad, sueldo, sep=', ')
#Fin Ejercicio Jose Remaggi

#Ejercicio Anabel Alesci
#Dar formato a un string
nombre='Ariel'
edad=28
mensaje_con_formato='Mi nombre es %s y tengo %d años'%(nombre,edad) #parametro posicional apunta a la varible

print(mensaje_con_formato)
#tupla
persona=('Carla','Gomez',5000.00)
mensaje_con_formato='Hola %s %s. Tu sueldo es: %.2f' #% persona #Aqui le pasamos el objeto
#print(mensaje_con_formato %persona)

nombre='Juan'
edad=19
sueldo=3000
mensaje_con_formato='Nombre {} Edad {} Sueldo {:.2f}'.format(nombre, edad, sueldo) #placeHolder(marcador de posición)
print(mensaje_con_formato)
mensaje='Nombre {0} Edad {1} sueldo {2:.02f}'.format(nombre, edad, sueldo)
print(mensaje)

diccionario = {'nombre':'Ivan','edad':35,'sueldo': 8000.00}
mensaje= 'Nombre{dic[nombre]} Edad{dic[edad]} Sueldo{dic[sueldo]}:.2f'.format(dic=diccionario)
print(mensaje)

nombre = 'Pepe'
edad= 28
sueldo=5000
mensaje= f'Nombre {nombre} Edad {edad} sueldo {sueldo:.2f}'
print(mensaje)

print(nombre,edad,sueldo, sep=', ')

# Fin Ejercicio Anabel Alesci

#Ejercicio de Yesica López


#dar_formato_str.py

# dar formato a un string

nombre  ='Ariel'
edad = 28
mensaje_con_formato = 'Mi nombre es %s y tengo %d años' % (nombre, edad)

#Creamos una tupla
persona = ('Carla', 'Gomez', 5000.00)
mensaje_con_formato = 'Hola %s %s. Tu sueldo es %.2f'  #% persona # Aqui le pasamos el objeto que es la tupla

#print(mensaje_con_formato  % persona)

nombre = 'Juan'
edad = 19
sueldo = 3000
#mensaje_con_formato = 'Nombre {} Edad {} Sueldo {:2f}'.format(nombre, edad, sueldo)
#print(mensaje_con_formato)

#mensaje = 'Nombre {0} Edad {1} Sueldo {2:.2f}'.format(nombre, edad, sueldo)
#print(mensaje)

#mensaje = 'Sueldo {2:.2f} Edad {1} Nombre {0}'.format(nombre, edad, sueldo)
#print(mensaje)

mensaje = 'Nombre {n} Edad {e} Sueldo {s:.2f}'.format(n=nombre, e=edad, s=sueldo)
#print(mensaje)

diccionario = {'nombre': 'Ivan', 'edad': 35, 'sueldo': 8000.00}
mensaje = 'Nombre {dic[nombre]} Edad {dic[edad]} Sueldo {dic[sueldo]:.2f}'.format(dic=diccionario)
print(mensaje)


#f_string.py

nombre = 'Pepe'
edad = 28
sueldo = 3000
mensaje = f'Nombre {nombre} Edad {edad} Sueldo {sueldo:.2f}'
print(mensaje)

print(nombre, edad, sueldo, sep=', ')

#Fin Ejercicio Yesica lópez

//Ejercicio victoria zaccaro
//  dar_formato_str.py
nombre = 'Ariel'
edad = 28
mensaje_con_formato = 'Mi nombre es %s y tengo %d años'% (nombre, edad)

persona = ('Carla', 'Gomez', 5000.00)
mensaje_con_formato = 'Hola %s %s. Tu sueldo es %.2f' # % persona
#print(mensaje_con_formato % persona)

nombre = 'Juan'
edad = 19
sueldo = 3000
#mensaje_con_formato = 'Nombre {} Edad {} Sueldo {:.2f}'.format(nombre, edad, sueldo)

 #mensaje = 'Nombre {0} Edad {1} Sueldo{2:.2f}'.format(nombre, edad, sueldo)
#print(mensaje)

mensaje = 'Nombre {n} Edad {e} Sueldo {:.2f}'.format(n=nombre, e=edad, s=sueldo)
print(mensaje)

diccionario = {'nombre': 'Ivan', 'edad': 35, 'sueldo':8000.00}
mensaje = 'Nombre {dic[nombre} Edad {dic[edad]} Sueldo {dic[sueldo]:.2f}'.format(dic=diccionario)
print(mensaje)

//archivo f_string.py
nombre = 'Pepe'
edad = 28
sueldo = 3000
mensaje = f'Nombre {nombre} Edad {edad} Sueldo {sueldo:.2f}'
#print(mensaje)

print(nombre, edad, sueldo, sep=', ')
//fin ejercicio victoria zaccaro
