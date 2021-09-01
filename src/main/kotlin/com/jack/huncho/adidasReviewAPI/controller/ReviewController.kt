package com.jack.huncho.adidasReviewAPI.controller

import com.jack.huncho.adidasReviewAPI.model.Review
import com.jack.huncho.adidasReviewAPI.repo.ReviewRepo
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
class ReviewController(private val repo: ReviewRepo) {

    @GetMapping("/{id}")
    fun getSingle(@PathVariable id: Long): Optional<Review> {
        return repo.findById(id)
    }

    @GetMapping("/")
    fun getAll(): List<Review> {
        return repo.findAll()
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long) {
        repo.deleteById(id)
    }

    @PostMapping("/")
    fun post(@RequestBody review: Review) {
        repo.save(review)
    }

}