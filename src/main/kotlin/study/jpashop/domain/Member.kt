package study.jpashop.domain

import javax.persistence.*

@Entity
class Member :BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "MEMBER_ID")
    var id: Long? = null

    var name : String

    @Embedded
    var homeAddress : Address? = null

    @OneToMany(mappedBy = "member")
    var orders : MutableList<Order> = mutableListOf()

    constructor(name : String) {
        this.name = name
    }
}