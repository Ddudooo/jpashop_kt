package study.jpashop.domain

import javax.persistence.*

@Entity
class OrderItem :BaseEntity{

    @Id
    @GeneratedValue
    @Column(name = "ORDER_ITEM_ID")
    var id : Long? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDER_ID")
    var orderId : Order

    @Column(name = "ITEM_ID")
    var itemId : Long

    var orderPrice : Int
    var count : Int

    constructor(orderId : Order, itemId : Long, orderPrice: Int, count : Int){
        this.orderId = orderId
        this.itemId = itemId
        this.orderPrice = orderPrice
        this.count = count
    }

}