package study.jpashop.domain

import javax.persistence.Entity

@Entity
class Book(var author: String, var isbn: String, name : String, price :Int):Item(name, price)