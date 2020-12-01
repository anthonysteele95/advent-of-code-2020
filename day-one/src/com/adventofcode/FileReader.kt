package com.adventofcode

import java.io.BufferedReader
import java.io.FileReader

class FileReader {

    fun parseFile(fileName: String): List<String> = try {
            val fileReader = BufferedReader(FileReader(fileName))
            fileReader.readLines()
        } catch (e: NoSuchFileException) {
            emptyList()
        }
}