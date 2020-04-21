package roomreservation

class UrlMappings {

    static mappings = {
        "/rooms/search"(controller: 'room', action: 'search')

        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
