fun digCount(k: Int, n: Int): Int {
    var count = 0

    for (i in 0..n) {
        //如果n < 10
        if (i < 10 && k == i) {
            count++

            continue
        }

        var tmp = i

        while (tmp != 0) {
            //计算出个位
            val j = tmp % 10

            if (j == k) {
                count++
            }

            //右移一个数位
            tmp /= 10
        }
    }

    return count
}

fun main(args: Array<String>) {
    digCount(1, 12).let {
        println(it)
    }

    digCount(0, 19).let {
        println(it)
    }
}