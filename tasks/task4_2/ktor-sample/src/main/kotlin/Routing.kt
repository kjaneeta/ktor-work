package com.example

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import freemarker.cache.*
import io.ktor.server.freemarker.*
import io.ktor.server.html.*
import kotlinx.html.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello, World!")
        }
        get("/html-freemarker") {
            call.respond(FreeMarkerContent("index.ftl", mapOf("data" to IndexData(listOf(1, 2, 3))), ""))
        }
        get("/html-dsl") {
            call.respondHtml {
                body {
                    h1 { +"HTML" }
                    ul {
                        for (n in 1..10) {
                            li { +"$n" }
                        }
                    }
                }
            }
        }
    }
}