package kr.ac.kumoh.s20230358.w24wWishList.repository

import kr.ac.kumoh.s20230358.w24wWishList.model.Item

interface WishlistRepository {
    fun findAll(): List<Item>
}