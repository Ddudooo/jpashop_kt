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

    var orderDate : LocalDateTime

    @Enumerated(EnumType.STRING)
    var status : OrderStatus

    constructor(memberId : Long , orderDate : LocalDateTime, status: OrderStatus){
        this.memberId = memberId
        this.orderDate = orderDate
        this.status = status
    }
}