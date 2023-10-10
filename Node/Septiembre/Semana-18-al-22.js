// Ejercicio Jesús Mercado
// entorno.js

let nombre = process.env.NOMBRE || 'Sin nombre';
let web = process.env.MI_WEB || 'No tengo web';

console.log('Hola '+ nombre);
console.log('Mi web es: ' + web);

// Fin Ejercicio Jesús Mercado

//Ejercicio Gerardo Duckwitz
let nombre = process.env.NOMBRE || "Sin nombre";
let web = process.env.WEB || "No tengo web";
console.log("Hola" + saludo);
console.log("Mi web es: " + web);

//Fin ejercicio Gerardo Duckwitz

//Ejercicio de Yesica López

let nombre = process.env.NOMBRE || 'Sin nombre';
let web = process.env.MI_WEB || 'No tengo web';

console.log('Hola '+nombre);
console.log('Mi web es: '+web);

//Fin Ejercicio Yesica López
console.log('Mi web es: ' + web);


// Ejercicio Jose Remaggi
// entorno.js

let nombre = process.env.NOMBRE || 'Sin nombre';
let web = process.env.MI_WEB || 'No tengo web';

console.log('Hola '+ nombre);
console.log('Mi web es: ' + web);

// Fin Ejercicio Jose Remaggi

// Ejercicio Anabel Alesci
// entorno.js

let nombre = process.env.NOMBRE || 'Sin nombre';
let web = process.env.MI_WEB || 'No tengo web';

console.log('Hola '+ nombre);
console.log('Mi web es: ' + web);

// Fin Ejercicio Anabel Alesci

//Ejercicio Victoria zaccaro
let nombre = process.env.NOMBRE || 'Sin nombre';//si no existe la variable de entorno, se le asigna el valor 'Sin nombre'
let web = process.env.MI_WEB || 'No tengo web';//si no existe la variable de entorno, se le asigna el valor 'No tengo web'

console.log('Hola '+ nombre);//imprime en consola
console.log('Mi web es: ' + web);//imprime en consola
// Fin ejercicio victoria zaccaro

//Ejercicio Matías Villa

//Variable de entorno
//Ingresar informaciòn desde afuera hacia adentro
let nombre = process.env.NOMBRE || 'Sin nombre';
let web =   process.env.MI_WEB || 'No tengo web';
console.log('Hola ' + nombre);
console.log('Mi web es: '+web);


//en consola: $env:NOMBRE="CARLOS"; node entorno.js
//Se usa en mayusculas las variables de entorno porque así se hacia en linux
//Fin ejercicio Matías Villa. 
