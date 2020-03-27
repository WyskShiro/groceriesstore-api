package will.shiro.groceriesstore.domain.usecase.foodcategory

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import will.shiro.groceriesstore.domain.boundary.FoodCategoryDataProvider
import will.shiro.groceriesstore.domain.entity.FoodCategory
import will.shiro.groceriesstore.domain.mapper.FoodCategoryMapper

@Service
class SaveFoodCategories {

    @Autowired
    private lateinit var foodCategoryDataProvider: FoodCategoryDataProvider

    fun execute(vararg foodCategories: FoodCategory) {
        foodCategoryDataProvider.saveFoodCategories(
            *FoodCategoryMapper.domainToJpa(*foodCategories)
        )
    }
}