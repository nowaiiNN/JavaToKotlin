package kotlin

import java.HelloWorld

fun demo(any: Any) {
	if (any is User) {
		println(any.name) // We can use User properties because we know that any is a user
	}
}

fun createUser() {
	User("toto") // Call user constructor
	User("toto", 5)
	HelloWorld.hello() // We can also call java function
}

