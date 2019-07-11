package com.mxmariner.tiles

fun tiles() : ITiles {
    return Tiles()
}

interface ITiles {
    val version: String
}

