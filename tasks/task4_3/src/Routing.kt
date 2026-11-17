// Task 4.3: serving static HTML

import io.ktor.server.application.Application
import io.ktor.server.http.content.staticResources
import io.ktor.server.routing.routing

fun Application.configureRouting() {
    routing {
        staticResources("/","static")
    }
}

// Ktor should satisfy GET requests for static content using files under directory "static"
// "/" means no special prefix for static resources