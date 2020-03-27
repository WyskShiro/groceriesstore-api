package will.shiro.groceriesstore.presentation.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import will.shiro.groceriesstore.domain.entity.FoodCategory
import will.shiro.groceriesstore.domain.usecase.foodcategory.SaveFoodCategories

@Controller
@RequestMapping("/food_category")
class FoodCategoryController {

    fun getCategories() {

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