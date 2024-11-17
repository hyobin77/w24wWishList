package kr.ac.kumoh.s20230358.w24wWishList.service

import kr.ac.kumoh.s20230358.w24wWishList.repository.WishlistRepository
import org.springframework.stereotype.Service

@Service
class WishlistService (private val repository: WishlistRepository)
    {
        fun getAllItems() = repository.findAll()
    }
