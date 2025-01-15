fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val evenNumbers = list.filter { it % 2 == 0 }
    val newList = list.toMutableList()
    newList.removeAll(evenNumbers)
    println(newList) 
    //Alternatively, create a new list using filter:
    val oddNumbers = list.filter { it % 2 != 0 }
    println(oddNumbers)
}