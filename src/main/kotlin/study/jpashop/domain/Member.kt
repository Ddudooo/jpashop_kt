package study.jpashop.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Member {

    @Id
    @GeneratedValue
    @Column(name = "MEMBER_ID")
    var id: Long? = null

    var name : String

    var city : String

    var street : String

    var zipcode : String

    constructor(name : String , city: String, street: String, zipcode: String) {
        this.name = name
        this.city = city
        this.street = street
        this.zipcode = zipcode
    }
}