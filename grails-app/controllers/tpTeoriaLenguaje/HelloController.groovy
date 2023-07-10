package tpTeoriaLenguaje

class HelloController {
    //static scaffold = true
    def index() {
           render(view: "menuInicial")
    }
	def singin() {
		render(view: "login")
    }
	def menu() {
		render(view: "main")
    }
}
