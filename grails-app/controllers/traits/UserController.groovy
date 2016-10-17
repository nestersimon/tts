package traits

class UserController {

    def index() { }

    def nesta(){
    	def authorName="Nesta"
    	def contents="Nesta is programming" 
    	[author:authorName, content:contents]
    }
}
