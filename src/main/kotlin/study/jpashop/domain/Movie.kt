package study.jpashop.domain

import javax.persistence.Entity

@Entity
class Movie(
    var director : String ,
    var actor : String,
    name :String,
    price: Int) : Item(name, price)