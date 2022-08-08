package com.example.kotlin.kotlin_in_action_7

import java.beans.PropertyChangeListener
import java.beans.PropertyChangeSupport
import kotlin.properties.Delegates
import kotlin.reflect.KProperty

fun main() {
    val foo = Foo()
    val oldValue = foo.p
    println(oldValue)

    foo.p = "hi"

    val person = ChangePerson("진원", 28, 2000)
    person.addPropertyChangeListener { evt ->
        println("프로퍼티 ${evt.propertyName} 변경됨. ${evt.oldValue}에서 ${evt.newValue}으로")
    }

    person.age = 29
    person.salary = 3000
}

class Foo {
    var p: Any by Delegate()
}

class Delegate {
    operator fun getValue(foo: Foo, property: KProperty<*>): Any {
        return "jinwon"
    }

    operator fun setValue(foo: Foo, property: KProperty<*>, any: Any) {}
}

class ObservableProperty(var propValue: Int, private val changeSupport: PropertyChangeSupport) {
    operator fun getValue(p: ChangePerson, prop: KProperty<*>) = propValue
    operator fun setValue(p: ChangePerson, prop: KProperty<*>, newValue: Int) {
        val oldValue = propValue
        propValue = newValue
        changeSupport.firePropertyChange(prop.name, oldValue, newValue)
    }
}

open class PropertyChangeAware {
    val changeSupport by lazy { PropertyChangeSupport(this) }

    fun addPropertyChangeListener(listener: PropertyChangeListener) {
        changeSupport.addPropertyChangeListener(listener)
    }

    fun removePropertyChangeListener(listener: PropertyChangeListener) {
        changeSupport.removePropertyChangeListener(listener)
    }
}

class ChangePerson(val name: String, age: Int, salary: Int) : PropertyChangeAware() {
    private val observer = {
        prop: KProperty<*>, oldValue: Int, newValue : Int ->
        changeSupport.firePropertyChange(prop.name, oldValue, newValue)
    }

    var age: Int by Delegates.observable(age, observer)
    var salary: Int by Delegates.observable(salary, observer)
}
