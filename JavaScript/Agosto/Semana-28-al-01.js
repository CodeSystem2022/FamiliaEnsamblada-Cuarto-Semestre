// Ejercicio Gerardo Duckwitz
const modalContainer = document.querySelector("#modal-container");
const modalOverlay = document.querySelector("#modal-overlay");
const cartBtn = document.querySelector("#cart-btn");

const displayCart = () => {
  modalContainer.innerHTML = "";

  modalContainer.style.display = "block";
  modalOverlay.style.display = "block";

  //modal header
  const modalHeader = document.createElement("div");
  const modalClose = document.createElement("div");
  modalClose.innerText = "❎";
  modalClose.className = "modal-close";
  modalClose.addEventListener("click", () => {
    modalContainer.style.display = "none";
    modalOverlay.style.display = "none";
  });
  modalHeader.append(modalClose);
  const modalTitle = document.createElement("div");
  modalTitle.innerText = "Carrito de compras";
  modalTitle.className = "modal-title";
  modalHeader.append(modalTitle);

  modalContainer.append(modalHeader);
};

cartBtn.addEventListener("click", () => {
  displayCart();
  console.log("click1");
});

//Fin ejercicio Gerardo Duckwitz
