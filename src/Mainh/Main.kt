package Mainh

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val name = arrayOfNulls<String>(100)
    var count = 0

    while (true) {
        println("1-> add ")
        println("2-> list ")
        println("= ")
        val a = scanner.nextInt()
        when (a) {
            1 -> {
                println("Name: ")
                val a1 = scanner.next()

                name[count] = a1
                count++
            }

            2 -> {
                for (i in 0 until count) {
                    if (name[i]!!.startsWith("A")) {
                        println(" " + name[i])
                    }
                }
            }
        }
    }
}