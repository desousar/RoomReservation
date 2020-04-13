
package roomreservation

import grails.rest.RestfulController
import org.apache.commons.lang.StringUtils

class SearchRestfulController<T> extends RestfulController<T> {

    SearchRestfulController(Class<T> resource) {
        super(resource)
    }

    SearchRestfulController(Class<T> resource, boolean readOnly) {
        super(resource, readOnly)
    }

    def search(String q){
        if (q) {
            def list = resource.all.findAll {
                StringUtils.containsIgnoreCase it.name, q
            }
            respond list
        } else {
            respond([])
        }
    }
}