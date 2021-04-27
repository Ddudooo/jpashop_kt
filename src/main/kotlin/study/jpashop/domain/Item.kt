package study.jpashop.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Item {

    @Id
    @GeneratedValue
    @Column(name = "ITEM_ID")
    var id : Long? = null

    var name : String

    var price : Int

    constructor(name : String, price : Int){
        this.name = name
        this.price = price
    }
}