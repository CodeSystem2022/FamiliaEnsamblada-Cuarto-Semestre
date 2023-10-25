
// Ejercicio Gerardo Duckwitz
function hola(nombre, miCallback) {
    return new Promise(function (resolve, reject) {
      setTimeout(function () {
        console.log("Hola " + nombre);
        resolve(nombre);
      }, 1000);
    });
  }
  
  function hablar(nombre) {
    return new Promise((resolve, reject) => {
      setTimeout(function () {
        console.log("Bla bla bla bla...");
        resolve(nombre);
      }, 1000);
    });
  }
  function adios(nombre) {
    return new Promise(function (resolve, reject) {
      setTimeout(function () {
        console.log("Adios " + nombre);
        //   resolve();
        reject("Hay un error");
      }, 1000);
    });
  }
  
  console.log("Iniciando proceso...");
  hola("Ariel")
    .then(hablar)
    .then(adios)
  
    .then((nombre) => {
      console.log("Terminado el proceso");
    })
    .catch((error) => {
      console.error("Ha habido un error:");
      console.error(error);
    });
  
  
  //Fin ejercicio Gerardo Duckwitz

//Ejercicio de Yesica López

//promises.js

function hola(nombre) {
    return new Promise( function( resolve, reject) {
      setTimeout( function() {
        console.log('Hola ' + nombre);
        resolve(nombre);
      }, 1000);
    });
  }
  
  function hablar(nombre){
     return new Promise( (resolve, reject) => { //usamos la sintaxis ES6
       setTimeout( function() {
         console.log('bla bla bla bla...');
         resolve(nombre);
       }, 1000);
     });
  }

  function adios(nombre){
     return new Promise( (resolve, reject) => {   
       setTimeout(function() {
         console.log('Adios ' +nombre);
         //resolve();
        reject('Hay un error');
      }, 1000);
    });
  }
  
//Llamamos a la función
  console.log('Iniciando el proceso...');
  hola('Ariel')
    .then(hablar)
    .then(hablar)
    .then(hablar)
    .then(adios)                                           
    .then((nombre) => {
      console.log('Terminado el proceso');
    })
    .catch(error => {
      console.error('Ha habido un error: ');      
      console.error(error);                        
    })                                      
//Fin Ejercicio Yesica López

// Ejercicio Jesús Mercado

function hola(nombre){
    return new Promise(function (resolve, reject) {
        setTimeout(function () {
            console.log('Hola ' + nombre);
            resolve(nombre);
        }, 1000);
    });
}

function hablar(nombre){
    return new Promise((resolve, reject) => { // Usamos la sintaxis ES6
        setTimeout( function () {
            console.log('bla bla bla bla');
            resolve(nombre);
        }, 1000);
    });
}

function adios(nombre) {
    return new Promise((resolve, reject) => {
        setTimeout(function() {
            console.log('Adios ' + nombre);
            // resolve();
            reject('Hay un error');
        }, 1000);
    });
}

// Llamamos a la función
console.log('Iniciando el proceso...');
hola('Ariel')
    .then(hablar)
    .then(hablar)
    .then(adios)
    .then((nombre) => {
        console.log('Terminando el proceso');
    })
    .catch(error => {
        console.log('Ha habido un error: ');
        console.log(error);
    })

// Fin Ejercicio Jesús Mercado
