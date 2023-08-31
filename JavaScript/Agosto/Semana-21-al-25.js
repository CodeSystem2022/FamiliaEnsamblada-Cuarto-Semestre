/*Ejercicio Matías Villa*/
/*se incorporan los id dentro de una constante */
const modalContainer = document.getElementById("modal-container");
const modalOverlay = document.getElementById("modal-overlay");
const cartBtn = document.getElementById("cart-btn"); 

/* Crear el modal, es una función que dentro tiene la 
creacion del modal y se ejecuta cuadno elusuario apriente el boton del carrito */

const displayCart= () =>{
    modalContainer.innerHTML="";
    modalContainer.style.display="block"; //Establece un estilo para el container en Block para que se muestre 
    modalOverlay.style.display = "block"; //Display block en el overlay para conrtadecir el css y dejar que se vea el container
    
    //header del modal
    const modalHeader = document.createElement("div"); //crear un div donde se ejecuta el header del modal

    const modalClose = document.createElement("div");
    modalClose.innerText = "❌";
    modalClose.className = "modal-close"; //clase para el css
    modalHeader.append(modalClose); //agrega modal close al header 

    modalClose.addEventListener("click", () => { //escucha el evento click y lo relaciona con la función 
        modalContainer.style.display = "none"; //hace que el modal tome estilo none por lo tanto se cierra
        modalOverlay.style.display= "none";
    })

    const modalTitle= document.createElement("div");
    modalTitle.innerText = "Cart";
    modalTitle.className= "modal-title"; 
    modalHeader.append(modalTitle);

    modalContainer.append(modalHeader); //agregar header al modal container



};


cartBtn.addEventListener("click", displayCart); //Escucha el evento (click) y ejecuta la función

//Fin ejercicio Matías Villa
