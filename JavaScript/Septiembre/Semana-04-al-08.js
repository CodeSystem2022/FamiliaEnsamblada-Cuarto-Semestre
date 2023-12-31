
// Ejercicio Gerardo Duckwitz
  buyButton.addEventListener("click", () => {
    const repeat = cart.some(
      (repeatProduct) => repeatProduct.id === producto.id
    );
    if (repeat) {
      cart.map((prod) => {
        if (prod.id === producto.id) {
          prod.quanty++;
        }
      });
    } else {
      cart.push({
        id: producto.id,
        productName: producto.productName,
        price: producto.price,
        quanty: producto.quanty,
        img: producto.img,
      });
    }
    console.log(cart);
  });

 cart.forEach((product) => {
    const modalBody = document.createElement("div");
    modalBody.className = "modal-body";
    modalBody.innerHTML = `
    <div class="product">
   <img class="product-img" src="${product.img}" alt="${product.productName}" />
    <div class="product-info">

    <h3>${product.productName}</h3>
    </div>
    <div class="quantity">
    <span class="quantity-btn-decrese>-</span>
    <span class="quantity-input">${product.quanty}</span>
    <span class="quantity-btn-increse>+</span>
    </div>
    <div class="price">${product.price * product.quanty}</div>
    <div class="delete-product">  ❎</div>
    </div>

    `;
    modalContainer.append(modalBody);
  });
  //modal footer
  const modalFooter = document.createElement("div");
  modalFooter.className = "modal-footer";
  modalFooter.innerHTML = `
  <div class="total-price">Total: </div>
  `;
  modalContainer.append(modalFooter);

//Fin ejercicio Gerardo Duckwitz

// Ejercicio Jesús Mercado

const modalContainer = document.getElementById("modal-container");
const modalOverlay = document.getElementById("modal-overlay");
const cartBtn = document.getElementById("cart-btn");

const displayCart = () => {
    modalContainer.innerHTML = "";
    modalContainer.style.display = "block";
    modalOverlay.style.display = "block";

    // modal Header
    const modalHeader = document.createElement("div");

    const modalClose = document.createElement("div");
    modalClose.innerText = "❌"

    modalClose.className = "modal-close";
    modalHeader.append(modalClose);

    modalClose.addEventListener("click", ()=> {
        modalContainer.style.display = "none";
        modalOverlay.style.display = "none";
    })

    const modalTitle = document.createElement("div");
    modalTitle.innerText = "Cart";
    modalTitle.className = "modal-title";
    modalHeader.append(modalTitle);

    modalContainer.append(modalHeader);

    // modal Body
    cart.forEach((product) => {
        const modalBody = document.createElement("div");
        modalBody.className = "modal-body";
        modalBody.innerHTML = `
        <div class="product">
                <img class="product-img" src="${product.img}" />
                <div class="product-info">
                    <h4>${product.productName}</h4>
                </div>
            <div class="quantity">
                <span class="quantity-btn-decrese">-</span>
                <span class="quantity-input">${product.quanty}</span>
                <span class="quantity-btn-increse">+</span>
            </div>
                <div class="price">$ ${product.price * product.quanty}</div>
                <div class="delete-product">❌</div>
        </div>
        `;
        modalContainer.append(modalBody);

        const decrese = modalBody.querySelector(".quantity-btn-decrese");
        decrese.addEventListener("click", ()=> {
            if(product.quanty !== 1){
                product.quanty--;
                displayCart();
            }
        });

        const increse = modalBody.querySelector(".quantity-btn-increse");
        increse.addEventListener("click", () => {
            product.quanty++;
            displayCart();
        });

        // delete
        const deleteProduct = modalBody.querySelector(".delete-product");

        deleteProduct.addEventListener("click", () => {
            deleteCartProduct(product.id);
        });
    });

    // modal footer
    const total = cart.reduce((acc, ele) => acc + ele.price * ele.quanty, 0 )

    const modalFooter = document.createElement("div");
    modalFooter.className = "modal-footer";
    modalFooter.innerHTML = `
    <div class="total-price">$ ${total}</div>
    `;
    modalContainer.append(modalFooter);
};

cartBtn.addEventListener("click", displayCart);

const deleteCartProduct = (id) => {
    const foundId = cart.findIndex((element) => element.id === id);
    console.log(foundId);
    cart.splice(foundId, 1);
    displayCart();
}

// Fin Ejercicio Jesús Mercado


// Ejercicio Jose Remaggi
buyButton.addEventListener("click", () => {
  const repeat = cart.some(
    (repeatProduct) => repeatProduct.id === producto.id
  );
  if (repeat) {
    cart.map((prod) => {
      if (prod.id === producto.id) {
        prod.quanty++;
      }
    });
  } else {
    cart.push({
      id: producto.id,
      productName: producto.productName,
      price: producto.price,
      quanty: producto.quanty,
      img: producto.img,
    });
  }
  console.log(cart);
});

cart.forEach((product) => {
  const modalBody = document.createElement("div");
  modalBody.className = "modal-body";
  modalBody.innerHTML = `
  <div class="product">
 <img class="product-img" src="${product.img}" alt="${product.productName}" />
  <div class="product-info">

  <h3>${product.productName}</h3>
  </div>
  <div class="quantity">
  <span class="quantity-btn-decrese>-</span>
  <span class="quantity-input">${product.quanty}</span>
  <span class="quantity-btn-increse>+</span>
  </div>
  <div class="price">${product.price * product.quanty}</div>
  <div class="delete-product">  ❎</div>
  </div>

  `;
  modalContainer.append(modalBody);
});
//modal footer
const modalFooter = document.createElement("div");
modalFooter.className = "modal-footer";
modalFooter.innerHTML = `
<div class="total-price">Total: </div>
`;
modalContainer.append(modalFooter);

//Fin ejercicio Jose Remaggi

// Ejercicio Anabel Alesci
  buyButton.addEventListener("click", () => {
    const repeat = cart.some(
      (repeatProduct) => repeatProduct.id === producto.id
    );
    if (repeat) {
      cart.map((prod) => {
        if (prod.id === producto.id) {
          prod.quanty++;
        }
      });
    } else {
      cart.push({
        id: producto.id,
        productName: producto.productName,
        price: producto.price,
        quanty: producto.quanty,
        img: producto.img,
      });
    }
    console.log(cart);
  });

 cart.forEach((product) => {
    const modalBody = document.createElement("div");
    modalBody.className = "modal-body";
    modalBody.innerHTML = `
    <div class="product">
   <img class="product-img" src="${product.img}" alt="${product.productName}" />
    <div class="product-info">

    <h3>${product.productName}</h3>
    </div>
    <div class="quantity">
    <span class="quantity-btn-decrese>-</span>
    <span class="quantity-input">${product.quanty}</span>
    <span class="quantity-btn-increse>+</span>
    </div>
    <div class="price">${product.price * product.quanty}</div>
    <div class="delete-product">  ❎</div>
    </div>

    `;
    modalContainer.append(modalBody);
  });
  //modal footer
  const modalFooter = document.createElement("div");
  modalFooter.className = "modal-footer";
  modalFooter.innerHTML = `
  <div class="total-price">Total: </div>
  `;
  modalContainer.append(modalFooter);

//Fin ejercicio Anabel Alesci

//Ejercicio de Yesica López

const modalContainer = document.getElementById("modal-container");
const modalOverlay = document.getElementById("modal-overlay");

const cartBtn = document.getElementById("cart-btn");

const displayCart = () => {
    modalContainer.innerHTML = "";
    modalContainer.style.display = "block";
    modalOverlay.style.display = "block";
    // modal Header
    const modalHeader = document.createElement("div");

    const modalClose = document.createElement("div");
    modalClose.innerText = "✖️";
    modalClose.className = "modal-close";
    modalHeader.append(modalClose);

    modalClose.addEventListener("click", ()=> {
        modalContainer.style.display = "none";
        modalOverlay.style.display = "none";
    });

    const modalTitle = document.createElement("div");
    modalTitle.innerText = "Cart";
    modalTitle.className = "modal-title";
    modalHeader.append(modalTitle);

    modalContainer.append(modalHeader);

    // modal Body
    cart.forEach((product) => {
        const modalBody = document.createElement("div");
        modalBody.className = "modal-body";
        modalBody.innerHTML = `
        <div class="product">
                <img class="product-img" src="${product.img}" />
                <div class="product-info">
                    <h4>${product.productName}</h4>
                </div>
            <div class="quantity">
                <span class="quantity-btn-decrese">-</span>
                <span class="quantity-input">${product.quanty}</span>
                <span class="quantity-btn-increse">+</span>
            </div>
                <div class="price">${product.price * product.quanty}</div>
                <div class="delete-product">✖️</div>
        </div>
        `;
        modalContainer.append(modalBody);

        const decrese = modalBody.querySelector(".quantity-btn-decrese");
        decrese.addEventListener("click", ()=> {
            if(product.quanty !== 1) {
                product.quanty--;
                displayCart();
            }
        });

        const increse = modalBody.querySelector(".quantity-btn-increse");
        increse.addEventListener("click", () => {
            product.quanty++;
            displayCart(); 
        });

        // delete
        const deleteProduct = modalBody.querySelector(".delete-product");

        deleteProduct.addEventListener("click", () => {
            deleteCartProduct(product.id);
        });
    });

    // modal footer
    const total = cart.reduce((acc, el) => acc + el.price * el.quanty, 0);

    const modalFooter = document.createElement("div");
    modalFooter.className = "modal-footer";
    modalFooter.innerHTML = `
    <div class="total-price">${total}</div>
    `;
    modalContainer.append(modalFooter);
};

cartBtn.addEventListener("click", displayCart);

const deleteCartProduct = (id) => {
    const foundId = cart.findIndex((element) => element.id === id);
    cart.splice(foundId, 1);
    displayCart();
};

//Fin Ejercicio Yesica López

//Ejercicio Matías Villa
/*se incorporan los id dentro de una constante */
const modalContainer = document.getElementById("modal-container");
const modalOverlay = document.getElementById("modal-overlay");
const cartBtn = document.getElementById("cart-btn"); 

 //capturar id del contador de prodcutos
 const cartCounter= document.getElementById("cart-counter");
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
    //modal body
    //para mostrar los productos

    cart.forEach((product) => {//recorrer cart
        const modalBody=document.createElement("div"); //creamos el elementos div
        modalBody.className="modal-body"; //clase para darle estilo al body
        modalBody.innerHTML=`
            <div class="product" src="${product.img}" />
            <img class= "product-info">
                <h4>${product.productName}<h4>
            </div>
            <div class="quantity">
                <span class="quantity-btn-decrese">-</span>
                <span class="quantity-input">${product.quanty}</span>
                <span class="quantity-btn-increse>+</span>
            </div>
                <div class="price">${product.price * product.quanty}$</div>
                <div class="delete-product">❌</div>
        </div>    
        `;
        modalContainer.append(modalBody); //agregamos el modalBody al modalContainer

       
    });
    

    //modal footer 
    
    const total=cart.reduce((acc,el) => acc +el.price * el.quanty, 0);
    const modalFooter = document.createElement("div");
    modalFooter = document.createElement("div");
    modalFooter.innerHTML=`
        <div class="total-price">Total:${total} </div>
    `;
    modalContainer.append(modalFooter);


};


cartBtn.addEventListener("click", displayCart); 
const deleteCartProduct=(id)=>{
    
    const foundId = cart.findIndex((element)=> element.id === id);
    cart.splice(foundId,1);
    displayCart();
};

//Fin ejercicio Matías Villa

//Ejercicio victoria zaccaro
const modalContainer = document.getElementById("modal-container");
const modalOverlay = document.getElementById("modal-overlay");

const cartBtn = document.getElementById("cart-btn");
const cartCounter = document.getElementById("cart-counter");

const displayCart = () => {
  modalContainer.innerHTML = "";
  modalContainer.style.display = "block";
  modalOverlay.style.display = "block";

  //modal header
  const modalHeader = document.createElement("div");

  const modalClose = document.createElement("div");
  modalClose.innerText = "❌";
  modalClose.className = "modal-close";
  modalHeader.append(modalClose);

  modalClose.addEventListener("click", () => {
    modalContainer.style.display = "none";
    modalOverlay.style.display = "none";
  });

  const modalTitle = document.createElement("div");
  modalTitle.innerText = "Cart";
  modalTitle.className = "modal-title";
  modalHeader.append(modalTitle);

  modalContainer.append(modalHeader);

  //Modal body
  if (cart.length > 0) {
    cart.forEach((product) => {
      const modalBody = document.createElement("div");
      modalBody.className = "modal-body";
      modalBody.innerHTML = `
       <div class="product">
        <img class="product-img" src="${product.img}" />
        <div class="product-info">
            <h4>${product.productName}</h4>
        </div>
        <div class="quantity">
            <span class="quantity-btn-decrese">-</span>
            <span class="quantity-input">${product.quanty}</span>
            <span class="quantity-btn-increse">+</span>
        </div>
        <div class="price">${product.price * product.quanty} $</div>
        <div class="delete-product">❌</div>
    </div>
        `;
      modalContainer.append(modalBody);
      const decrese = modalBody.querySelector(".quantity-btn-decrese");
      decrese.addEventListener("click", () => {
        if (product.quanty !== 1) {
          product.quanty--;
          displayCart();
          displayCartCounter();
        }
      });
      const increse = modalBody.querySelector(".quantity-btn-increse");
      increse.addEventListener("click", () => {
        product.quanty++;
        displayCart();
        displayCartCounter();
      });
      const deleteProduct = modalBody.querySelector(".delete-product");
      deleteProduct.addEventListener("click", () => {
        const index = cart.findIndex((prod) => prod.id === product.id);
        cart.splice(index, 1);
        displayCart();
        displayCartCounter();
      });
    });
    //Modal footer
    const total = cart.reduce((acc, el) => acc + el.price * el.quanty, 0);

    const modalFooter = document.createElement("div");
    modalFooter.className = "modal-footer";
    modalFooter.innerHTML = `
    <div class="total-price">Total:${total} $</div>
    <button class="btn-primary" id= "checkout-btn">Checkout</button>
    <div id="button-checkout"></div>
    `;
    modalContainer.append(modalFooter);
    );

//fin ejercicio victoria zaccaro
