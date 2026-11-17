package org.jetbrains.amper.ktor

import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}
// start up the underlying Netty server

fun Application.module() {
    configureRouting()
}
