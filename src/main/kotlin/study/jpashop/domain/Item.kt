package study.jpashop.domain

import javax.persistence.*

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn
abstract class Item : BaseEntity{

    @Id
    @GeneratedValue
    @Column(name = "ITEM_ID")
    var id : Long? = null

    var name : String

    var price : Int
    @ManyToMany(mappedBy = "items")
    var categories : MutableList<Category> = mutableListOf()

    constructor(name : String, price : Int){
        this.name = name
        this.price = price
    }
}