package study.jpashop.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.OneToOne

@Entity
class Delivery :BaseEntity {
    @Id
    @GeneratedValue
    var id : Long? = null

    var city : String

    var street : String

    var zipcode : String

    var Delivery : DeliveryStatus

    @OneToOne(mappedBy = "delivery")
    var order : Order

    constructor(city: String, street: String, zipcode: String, Delivery: DeliveryStatus, order: Order) {
        this.city = city
        this.street = street
        this.zipcode = zipcode
        this.Delivery = Delivery
        this.order = order
    }
}