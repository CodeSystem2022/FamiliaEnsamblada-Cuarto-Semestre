// Ejercicio Gerardo Duckwitz
import { Router } from "express";
import { login, logout, register } from "../controllers/auth.controller";

const router = Router();
router.post("/login", login);
router.post("/register", register);
router.post("/logout", logout);
router.get();
export default router;

import { Router } from "express";
import {
  editarTarea,
  eliminarTarea,
  listarTarea,
  listarTareas,
} from "../controllers/tareas.controller";
const router = Router();

router.get("/tareas:id", listarTarea);
router.post("/tareas", listarTareas);
router.put("/tareas:id", editarTarea);
router.delete("/tareas:id", eliminarTarea);

export default router;
export const login = async (req, res) => {
  res.json("login");
};
export const register = async (req, res) => {
  res.json("register");
};
export const profile = async (req, res) => {
  res.json("profile");
};
export const logout = async (req, res) => {
  res.json("logout");
};
export const listarTareas = async (req, res) => {
  res.json("tareas");
};
export const listarTarea = async (req, res) => {
  res.json("tarea");
};
export const crearTarea = async (req, res) => {
  res.json("tarea");
};
export const editarTarea = async (req, res) => {
  res.json("tarea");
};

export const eliminarTarea = async (req, res) => {
  res.json("tarea");
};
import express from "express";
import morgan from "morgan";
import tareasRoutes from "./router/tareas.router.js";
import authRoutes from "./router/auth.router.js";
const app = express();

app.use(morgan("dev"));
app.use(express.json());
app.use(express.urlencoded({ extended: false }));
app.use(tareasRoutes);
app.use(authRoutes);

app.use((err, req, res, next) => {
  res.status(500).json({
    status: "error",
    message: err.message,
  });
});

export default app;


//Fin ejercicio Gerardo Duckwitz
