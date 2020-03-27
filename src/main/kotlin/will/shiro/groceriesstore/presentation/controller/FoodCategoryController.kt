package will.shiro.groceriesstore.presentation.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import will.shiro.groceriesstore.domain.entity.FoodCategory
import will.shiro.groceriesstore.domain.usecase.foodcategory.SaveFoodCategories

@RequestMapping("/food_category")
@RestController
class FoodCategoryController {

    @GetMapping
    fun getCategories(): String {
        saveFoodCategories.execute(
            FoodCategory(1),
            FoodCategory(2),
            FoodCategory(3),
            FoodCategory(4)
        )
        return "Deu certo"
    }

    @Autowired
    private lateinit var saveFoodCategories: SaveFoodCategories

    @PostMapping
    fun addCategory() {
        saveFoodCategories.execute(
            FoodCategory(1),
            FoodCategory(2),
            FoodCategory(3),
            FoodCategory(4)
        )
    }
}