package kotlin

fun concat(a: String, b: String) : String {
	return null // Doesn't compile because return type is String
}

fun getLength (word : String) : Int {
	return word.length
}

fun myTest() {
	getLength(null) // Doesn't compile because getLength take a String
}

val notNull : Int = null // Doesn't compile
val canBeNull: Int? = null // OK with the marker '?'

fun useIt() {
	canBeNull.toShort() // Doesn't compile
	notNull.toShort() // Compile
	
	if (canBeNull != null) {
		canBeNull.toShort() // canBeNull isn't null so we can call toShort()
	}
	
	val l = canBeNull?.toShort() ?: 0.1
}

