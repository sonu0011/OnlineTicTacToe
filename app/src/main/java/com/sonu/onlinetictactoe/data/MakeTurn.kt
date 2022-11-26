package com.sonu.onlinetictactoe.data

import kotlinx.serialization.Serializable

@Serializable
data class MakeTurn(val x: Int, val y: Int)
