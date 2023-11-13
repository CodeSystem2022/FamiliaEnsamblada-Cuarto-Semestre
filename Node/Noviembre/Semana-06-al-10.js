// Ejercicio Gerardo Duckwitz
const fs = require("fs");

// Primero leemos el archivo.txt
function leer(ruta, cb) {
  fs.readFile(ruta, (err, data) => {
    // Leido el archivo
    cb(data.toString());
  });
}
// leer(__dirname + "/archivo.txt", console.log);

//Segundo escribimos el archivo1.txt creandolo
function escribir(ruta, contenido, cb) {
  fs.writeFile(ruta, contenido, function (err) {
    if (err) {
      console.error("No he podido escribirlo", err);
    } else {
      console.log("Se ha escrito correctamente");
    }
  });
}
escribir(__dirname + "/archivo1.txt", "Reescribimos el archivo", console.log);

//Tercero eliminamos el archivo1.txt
function borrar(ruta, cb) {
  fs.unlink(ruta, cb);
}
borrar(__dirname + "/archivo1.txt", console.log);

//Fin ejercicio Gerardo Duckwitz

// Ejercicio Jesús Mercado

const fs = require("fs");

// Primero leemos el archivo.txt
function leer(ruta, cb) {
  fs.readFile(ruta, (err, data) => {
    // Leido el archivo
    cb(data.toString());
  });
}
// leer(__dirname + "/archivo.txt", console.log);

//Segundo escribimos el archivo1.txt creandolo
function escribir(ruta, contenido, cb) {
  fs.writeFile(ruta, contenido, function (err) {
    if (err) {
      console.error("No he podido escribirlo", err);
    } else {
      console.log("Se ha escrito correctamente");
    }
  });
}
escribir(__dirname + "/archivo1.txt", "Reescribimos el archivo", console.log);

//Tercero eliminamos el archivo1.txt
function borrar(ruta, cb) {
  fs.unlink(ruta, cb);
}
borrar(__dirname + "/archivo1.txt", console.log);

// Fin Ejercicio Jesús Mercado
// Ejercicio Jose Remaggi
const fs = require("fs");

// Primero leemos el archivo.txt
function leer(ruta, cb) {
  fs.readFile(ruta, (err, data) => {
    // Leido el archivo
    cb(data.toString());
  });
}
// leer(__dirname + "/archivo.txt", console.log);

//Segundo escribimos el archivo1.txt creandolo
function escribir(ruta, contenido, cb) {
  fs.writeFile(ruta, contenido, function (err) {
    if (err) {
      console.error("No he podido escribirlo", err);
    } else {
      console.log("Se ha escrito correctamente");
    }
  });
}
escribir(__dirname + "/archivo1.txt", "Reescribimos el archivo", console.log);

//Tercero eliminamos el archivo1.txt
function borrar(ruta, cb) {
  fs.unlink(ruta, cb);
}
borrar(__dirname + "/archivo1.txt", console.log);

//Fin ejercicio Jose Remaggi

// Ejercicio Anabel Alesci

const fs = require("fs");

// Primero leemos el archivo.txt
function leer(ruta, cb) {
  fs.readFile(ruta, (err, data) => {
    // Leido el archivo
    cb(data.toString());
  });
}
// leer(__dirname + "/archivo.txt", console.log);

//Segundo escribimos el archivo1.txt creandolo
function escribir(ruta, contenido, cb) {
  fs.writeFile(ruta, contenido, function (err) {
    if (err) {
      console.error("No he podido escribirlo", err);
    } else {
      console.log("Se ha escrito correctamente");
    }
  });
}
escribir(__dirname + "/archivo1.txt", "Reescribimos el archivo", console.log);

//Tercero eliminamos el archivo1.txt
function borrar(ruta, cb) {
  fs.unlink(ruta, cb);
}
borrar(__dirname + "/archivo1.txt", console.log);

// Fin Ejercicio Anabel Alesci

//Ejercicio Matías Villa
const fs = require('fs');

//Primero leemos el archivo
function leer (ruta, cb){ //cb callback

    fs.readFile(ruta,(err, data)=> {
        cb(data.toString());
})

}

leer (`${__dirname}/archivo2.txt`,console.log); //sintaxis ES6


//Segundo escribimos el archivo1.txt creandolo

function escribir(ruta,contenido,cb){
    fs.writeFile(ruta, contenido,function(err){
        if (err){
            console.log('No se puede escribir')
        } else{
            console.log('Se ha escrito correctamente')
        }
    })

}

escribir(`${__dirname}/archivo2.txt`,'Soy un nuevo archivo y defiendo la universidad publica!!' ,console.log);
//leer (`${__dirname}/archivo.txt`,console.log); //sintaxis ES6


//Tercero eliminamos archivos
function borrar(ruta,cb){
    fs.unlink(ruta,cb);//Elimina de manera asincrona
}

borrar(`${__dirname}/archivo.txt`,console.log);

//Fin ejercicio Matías

//Ejercicio de Yesica López
//fs.js
const fs = require('fs');

// Primero leemos el archivo.txt
function leer(ruta, cb) {
  fs.readFile(ruta, (err, data) => {
    cb(data.toString());
  })
}
// leer(`${__dirname}/archivo.txt`, console.log); //Sintaxis ES6

//Segundo escribimos el archivo1.txt creandolo
function escribir(ruta, contenido, cb) {
  fs.writeFile(ruta, contenido, function (err){
    if (err) {
      console.log('No he podido escribirlo', err);
    } else {
      console.log('Se ha escrito correctamente');
    }
  })
}

//Tercero eliminamos el archivo1.txt
function borrar(ruta, cb) {
  fs.unlink(ruta, cb); //elimina de manera asincrona
}

borrar(`${__dirname}/archivo1.txt`, console.log);
escribir(`${__dirname}/archivo1.txt`, 'Reescribimos el archivo', console.log);
leer(`${__dirname}/archivo1.txt`,console.log);//Sintaxis ES6

//Fin Ejercicio Yesica López

//Ejercicio victoria zaccaro

const fs = require("fs");
// Primero leemos el archivo.txt
function leer(ruta, cb) {
  fs.readFile(ruta, (err, data) => {
    // Leido el archivo
    cb(data.toString());
  });
}
// leer(__dirname + "/archivo.txt", console.log);

//Segundo escribimos el archivo1.txt creandolo
function escribir(ruta, contenido, cb) {
  fs.writeFile(ruta, contenido, function (err) {
    if (err) {
      console.error("No he podido escribirlo", err);
    } else {
      console.log("Se ha escrito correctamente");
    }
  });
}
escribir(__dirname + "/archivo1.txt", "Reescribimos el archivo", console.log);

//Tercero eliminamos el archivo1.txt
function borrar(ruta, cb) {
  fs.unlink(ruta, cb);
}
borrar(__dirname + "/archivo1.txt", console.log);
//Fin ejercicio victoria zaccaro
