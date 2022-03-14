package Classes_Filhas

import Classes_Pai.Fotos

class Casal(nome: String, tel: String, email: String)
    : Fotos(nome, tel, email) {

    override var valorFotos = 12

}