package study.jpashop

import study.jpashop.domain.Book
import study.jpashop.domain.Order
import javax.persistence.EntityManager
import javax.persistence.EntityManagerFactory
import javax.persistence.Persistence

fun main(){
    val emf : EntityManagerFactory = Persistence.createEntityManagerFactory("study")
    val em : EntityManager = emf.createEntityManager()
    println("study JPA SHOP Kotlin!")
    val tx = em.transaction
    tx.begin()
    try {
        var book : Book = Book("작가", "ISBN", "JPA", 10000)
        em.persist(book)

        tx.commit()
    } catch (e: Exception){
        tx.rollback()
    } finally {
        em.close()
    }
    emf.close()
}