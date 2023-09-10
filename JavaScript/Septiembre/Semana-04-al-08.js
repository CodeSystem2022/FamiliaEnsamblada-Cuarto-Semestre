
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
