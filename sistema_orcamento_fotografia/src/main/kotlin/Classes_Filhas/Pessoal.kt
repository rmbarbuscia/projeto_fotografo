package Classes_Filhas

import Classes_Pai.Fotos

class Pessoal(nome: String, tel: String, email: String)
    : Fotos(nome, tel, email) {

    override var valorFotos = 10

}