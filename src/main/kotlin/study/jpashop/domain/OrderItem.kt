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
    var order : Order

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ITEM_ID")
    var item : Item

    var orderPrice : Int
    var count : Int

    constructor(order : Order, item : Item, orderPrice: Int, count : Int){
        this.order = order
        this.item = item
        this.orderPrice = orderPrice
        this.count = count
    }

}