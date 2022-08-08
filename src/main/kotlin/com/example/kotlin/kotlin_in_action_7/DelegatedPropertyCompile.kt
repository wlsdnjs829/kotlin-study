package com.example.kotlin.kotlin_in_action_7

fun main() {
    val p =  PropertyPerson()
    val data = mapOf("name" to "진원", "company" to "마이다스")
    data.forEach { (attrName, value) -> p.setAttributes(attrName, value) }
    println(p.name)
}

//class C {
//    private val <delegate> = MyDelegate()
//    var prop: Type
//        get() = <delegate>.getValue(this, <property>)
//        set(value : Type) = <delegate>.setValue(this, <property>, value )
//}
//
//val c = C()

class PropertyPerson {
    private val _attributes = hashMapOf<String, String>()
    fun setAttributes(attrName: String, value: String) {
        _attributes[attrName] = value
    }

    val name: String by _attributes
}