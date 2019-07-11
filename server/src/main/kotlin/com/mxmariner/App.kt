package com.mxmariner
import com.mxmariner.tiles.ITiles
import com.mxmariner.tiles.tiles

class App(
        tiles: ITiles = tiles()
) {
    init {
        println("tiles version = ${tiles.version}")
    }
}

fun main(args: Array<String>) {
    App()
}
