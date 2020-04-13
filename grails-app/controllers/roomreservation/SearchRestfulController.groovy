package roomreservation

import grails.rest.RestfulController
import org.apache.commons.lang.StringUtils

/**
 * Custom RestfulController which allows searching.
 */
abstract class SearchRestfulController<T> extends RestfulController<T> {

    SearchRestfulController(Class<T> domainClass) {
        this(domainClass, false)
    }

    SearchRestfulController(Class<T> domainClass, boolean readOnly) {
        super(domainClass, readOnly)
    }

    def search(String q) {
        if (q) {
            // resource.findAllByNameIlike("%${q}%")
            def list = resource.all.findAll {
                StringUtils.containsIgnoreCase it.name, q
            }
            respond list
        } else {
            respond([])
        }
    }
}