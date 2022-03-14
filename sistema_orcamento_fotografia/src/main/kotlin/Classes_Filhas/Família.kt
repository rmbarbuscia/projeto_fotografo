package Classes_Filhas

import Classes_Pai.Fotos

class Família(nome: String, tel: String, email: String)
    : Fotos(nome, tel, email) {

    override var valorFotos = 15

}