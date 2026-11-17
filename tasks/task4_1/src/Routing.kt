package org.jetbrains.amper.ktor

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello World!")
        }
    }
}

// sets up route fro the application handling GET requests for a relative URL of "/" (application home page)
// you can invoke various methods on "call" to have the server deliver different
// types of response to the client that made the requests

/* examples:
respondHtml()
respondTemplate()
respondBytes()
*/