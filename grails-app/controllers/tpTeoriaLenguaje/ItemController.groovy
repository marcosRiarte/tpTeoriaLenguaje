package tpTeoriaLenguaje

class ItemController {
static scaffold = true
    def show() {
		render(view: "show")
    } 

    def save(Item ItemInstance) {
         
    ItemInstance.save flush:true
		render('Guardado')
    } 
}
