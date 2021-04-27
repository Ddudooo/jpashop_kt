package study.jpashop

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
        //val find : Order? = em.find(Order::class.java, 1L)

        tx.commit()
    } catch (e: Exception){
        tx.rollback()
    } finally {
        em.close()
    }
    emf.close()
}