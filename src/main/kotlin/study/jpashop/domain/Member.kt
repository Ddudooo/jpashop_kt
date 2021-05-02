package study.jpashop.domain

import javax.persistence.*

@Entity
class Member :BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "MEMBER_ID")
    var id: Long? = null

    var name : String

    var city : String

    var street : String

    var zipcode : String

    @OneToMany(mappedBy = "member")
    var orders : MutableList<Order> = mutableListOf()

    constructor(name : String , city: String, street: String, zipcode: String) {
        this.name = name
        this.city = city
        this.street = street
        this.zipcode = zipcode
    }
}