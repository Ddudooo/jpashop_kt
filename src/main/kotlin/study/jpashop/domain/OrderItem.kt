package study.jpashop.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class OrderItem {

    @Id
    @GeneratedValue
    @Column(name = "ORDER_ITEM_ID")
    var id : Long? = null

    @Column(name = "ORDER_ID")
    var orderId : Long

    @Column(name = "ITEM_ID")
    var itemId : Long

    var orderPrice : Int
    var count : Int

    constructor(orderId : Long, itemId : Long, orderPrice: Int, count : Int){
        this.orderId = orderId
        this.itemId = itemId
        this.orderPrice = orderPrice
        this.count = count
    }

}