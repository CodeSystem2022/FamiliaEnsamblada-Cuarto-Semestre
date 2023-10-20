//Ejercicio Gerardo Duckwitz
function hola(nombre, miCallback) {
  setTimeout(function () {
    console.log("Hola " + nombre);

    miCallback(nombre);
  }, 1000);
}

function hablar(callbackHablar) {
  setTimeout(function () {
    console.log("Bla bla bla bla...");
    callbackHablar();
  }, 1000);
}
function adios(nombre, otroCallback) {
  setTimeout(function () {
    console.log("Adios " + nombre);
    otroCallback();
  }, 1000);
}

function conversacion(nombre, veces, callback) {
  if (veces > 0) {
    hablar(function () {
      conversacion(nombre, --veces, callback);
    });
  } else {
    callback(nombre, callback);
  }
}
//   --Proceso principal
console.log("Iniciando proceso...");
hola("Ariel", function (nombre) {
  conversacion(nombre, 4, function () {
    console.log("Proceso terminado");
  });
});

// hola("Carlos", function (nombre) {
//   hablar(function () {
//     hablar(function () {
//       hablar(function () {
//         hablar(function () {
//           adios(nombre, function () {
//             console.log("Terminando proceso...");
//           });
//         });
//       });
//     });
//   });
// });
// hola("Carlos", function () {});
// adios("Carlos", function () {});


//Fin ejercicio Gerardo Duckwitz

//Ejercicio de Yesica López

function hola(nombre, miCallback){
    setTimeout(function(){
      console.log('Hola ' +nombre);
      miCallback(nombre);
    }, 1000);
}

function hablar(callbackHablar){
    setTimeout(function(){
      console.log('bla bla bla bla');
      callbackHablar();
    }, 1000);
}

function adios(nombre, otroCallback) {
    setTimeout(function(){
      console.log('Adios '+nombre);
      otroCallback();
    }, 1600);
}

//Función Recursiva
function conversacion(nombre, veces, callback){
  if (veces > 0){
    hablar(function(){
      conversacion(nombre, --veces, callback);
    });
  } else {
    callback(nombre, callback);
  }
}

//--Proceso principal
console.log('Iniciando Proceso...');
hola('Ariel', function(nombre){
   conversacion(nombre, 4, function(){    
    console.log('terminando el proceso...');      
  });
});

// hola('Carlos', function(nombre){
//   hablar(function(){
//     hablar(function(){
//        hablar(function(){
//          hablar(function(){
//            adios(nombre, function() {
//             console.log('Terminando proceso...);
//           });
//         });
//       });
//     });
//   });
// });

//Fin Ejercicio Yesica López

//Ejercicio de Jose Remaggi

function hola(nombre, miCallback){
  setTimeout(function(){
    console.log('Hola ' +nombre);
    miCallback(nombre);
  }, 1000);
}

function hablar(callbackHablar){
  setTimeout(function(){
    console.log('bla bla bla bla');
    callbackHablar();
  }, 1000);
}

function adios(nombre, otroCallback) {
  setTimeout(function(){
    console.log('Adios '+nombre);
    otroCallback();
  }, 1600);
}

//Función Recursiva
function conversacion(nombre, veces, callback){
if (veces > 0){
  hablar(function(){
    conversacion(nombre, --veces, callback);
  });
} else {
  callback(nombre, callback);
}
}

//--Proceso principal
console.log('Iniciando Proceso...');
hola('Ariel', function(nombre){
 conversacion(nombre, 4, function(){    
  console.log('terminando el proceso...');      
});
});

// hola('Carlos', function(nombre){
//   hablar(function(){
//     hablar(function(){
//        hablar(function(){
//          hablar(function(){
//            adios(nombre, function() {
//             console.log('Terminando proceso...);
//           });
//         });
//       });
//     });
//   });
// });

//Fin Ejercicio Jose Remaggi
