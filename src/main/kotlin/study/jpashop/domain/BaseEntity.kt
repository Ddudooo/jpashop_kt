package study.jpashop.domain

import java.time.LocalDateTime
import javax.persistence.MappedSuperclass

@MappedSuperclass
abstract class BaseEntity {
    var createdBy : String? = null
    var createdDate : LocalDateTime = LocalDateTime.now()
    var lastModifiedBy : String? = null
    var lastModifiedDate : LocalDateTime = LocalDateTime.now()
}