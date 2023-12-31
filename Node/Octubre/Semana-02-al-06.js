// Ejercicio Gerardo Duckwitz
function hola(nombre, miCallback) {
  setTimeout(function () {
    console.log("Hola " + nombre);

    miCallback(nombre);
  }, 1000);
}
function adios(nombre, otroCallback) {
  setTimeout(function () {
    console.log("Adios " + nombre);
    otroCallback();
  }, 1000);
}
console.log("Iniciando proceso...");
hola("Carlos", function (nombre) {
  adios(nombre, function () {
    console.log("Terminando proceso...");
  });
});
// hola("Carlos", function () {});
// adios("Carlos", function () {});

//Fin ejercicio Gerardo Duckwitz
// Ejercicio Jose Remaggi
function hola(nombre, miCallback) {
  setTimeout(function () {
    console.log("Hola " + nombre);

    miCallback(nombre);
  }, 1000);
}
function adios(nombre, otroCallback) {
  setTimeout(function () {
    console.log("Adios " + nombre);
    otroCallback();
  }, 1000);
}
console.log("Iniciando proceso...");
hola("Carlos", function (nombre) {
  adios(nombre, function () {
    console.log("Terminando proceso...");
  });
});
// hola("Carlos", function () {});
// adios("Carlos", function () {});

//Fin ejercicio Jose Remaggi

//Ejercicio de victoria zaccaro
function hola(nombre, miCallback) {
  setTimeout(function () {
    console.log("Hola " + nombre);

    miCallback(nombre);
  }, 1000);
}
function adios(nombre, otroCallback) {
  setTimeout(function () {
    console.log("Adios " + nombre);
    otroCallback();
  }, 1000);
}
console.log("Iniciando proceso...");
hola("Carlos", function (nombre) {
  adios(nombre, function () {
    console.log("Terminando proceso...");
  });
});
// hola("Carlos", function () {});
// adios("Carlos", function () {});
//Fin ejercicio victoria zaccaro

// Ejercicio Anabel Alesci
function hola(nombre, miCallback) {
  setTimeout(function () {
    console.log("Hola " + nombre);

    miCallback(nombre);
  }, 1000);
}
function adios(nombre, otroCallback) {
  setTimeout(function () {
    console.log("Adios " + nombre);
    otroCallback();
  }, 1000);
}
console.log("Iniciando proceso...");
hola("Carlos", function (nombre) {
  adios(nombre, function () {
    console.log("Terminando proceso...");
  });
});
// hola("Carlos", function () {});
// adios("Carlos", function () {});

//Fin ejercicio Anabel Alesci

//Ejercicio de Yesica López

//callback.js
// código sencillo

funtion soyAsincronica(miCallback){
    setTimeout( function () {
	console.log('Hola, soy una función asíncrona');
        miCallback();
    },1000);
}

console.log('Iniciando el proceso...');
soyAsincrona(function() {
	console.log('Terminado el proceso...');
});

//Fin Ejercicio Yesica López

// Ejercicio Jesús Mercado

function hola(nombre, micallBack){
    setTimeout(function () {
        console.log('Hola ' + nombre);
        micallBack(nombre);
    }, 1000);
}

function adios(nombre, otroCallback) {
    setTimeout(function() {
        console.log('Adios' + nombre);
        otroCallback();
    }, 1500);
}

console.log('Iniciando el proceso...');
hola('Carlos', function(nombre) {
    adios(nombre, function() {
        console.log('Terminando el proceso');
    }); 
});

//hola('Carlos', function(){});
//adios('Carlos', function(){});

// Fin Ejercicio Jesús Mercado

//Ejercicio Matías Villa
function soyAsincrona(nombre, miCallback) {
    setTimeout(function() {
        console.log('Hola, Soy una función Asíncrona tu nombre es: '+nombre)
        miCallback();
    }, 1000);
   
}

function adios(nombre, otroCallback){
    setTimeout(function(){
        console.log('Adios', nombre)
        otroCallback()
    }, 1000);
}

console.log('Iniciando...')
soyAsincrona('Carlos', function(){
  
    adios('Carlos', function(){
        console.log('Terminando')
    })
}); //Llamado a la función

//nodemon callback.js inicia el servidor 

//Fin ejercicio Matías
