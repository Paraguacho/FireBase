package mx.edu.itson.firebase

data class User(var firstName:String ?= null, var lastName:String ?= null, val age:String ?=null){
    override fun toString() = firstName + "\t" + lastName + "\t" + age
}
