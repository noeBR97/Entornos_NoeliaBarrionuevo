import java.util.*
import kotlin.random.Random

fun main(args: Array<String>) {
    var matriz = Array(4) { Array<Int>(4) { Random.nextInt(1, 9)} }
    var sumaFilas = Array(matriz.size){0}
    var sumaColum = Array(matriz[0].size){0}

    imprimirMatriz(matriz)
    var fila: Int = 0
    var columna: Int = 0

    sumarFilas(fila, matriz, columna, sumaFilas)

    sumaColumnas(matriz,sumaColum)
    println("La suma de las filas es")
    println(Arrays.toString(sumaFilas))
    println("La suma de las columnas es")
    println(Arrays.toString(sumaColum))


}

private fun imprimirMatriz(matriz: Array<Array<Int>>) {
    for (f in matriz.indices) {
        for (c in matriz[f].indices) {
            print("${matriz[f][c]} ")
        }
        println()
    }
}

private fun sumarFilas(f: Int, m: Array<Array<Int>>, c: Int, sumaFilas: Array<Int>) {
    var fila = f
    var columna = c
    while (fila < m.size) {
        while (columna < m[0].size) {
            sumaFilas[fila] += m[fila][columna]
            columna++
        }
        columna = 0
        fila++
    }
}

fun sumaColumnas (m:Array<Array<Int>>, sumaColumnas:Array<Int>){
    var fila: Int = 0
    var columna: Int = 0

    while (columna < m.size){
        while (fila < m[0].size){
            sumaColumnas[columna] += m[fila][columna]
            fila++
        }
        fila = 0
        columna++
    }
}




