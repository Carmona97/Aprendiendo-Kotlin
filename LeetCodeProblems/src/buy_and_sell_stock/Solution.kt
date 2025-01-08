package buy_and_sell_stock

fun main() {
    val prices = intArrayOf(7,6,4,3,1)
    println(maxProfit(prices))

}

fun maxProfit(prices: IntArray): Int {
    if (prices.isEmpty() || prices.size == 1) return 0

    var minPrice = Int.MAX_VALUE
    var maxProfit = 0

    for (price in prices) {
        if (price < minPrice) {
            minPrice = price
        } else if (price - minPrice > maxProfit) {
            maxProfit = price - minPrice
        }
    }

    return maxProfit
}
