// Ejercicio Gerardo Duckwitz
const shopContent = document.querySelector("#shopContent");
productos.forEach((producto) => {
  const content = document.createElement("div");
  content.innerHTML = `
    <img src="${producto.img}" alt="${producto.productName}" />
    <h3>${producto.productName}</h3>
    <p>$${producto.price}</p>
    `;
  shopContent.append(content);
});
const productos = [
  {
    id: 1,
    productName: "Banana",
    price: 480,
    quanty: 1,
    img: "/client/media/banana.png",
  },
  {
    id: 2,
    productName: "Apple",
    price: 480,
    quanty: 1,
    img: "/client/media/apple.png",
  },
  {
    id: 3,
    productName: "Orange",
    price: 480,
    quanty: 1,
    img: "/client/media/orange.png",
  },
  {
    id: 4,
    productName: "Strawberry",
    price: 480,

    quanty: 1,
    img: "/client/media/strawberry.png",
  },
  {
    id: 5,
    productName: "Watermelon",
    price: 480,
    quanty: 1,
    img: "/client/media/watermelon.png",
  },
];

//Fin ejercicio Gerardo Duckwitz

// Ejercicio Jose Remaggi
const shopContent = document.querySelector("#shopContent");
productos.forEach((producto) => {
  const content = document.createElement("div");
  content.innerHTML = `
    <img src="${producto.img}" alt="${producto.productName}" />
    <h3>${producto.productName}</h3>
    <p>$${producto.price}</p>
    `;
  shopContent.append(content);
});
const productos = [
  {
    id: 1,
    productName: "Banana",
    price: 480,
    quanty: 1,
    img: "/client/media/banana.png",
  },
  {
    id: 2,
    productName: "Apple",
    price: 480,
    quanty: 1,
    img: "/client/media/apple.png",
  },
  {
    id: 3,
    productName: "Orange",
    price: 480,
    quanty: 1,
    img: "/client/media/orange.png",
  },
  {
    id: 4,
    productName: "Strawberry",
    price: 480,

    quanty: 1,
    img: "/client/media/strawberry.png",
  },
  {
    id: 5,
    productName: "Watermelon",
    price: 480,
    quanty: 1,
    img: "/client/media/watermelon.png",
  },
];

//Fin ejercicio Jose Remaggi