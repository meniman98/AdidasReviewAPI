package com.jack.huncho.adidasReviewAPI.repo

import com.jack.huncho.adidasReviewAPI.model.Review
import org.springframework.data.jpa.repository.JpaRepository

interface ReviewRepo : JpaRepository<Review, Long> {
}

