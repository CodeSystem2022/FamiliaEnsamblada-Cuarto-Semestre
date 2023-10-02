//Ejercicio de Yesica López
//server.js

const express = requiere("express");
const app = express();
const cors = requiere("cors");
const mercadopago = requiere("mercadopago");
const path = require("path");

//REPLACE WITH YOUR ACCESS TOKEN AVAILABLE IN: https://developers.mercadopago.com/panel
mercadopago.configure({
	access_token: "<ACCESS_TOKEN",
});

app.use(express.urlencoded({extended: false}));
app.use(express.json());

app.use(express.static(path.join(__dirname, "../client")));
app.use(cors());

app.get("/", funtion() {
	path.resolve(__dirname, "..", "client", "index.html");
});

app.post("/create_preference", (req, res) =>{
	let preference = {
		items: [
		 {
			title: req.body.description,
			unit_price: Number(req.body.prince),
			quantity: Number(req.body.quantity),
		  },
		],
        back_urls: {
        	success: "http://localhost:8080/feedback",
        	failure: "http://localhost:8080/feedback",
        	pending: "",
        },
        auto_return: "approved",
       };

       mercadopago.preferences
         .create(preference)
         .then(function (response){
         	res.json({
         		id: response.body.id,
         	});
         });
         .catch(function(error){
         	console.log(error);
         });
});

app.get("/feedback", function (req, res){
	res.json({
		Payment: req.query.payment_id,
		Status: req.query.status,
		MerchantOrder: req.query.merchant_order_id,
	});
});

app.listen(8080, () => {
	console.log("The server is now running on Port 8080");
});

//Fin Ejercicio Yesica López

// Ejercicio Jesús Mercado
// server.js
const express = require("express");
const app = express();
const cors = require("cors");
const mercadopago = require("mercadopago");
const path = require("path");

// REPLACE WITH YOUR ACCESS TOKEN AVAILABLE IN: https://developers.mercadopago.com/panel
mercadopago.configure({
	access_token: "<ACCESS_TOKEN>",
});


app.use(express.urlencoded({ extended: false }));
app.use(express.json());

app.use(express.static(path.join(__dirname, "../client")));
app.use(cors());

app.get("/", function () {
	path.resolve(__dirname, "..", "client", "index.html");
});

app.post("/create_preference", (req, res) => {

	let preference = {
		items: [
			{
				title: req.body.description,
				unit_price: Number(req.body.price),
				quantity: Number(req.body.quantity),
			}
		],
		back_urls: {
			"success": "http://localhost:8080",
			"failure": "http://localhost:8080",
			"pending": "",
		},
		auto_return: "approved",
	};

	mercadopago.preferences.create(preference)
		.then(function (response) {
			res.json({
				id: response.body.id
			});
		}).catch(function (error) {
			console.log(error);
		});
});

app.get('/feedback', function (req, res) {
	res.json({
		Payment: req.query.payment_id,
		Status: req.query.status,
		MerchantOrder: req.query.merchant_order_id
	});
});

app.listen(8080, () => {
	console.log("The server is now running on Port 8080");
});
// Fin Ejercicio Jesús Mercado


//Ejercicio Gerardo Duckwitz
const express = require("express");
const app = express();
const cors = require("cors");
const mercadopago = require("mercadopago");

// REPLACE WITH YOUR ACCESS TOKEN AVAILABLE IN: https://developers.mercadopago.com/panel
mercadopago.configure({
  access_token: "<ACCESS_TOKEN>",
});

app.use(express.urlencoded({ extended: false }));
app.use(express.json());
app.use(express.static("../../client/html-js"));
app.use(cors());
app.get("/", function (req, res) {
  res.status(200).sendFile("index.html");
});

app.post("/create_preference", (req, res) => {
  let preference = {
    items: [
      {
        title: req.body.description,
        unit_price: Number(req.body.price),
        quantity: Number(req.body.quantity),
      },
    ],
    back_urls: {
      success: "http://localhost:8080/feedback",
      failure: "http://localhost:8080/feedback",
      pending: "http://localhost:8080/feedback",
    },
    auto_return: "approved",
  };

  mercadopago.preferences
    .create(preference)
    .then(function (response) {
      res.json({
        id: response.body.id,
      });
    })
    .catch(function (error) {
      console.log(error);
    });
});

app.get("/feedback", function (req, res) {
  res.json({
    Payment: req.query.payment_id,
    Status: req.query.status,
    MerchantOrder: req.query.merchant_order_id,
  });
});

app.listen(8080, () => {
  console.log("The server is now running on Port 8080");
});

//package.json
{
  "name": "server",
  "version": "1.0.0",
  "description": "",
  "main": "index.js",
  "scripts": {
    "test": "echo \"Error: no test specified\" && exit 1"
  },
  "author": "",
  "license": "ISC",
  "dependencies": {
    "cors": "^2.8.5",
    "express": "^4.18.2",
    "mercadopago": "^1.5.17"
  }
}
//Fin ejercicio Gerardo Duckwitz
// Ejercicio Jose Remaggi
// server.js
const express = require("express");
const app = express();
const cors = require("cors");
const mercadopago = require("mercadopago");
const path = require("path");

// REPLACE WITH YOUR ACCESS TOKEN AVAILABLE IN: https://developers.mercadopago.com/panel
mercadopago.configure({
	access_token: "<ACCESS_TOKEN>",
});


app.use(express.urlencoded({ extended: false }));
app.use(express.json());

app.use(express.static(path.join(__dirname, "../client")));
app.use(cors());

app.get("/", function () {
	path.resolve(__dirname, "..", "client", "index.html");
});

app.post("/create_preference", (req, res) => {

	let preference = {
		items: [
			{
				title: req.body.description,
				unit_price: Number(req.body.price),
				quantity: Number(req.body.quantity),
			}
		],
		back_urls: {
			"success": "http://localhost:8080",
			"failure": "http://localhost:8080",
			"pending": "",
		},
		auto_return: "approved",
	};

	mercadopago.preferences.create(preference)
		.then(function (response) {
			res.json({
				id: response.body.id
			});
		}).catch(function (error) {
			console.log(error);
		});
});

app.get('/feedback', function (req, res) {
	res.json({
		Payment: req.query.payment_id,
		Status: req.query.status,
		MerchantOrder: req.query.merchant_order_id
	});
});

app.listen(8080, () => {
	console.log("The server is now running on Port 8080");
});
// Fin Ejercicio Jose Remaggi

//Ejercicio de Anabel Alesci
//server.js

const express = requiere("express");
const app = express();
const cors = requiere("cors");
const mercadopago = requiere("mercadopago");
const path = require("path");

//REPLACE WITH YOUR ACCESS TOKEN AVAILABLE IN: https://developers.mercadopago.com/panel
mercadopago.configure({
	access_token: "<ACCESS_TOKEN",
});

app.use(express.urlencoded({extended: false}));
app.use(express.json());

app.use(express.static(path.join(__dirname, "../client")));
app.use(cors());

app.get("/", funtion() {
	path.resolve(__dirname, "..", "client", "index.html");
});

app.post("/create_preference", (req, res) =>{
	let preference = {
		items: [
		 {
			title: req.body.description,
			unit_price: Number(req.body.prince),
			quantity: Number(req.body.quantity),
		  },
		],
        back_urls: {
        	success: "http://localhost:8080/feedback",
        	failure: "http://localhost:8080/feedback",
        	pending: "",
        },
        auto_return: "approved",
       };

       mercadopago.preferences
         .create(preference)
         .then(function (response){
         	res.json({
         		id: response.body.id,
         	});
         });
         .catch(function(error){
         	console.log(error);
         });
});

app.get("/feedback", function (req, res){
	res.json({
		Payment: req.query.payment_id,
		Status: req.query.status,
		MerchantOrder: req.query.merchant_order_id,
	});
});

app.listen(8080, () => {
	console.log("The server is now running on Port 8080");
});

//Fin Ejercicio Anabel Alesci

//Ejercicio Matías Villa

const express = require("express");
const app = express();
const cors = require("cors");
const mercadopago = require("mercadopago");
const path = require("path");

//REPLACE WITH YOUR ACCESS TOKEN AVAILABLE IN: https://developers.mercadopago.com/panel
mercadopago.configure({
	access_token: "<ACCESS_TOKEN",
});

app.use(express.urlencoded({extended: false}));
app.use(express.json());

app.use(express.static(path.join(__dirname, "../Client")));
app.use(cors());

// app.get("/", function() {
// 	path.resolve(__dirname, "..", "Client", "media", "index.html");
// });

app.get("/", function(req, res) {
	res.sendFile(path.resolve(__dirname, "..", "Client", "media", "index.html"));
  });
  

app.post("/create_preference", (req, res) =>{
	let preference = {
		items: [{
			title: req.body.description,
			unit_price: Number(req.body.prince),
			quantity: Number(req.body.quantity),
		  },
		],
        back_urls: {
        	success: "http://localhost:8080/",
        	failure: "http://localhost:8080/",
        	pending: "",
        },
        auto_return: "approved",
       };
	   mercadopago.preferences.create(preference)
	   .then(function (response) {
		   res.json({
			   id: response.body.id
		   });
	   }).catch(function (error) {
		   console.log(error);
	   });
});
app.get("/feedback", function (req, res){
	res.json({
		Payment: req.query.payment_id,
		Status: req.query.status,
		MerchantOrder: req.query.merchant_order_id,
	});
});

app.listen(8080, () => {
	console.log("Corriendo el servidor en el puerto 8080");
});

//package.json

{
  "name": "server",
  "version": "1.0.0",
  "description": "",
  "main": "server.js",
  "scripts": {
    "strat": "nodemon server.js",
    "test": "echo \"Error: no test specified\" && exit 1"
  },
  "author": "mati",
  "license": "ISC",
  "dependencies": {
    "cors": "^2.8.5",
    "express": "^4.18.2",
    "mercadopago": "^1.5.17",
    "nodemon": "^3.0.1"
  }
}

//Fin enjercicio Matías
//Ejercicio Victoria Zaccaro
const express = require("express");
const app = express();
const cors = require("cors");
const mercadopago = require("mercadopago");
const path = require("path");

//REPLACE WITH YOUR ACCESS TOKEN AVAILABLE IN: https://developers.mercadopago.com/panel
mercadopago.configure({
	access_token: "ingrese aqui su ACCESS_TOKEN",
});

app.use(express.urlencoded({extended: false}));
app.use(express.json());

app.use(express.static(path.join(__dirname, "../Client")));
app.use(cors());

app.get("/", function(req, res) {
	res.sendFile(path.resolve(__dirname, "..", "Client", "media", "index.html"));
  });
  

app.post("/create_preference", (req, res) =>{
	let preference = {
		items: [{
			title: req.body.description,
			unit_price: Number(req.body.prince),
			quantity: Number(req.body.quantity),
		  },
		],
        back_urls: {
        	success: "http://localhost:8080/",
        	failure: "http://localhost:8080/",
        	pending: "",
        },
        auto_return: "approved",
       };
	   mercadopago.preferences.create(preference)
	   .then(function (response) {
		   res.json({
			   id: response.body.id
		   });
	   }).catch(function (error) {
		   console.log(error);
	   });
});
app.get("/feedback", function (req, res){
	res.json({
		Payment: req.query.payment_id,
		Status: req.query.status,
		MerchantOrder: req.query.merchant_order_id,
	});
});

app.listen(8080, () => {
	console.log("Corriendo el servidor en el puerto 8080");
});

//Fin Ejercicio Victoria Zaccaro
