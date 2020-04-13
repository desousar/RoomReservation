package roomreservation

import grails.rest.RestfulController
import static org.springframework.http.HttpStatus.METHOD_NOT_ALLOWED

class NonDeleteRestfulController<T> extends RestfulController<T> {

    NonDeleteRestfulController(Class<T> domainClass){ super (domainClass)}

    NonDeleteRestfulController(Class<T> domainClass, boolean readOnly){ super (domainClass, readOnly)}

    @Override
    Object delete(){
        render status: METHOD_NOT_ALLOWED
    }
}
