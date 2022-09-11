package com.kotlin_practice.lec7

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class FilePrinter {

    // 2. Checked Exception Unchecked Exception
    // kotlin 에서는 checked exception 과 unchecked exception 을 구분하지 않는다
    // 모두 unchecked exception 이다
    fun readFile() {
        val currentFile = File(".")
        val file = File(currentFile.absolutePath + "/a.txt")
        val reader = BufferedReader(FileReader(file))
        println(reader.readLine())
        reader.close()
    }


    // 3. try with resources
    // 코틀린에서는 try with resources 가 없으며 대신 use 확장함수를 사용한다
    fun readFile(path: String) {
        BufferedReader(FileReader(path)).use {
            reader -> println(reader.readLine())
        }
    }


}