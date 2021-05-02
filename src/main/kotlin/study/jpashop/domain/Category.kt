package study.jpashop.domain

import javax.persistence.*

@Entity
class Category {
    @Id
    @GeneratedValue
    var id : Long? = null

    var name : String

    @ManyToOne
    @JoinColumn(name = "PARENT_ID")
    var parent : Category

    @OneToMany(mappedBy = "parent")
    var child : MutableList<Category> = mutableListOf()

    @ManyToMany
    @JoinTable(name = "CATEGROY_ITEM",
        joinColumns = arrayOf(JoinColumn(name = "CATEGORY_ID")),
        inverseJoinColumns = arrayOf(JoinColumn(name = "ITEAM_ID"))
    )
    var items : MutableList<Item> = mutableListOf()

    constructor(name: String, parent: Category) {
        this.name = name
        this.parent = parent
    }
}