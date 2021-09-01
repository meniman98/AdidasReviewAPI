package com.jack.huncho.adidasReviewAPI

import com.jack.huncho.adidasReviewAPI.model.Review
import com.jack.huncho.adidasReviewAPI.repo.ReviewRepo
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager
import org.springframework.boot.test.context.SpringBootTest
import org.assertj.core.api.Assertions.assertThat
import org.springframework.data.repository.findByIdOrNull
import java.util.*

@SpringBootTest
class AdidasReviewApplicationTests {

    @Test
    fun contextLoads() {
    }


}

@DataJpaTest
class RepoTest @Autowired constructor(
    val entityManager: TestEntityManager,
    val repo: ReviewRepo
) {

    @Test
    fun returnReview() {
        val review= Review("Hi", "s,", "s")
        entityManager.persist(review)
        entityManager.flush()
        val returnedReview = repo.findByIdOrNull(review.id)
        assertThat(returnedReview).isEqualTo(review)
    }

    @Test
    fun deleteReview() {
        val review = Review("s", "s", "s")
        entityManager.persist(review)
        entityManager.flush()
        repo.deleteById(review.id!!)
        val returnedReview = repo.findByIdOrNull(review.id)
        assertThat(returnedReview).isEqualTo(null)
    }

    @Test
    fun addReview() {
        val review = Review("s", "s", "s")
        entityManager.persist(review)
        entityManager.flush()
        repo.save(review)

    }


}
