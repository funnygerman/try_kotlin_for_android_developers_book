package com.funnygerman.kotlinweather.domain.commands

/**
 * Created by timur on 06.11.17.
 */
interface Command<out T> {
    fun execute(): T
}