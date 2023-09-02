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
