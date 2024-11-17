package kr.ac.kumoh.s20230358.w24wWishList.controller

import kr.ac.kumoh.s20230358.w24wWishList.service.WishlistService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class WishlistController(private val service: WishlistService) {
    @GetMapping("/wishlist")
    fun getWishlist(data: Model): String{
        val itemList = service.getAllItems()
        data.addAttribute("items",itemList)
        return "wishlist"
    }
}