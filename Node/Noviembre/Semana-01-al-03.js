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
