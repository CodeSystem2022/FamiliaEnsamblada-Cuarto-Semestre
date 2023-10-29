// Ejercicio Gerardo Duckwitz
//La palabra async no es necesario en las funciones, porque ya son asincronas
//Igual proyectan una asincronia visual
function hola(nombre, miCallback) {
  return new Promise(function (resolve, reject) {
    setTimeout(function () {
      console.log("Hola " + nombre);
      resolve(nombre);
    }, 1000);
  });
}

async function hablar(nombre) {
  return new Promise((resolve, reject) => {
    setTimeout(function () {
      console.log("Bla bla bla bla...");
      resolve(nombre);
    }, 1000);
  });
}
async function adios(nombre) {
  return new Promise(function (resolve, reject) {
    setTimeout(function () {
      console.log("Adios " + nombre);
      //   resolve();
      reject("Hay un error");
    }, 1000);
  });
}

// await hola("Carlos"); // Esto es una mala sintaxis
//await solo es valido dentro de una funcion asincrona
async function main() {
  let nombre = await hola("Ariel");
  await hablar();
  await hablar();
  await hablar();
  await adios(nombre);
  console.log("Terminamos el proceso");
}
main();

//Codigo en ingles
function sayHello(nombre, miCallback) {
  return new Promise(function (resolve, reject) {
    setTimeout(function () {
      console.log("Hello " + nombre);
      resolve(nombre);
    }, 1000);
  });
}

async function talk(nombre) {
  return new Promise((resolve, reject) => {
    setTimeout(function () {
      console.log("Bla bla bla bla...");
      resolve(nombre);
    }, 1000);
  });
}
async function sayBye(nombre) {
  return new Promise(function (resolve, reject) {
    setTimeout(function () {
      console.log("Bye " + nombre);
      //   resolve();
      reject("Hay un error");
    }, 1000);
  });
}

async function main2() {
  let nombre = await sayHello("Ariel");
  await talk();
  await talk();
  await talk();
  await sayBye(nombre);
  console.log("Terminamos el proceso");
}
main2();

//Fin ejercicio Gerardo Duckwitz

//Ejercicio Matías Villa
//La palabra async no son necesarias porque las funciones ya son asincronas
//igual proyectan una sincronia visual 
async function hola(nombre) {
    return new Promise(function(resolve, reject ){
        
    setTimeout(function() {
        console.log('Hola  '+nombre)
        resolve(nombre);
    }, 1000);
    }); 
   
}

async function hablar(nombre){
    
        return new Promise((resolve, reject) =>{ //Usamos sintaxis ES6
        setTimeout(function(){
        console.log('bla bla bla');
        resolve(nombre);
    }, 1000);
})}

async function adios(nombre){
        return new Promise((resolve, reject)=>{
        setTimeout(function(){
            console.log('Adios '+ nombre);
            //resolve();
            //reject('Hay un error')
        }, 1000);
   

})}

//Mala sintaxis
//await hola('Ariel');
//await solo es valido dentro de una función asincrona
async function main(){
    let nombre = await hola('Mati');
    await hablar();
    await hablar ();
    await adios(nombre);
    console.log('Terminamos')
}

console.log('Empezamos...')
main();
console.log('esta va a ser la segunda instrucción')


//En ingles

function sayHello(name){
    return new Promise((resolve, reject)=>{
        setTimeout(()=>{
            console.log("Hello"+name);
            resolve(name);

        },1000)
    })
}

function talk(name){
    return new Promise((resolve, reject)=>{
        setTimeout(()=>{
            console.log("Bla Bla Bla")
            resolve(name);

        }, 1000);
    });
}

function sayBye(name){
    return new Promise((resolve, reject)=>{
        setTimeout(()=>{
            console.log("GoodBye"+name);
            resolve(name);
        }, 1000);
    });
}

async function conversation(name){
    console.log('Code in english')
    console.log("Starting async process....");
    await sayHello(name);
    await talk()
    await talk()
    await talk()
    await sayBye(name);
    console.log('Process completed');

}
conversation("Matias")

//Fin ejercicio Matías Villa
