fun main() {
    var price = 1_000_000
    val purch1 = 1_000
    val purch2 = 1_001
    val purch3 = 10_000
    val purch4 = 10_001
    val discMin = 100
    val discMax = 5
    val discAdd = 1
    val userLevel = "REGULAR_CUSTOMER"

    if (price <= purch1) price
    if (price >= purch2 && price <= purch3) price -= discMin

    val disc5 = price * discMax / 100
    if (price >= purch4) price -= disc5

    var userDiscount = when (userLevel) {
        "REGULAR_CUSTOMER" -> discAdd
        else -> price
    }

    val disc6 = price * userDiscount / 100
    price -= disc6

    println("Сумма покупки $price руб.")
}