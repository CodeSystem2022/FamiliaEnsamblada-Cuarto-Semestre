// Ejercicio Gerardo Duckwitz
const saludar = (nombre) => {
  //Función flecha
  return `
    Saludos de ${nombre}
    `; // Usamos back tic`s
}; //Esto es igual a 'Saludos'+ nombre;
console.log(saludar("Ariel"));

console.log("Inicio del programa");
setTimeout(() => {
  console.log("Primer Timeout");
}, 3000);
setTimeout(() => {
  console.log("Segundo Timeout");
}, 0);
setTimeout(() => {
  console.log("Tercero Timeout");
}, 0);

console.log("Fin del programa");


//Fin ejercicio Gerardo Duckwitz

//Ejercicio de Yesica López

//app2.js
const saludar = (nombre) => { //Función flecha
  return 'Saludos de ${nombre}'; // Usamos back tic`s};
//esto es igual a: 'Saludos'+ nombre;
console.log(saludar('Yesica'));

//app3.js
console.log("Inicio del programa"); //1

setTimeout(() => {
  console.log("Primer Timeout"); //5
}, 3000);

setTimeout(() => {
  console.log("Segundo Timeout"); //3
}, 0);

setTimeout(() => {
  console.log("Tercero Timeout"); //4
}, 0);

console.log("Fin del programa"); //2

//Fin Ejercicio de Yesica López

//Ejercicio de Jose Remaggi

//app2.js
const saludar = (nombre) => { //Función flecha
  return 'Saludos de ${nombre}'; // Usamos back tic`s};
//esto es igual a: 'Saludos'+ nombre;
console.log(saludar('Yesica'));

//app3.js
console.log("Inicio del programa"); //1

setTimeout(() => {
  console.log("Primer Timeout"); //5
}, 3000);

setTimeout(() => {
  console.log("Segundo Timeout"); //3
}, 0);

setTimeout(() => {
  console.log("Tercero Timeout"); //4
}, 0);

console.log("Fin del programa"); //2

//Fin Ejercicio de Jose Remaggi
