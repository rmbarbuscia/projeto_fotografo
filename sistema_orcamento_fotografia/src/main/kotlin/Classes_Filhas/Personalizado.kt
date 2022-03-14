package Classes_Filhas

import Classes_Pai.Cliente

class Personalizado(override val nome: String, override val tel: String,
                             override val email: String) : Cliente {
}