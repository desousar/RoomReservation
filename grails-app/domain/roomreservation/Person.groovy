package roomreservation

class Person {

    String firstName
    String lastName
    String email

    String toString(){
        return firstName + " " + lastName
    }

    static constraints = {
        firstName(blank : false, nullable: false)
        lastName(blank : false, nullable: false)
        email(blank : false, email : true)

    }
}
