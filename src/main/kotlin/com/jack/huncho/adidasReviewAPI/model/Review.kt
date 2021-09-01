package com.jack.huncho.adidasReviewAPI.model

import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Review(
    var title: String,
    var name: String,
    var desc: String,
    var rating: Int? = 1,
    var date: LocalDate = LocalDate.now(),
    @Id @GeneratedValue var id: Long? = null
)
