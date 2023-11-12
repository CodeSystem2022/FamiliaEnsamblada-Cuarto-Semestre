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