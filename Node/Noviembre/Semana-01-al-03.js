//Ejercicio Matías Villa
//this===globlar=true
//Los modulos le permite a node tener funcionalidades 

//Mostrar algo en consola
//console.log();
//mostrar mensaje en forma de error
//console.error();
//Ejecutar código despues de un intervalo de tiempo
//setTimeout(()=>{});
//Ejecutar código cada intervalo de tiempo
//setInterval(()=>{});
//Da prioridad a la ejecución de una funcion asincrona
//setImmediate(()=>{});


//console.log(setInterval);

//let i = 0;
//let intervalo=setInterval(()=>{
//    console.log('Hola')
//    if(i ==3){
//        clearInterval(intervalo); //Detenemos la función
//    }
//    i++
//}, 1000);

setImmediate(()=>{
    console.log('Saludo Inmediato');

})

//require();

console.log(process);
console.log(__dirname); //Muestra directorio donde trabajamos
console.log(__filename);

global.miVariable = 'mi variable Global';
console.log(global.miVariable);

//Fin Ejercicio Matías
//Ejercicio Gerardo Duckwitz
//this === global = true

//Mostrar algo en consola
// console.log();

//Mostrar un mensaje en forma  de error
// console.error();

//Ejecutar un codigo despues de un intervalo de tiempo
// setTimeout(() => {});

//Ejecutamos un codigo cada intervalo de tiempo
// setInterval(() => {});

// setImmediate(() => {});

// console.log(global);

let i = 0;
let intervalo = setInterval(() => {
  console.log("Hola");
  if (i === 3) {
    clearInterval(intervalo);
  }
  i++;
}, 1000);

setImmediate(() => {
  console.log("Saludo inmedian");
});

// require()
// console.log(process);
// console.log(__dirname);
// console.log(__filename);
global.miVariable = "mi variable globnal";
console.log(miVariable);
//Fin ejercicio Gerardo Duckwitz

// Ejercicio Jesús Mercado

//this===globlar=true
//Los modulos le permite a node tener funcionalidades 

//Mostrar algo en consola
//console.log();
//mostrar mensaje en forma de error
//console.error();
//Ejecutar código despues de un intervalo de tiempo
//setTimeout(()=>{});
//Ejecutar código cada intervalo de tiempo
//setInterval(()=>{});
//Da prioridad a la ejecución de una funcion asincrona
//setImmediate(()=>{});


//console.log(setInterval);

//let i = 0;
//let intervalo=setInterval(()=>{
//    console.log('Hola')
//    if(i ==3){
//        clearInterval(intervalo); //Detenemos la función
//    }
//    i++
//}, 1000);

setImmediate(()=>{
    console.log('Saludo Inmediato');

})

//require();

console.log(process);
console.log(__dirname); //Muestra directorio donde trabajamos
console.log(__filename);

global.miVariable = 'mi variable Global';
console.log(global.miVariable);

// Fin Ejercicio Jesús Mercado
