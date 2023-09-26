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
// Ejercicio Anabel Alesci
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

//Fin ejercicio Anabel Alesci

//Ejercicio Yesica López

//products.js
const productos = [
   {
   	 id: 1,
     productName:"Banana",
     price:480,
     quanty: 1,
     img: "/client/media/banana.png",
   },
   { 
     id:2,
     productName:"Leche",
     prince:950,
     quanty:1,
     img: "/client/media/leche.png",
   },
   {
     id:3,
     productName:"Pollo",
     prince:750,
     quanty:1,
     img: "/cliente/media/pollo.png",	
   },
   {
     id:4,
     productName:"Mayonesa",
     prince:510,
     quanty:1,
     img: "/cliente/media/mayonesa.png",
   },
  {
    id: 5,
    productName: "Watermelon",
    price: 480,
    quanty: 1,
    img: "/client/media/watermelon.png",
  },
 ];

//index.js
const shopContent = document.getElementById("shopContent");

productos.forEach((product)=>{
	const content = document.createElement("div");
	content.innerHTML = '
	<img src="${product.img}">
	<h3>${product.productName} </h3>
	<p>${product.prince} $</p>
	 ';
	 shopContent.append(content);
});

//Fin ejercicio Yesica López


//Ejercicio Matías Villa

const productos = [
    {
    id: 1,
    productName: "Banana",
    price: 400,
    quanty:1,
    img:"Client/media/banana.jpg"
    },

    {
        id:2,
        productName:"Leche",
        price:60,
        quanty:1,
        img:"Client/media/milk.jpg",


    },

    {
        id:3,
        productName:"Arroz",
        price:20,
        quanty:1,
        img:"Client/media/rise.jpg", 
    }

    {
        id:2,
        productName:"huevo",
        price:60,
        quanty:1,
        img:"Client/media/egg.jpg",
    }
]

const shopContent = document.getElementById("shopContent");

productos.forEach((product) => {
    const content = document.createElement("div");
    content.innerHTML= `
    <img src="${producto.img}>
    <h3>${product.productName}</h3>
    <p>${product.price}$</p>

    `;
    shopContent.append(content);
    
    
});

//Fin ejerccio Matías.

#Ejercicio Victoria Zaccaro

const shopContent = document.getElementById("shopContent");
const cart = []; //Este es nuestro carrito, un array vacio

productos.forEach((product) => {
    const content = document.createElement("div");
    content.innerHTML = `
    <img src="${product.img}">
    <h3>${product.productName}</h3>
    <p>${product.price} $</p>
    `;
    shopContent.append(content);

	
const productos = [  //creamos una constante y le asignamos un array de productos
    {
        id: 1,
        productName:"Banana",
        price: 480,
        quanty: 1,
        img:"/client/media/banana.jpg",
    },
    
    {
        id: 2,
        productName:"Leche",
        price: 950,
        quanty: 1,
        img:"/client/media/leche.jpg",  
    },

    {
        id: 3,
        productName:"Pollo",
        price: 750,
        quanty: 1,
        img:"/client/media/pollo.jpg",
    },

    {
        id: 4,
        productName:"Mayonesa",
        price: 510,
        quanty: 1,
        img:"/client/media/mayonesa.jpg",  
    },

];
#Fin Ejercicio Victoria Zaccaro

// Ejercicio Jesús Mercado

// index.js:
const shopContent = document.getElementById("shopContent");

productos.forEach((product) => {
    const content = document.createElement("div");
    content.innerHTML = `
    <img src="${product.img}">
    <h3>${product.productName}</h3>
    <p>${product.price}</p>
    `;
    shopContent.append(content);
});

// products.js:
const productos = [
    {
        id: 1,
        productName: "Banana",
        price: 480,
        quanty: 1,
        img: "/client/media/banana_1.png",
    },
    {
        id: 2,
        productName: "Leche",
        price: 950,
        quanty: 1,
        img: "/client/media/leche.png",
    },
    {
        id: 3,
        productName: "Pollo",
        price: 750,
        quanty: 1,
        img: "/client/media/pollo_3.png",
    },
    {
        id: 4,
        productName: "Mayonesa",
        price: 510,
        quanty: 1,
        img: "/client/media/mayonesa_1.png",
    },
]

// Fin Ejercicio Jesús Mercado
