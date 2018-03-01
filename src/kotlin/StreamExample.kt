package kotlin

fun demo(list : List<String>) : List<String> {
	return list.filter { e -> e.length < 5 }
}
