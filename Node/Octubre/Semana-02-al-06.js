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
