package roomreservation

import grails.rest.RestfulController

import static org.springframework.http.HttpStatus.METHOD_NOT_ALLOWED

/**
 * Custom RestfulController where we disable the delete action.
 */
abstract class NonDeleteRestfulController<T> extends RestfulController<T> {

    // We need to provide the constructors, so the
    // Resource transformation works.
    NonDeleteRestfulController(Class<T> domainClass) {
        this(domainClass, false)
    }

    NonDeleteRestfulController(Class<T> domainClass, boolean readOnly) {
        super(domainClass, readOnly)
    }

    @Override
    def delete() {
        // Return Method not allowed HTTP status code.
        render status: METHOD_NOT_ALLOWED
    }

}