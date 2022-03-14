package Classes_Filhas

import Classes_Pai.Fotos

class Casamento(nome: String, tel: String, email: String)
    : Fotos(nome, tel, email) {

    override var valorFotos = 25

}