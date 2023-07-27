fun main() {
    val price = 8000
    val discountMin = 100
    val discountMax = 0.05
    val addDiscount = 0.01

    val totalDiscountMax = price * discountMax
    val purchase = if (price < 1000) price else if (price > 1001 && price < 10000) discountMin else totalDiscountMax
    val total = price - purchase.toInt()
    val total2 = total * addDiscount
    val total3 = total - total2

    println("Сумма покупки $price руб.")
    println("Сумма покупки со скидкой $total руб.")
    println("Сумма покупки постоянного пользователя с доп. скидкой $total3 руб.")
}