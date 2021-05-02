package study.jpashop.domain

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name= "ORDERS")
class Order {
    @Id
    @GeneratedValue
    @Column(name = "ORDER_ID")
    var id : Long? = null

    @Column(name = "MEMBER_ID")
    var memberId : Long

    @OneToOne
    @JoinColumn(name = "DELIVERY_ID")
    var delivery: Delivery

    @OneToMany(mappedBy = "orderId")
    var orderItems : MutableList<OrderItem> = mutableListOf()

    var orderDate : LocalDateTime

    @Enumerated(EnumType.STRING)
    var status : OrderStatus

    constructor(memberId : Long, delivery: Delivery , orderDate : LocalDateTime, status: OrderStatus){
        this.memberId = memberId
        this.delivery = delivery
        this.orderDate = orderDate
        this.status = status
    }
}