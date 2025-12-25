import { Elevador } from "../domain/elevador.js";

let elevador = new Elevador()
elevador.inicializar(10,4)

elevador.entrar(6)
elevador.subir()
elevador.descer()
elevador.entrar(4)
elevador.descer()
elevador.subir()
elevador.entrar(1)
elevador.sair(10)