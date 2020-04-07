package roomreservation

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class RoomSpec extends Specification implements DomainUnitTest<Room> {

    void "Insert a new room and find it"() {
        //Insert
        def room = new Room(name: "5.3A17", max: 40)
        when: 'room is valid instance'
        room.validate()
        then:
        room.save()

        //Find by 'max'
        when:
        def rooms = Room.findAllByMaxGreaterThan(20)
        then:
        rooms.size() == 1
        rooms[0].max == 40
    }
}
