package study.jpashop.domain

import javax.persistence.Entity

@Entity
class Album(var artist: String, name : String, price : Int) : Item(name, price)