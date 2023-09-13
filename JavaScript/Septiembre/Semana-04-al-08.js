
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
