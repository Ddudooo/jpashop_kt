package study.jpashop.domain

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name= "ORDERS")
class Order :BaseEntity{
    @Id
    @GeneratedValue
    @Column(name = "ORDER_ID")
    var id : Long? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="MEMBER_ID")
    var member : Member? = null

    @OneToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name = "DELIVERY_ID")
    var delivery: Delivery

    @OneToMany(mappedBy = "order", cascade = [CascadeType.ALL])
    var orderItems : MutableList<OrderItem> = mutableListOf()

    var orderDate : LocalDateTime

    @Enumerated(EnumType.STRING)
    var status : OrderStatus

    constructor(member : Member, delivery: Delivery , orderDate : LocalDateTime, status: OrderStatus){
        this.member = member
        this.delivery = delivery
        this.orderDate = orderDate
        this.status = status
    }
}