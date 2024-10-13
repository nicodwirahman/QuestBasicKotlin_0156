package com.example.myapplication1

fun ContohList(){
    println("== List ==")
    // List Read Only
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)


    // List Mutable
    val mutableShapes: MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
    println(mutableShapes)


    // Menambahkan data kedalam List Mutable
    mutableShapes.add("Circle")
    println(mutableShapes)


    // Menghapus data dari List Mutable
    mutableShapes.remove("Triangle")
    println(mutableShapes)


    // Mengubah data di dalam list Mutable
    mutableShapes[0] = "Oval"
    println(mutableShapes)


    // List Read-Only
    val shapeLocked: List<String> = mutableShapes
    println(shapeLocked)
}
fun ContohSet(){
    println()
    println("=== Set ===")


    // Set Read-Only
    val readOnlyAbjad = setOf("A", "B", "C")
    println(readOnlyAbjad)


    // Set Mutable
    val mutableShapes: MutableSet<String> = mutableSetOf("Circle", "Square", "Triangle")
    println(mutableShapes)


    // Menambahkan data kedalam Set Mutable
    mutableShapes.add("Rectangle")
    println(mutableShapes)


    // Set Read-Only
    val shapeLocked: Set<String> = mutableShapes
    println(shapeLocked)
}

