package kotlin

fun main(args: Array<String>) {
	var a = 1
	var b = isTrue()
	
	a = "toto"  // Doesn't compile because a is of int type
	b = 1 // Doesn't compile because b is of boolean type
}

fun isTrue(): Boolean {
	return true
}