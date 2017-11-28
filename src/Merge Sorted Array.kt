/**
 * 普通解法，不考虑其中一个数组是否很大
 */
fun mergeSortedArray(a: IntArray, b: IntArray): IntArray {
    val array = IntArray(a.size + b.size)
    var i = 0
    var j = 0
    var k = 0

    while (i < a.size && j < b.size) {
        if (a[i] <= b[j]) {
            array[k++] = a[i++]
        } else {
            array[k++] = b[j++]
        }
    }

    if (i < a.size) {
        while (i < a.size) {
            array[k++] = a[i++]
        }
    }

    if (j < b.size) {
        while (j < b.size) {
            array[k++] = b[j++]
        }
    }
    return array
}

fun main(array: Array<String>) {
    val a = intArrayOf(1, 2, 3, 4)
    val b = intArrayOf(2, 4, 5, 6)

    mergeSortedArray(a, b).forEach {
        print(it)
    }
}