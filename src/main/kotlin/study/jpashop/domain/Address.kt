package study.jpashop.domain

import javax.persistence.Embeddable

@Embeddable
class Address(
    var city : String,
    var street: String,
    var zipcode : String
) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Address

        if (city != other.city) return false
        if (street != other.street) return false
        if (zipcode != other.zipcode) return false

        return true
    }

    override fun hashCode(): Int {
        var result = city.hashCode()
        result = 31 * result + street.hashCode()
        result = 31 * result + zipcode.hashCode()
        return result
    }
}