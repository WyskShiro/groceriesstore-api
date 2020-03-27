package will.shiro.groceriesstore.domain.boundary

import will.shiro.groceriesstore.data.entity.FoodCategoryJpa

interface FoodCategoryDataProvider {
    fun getFoodCategories()
    fun saveFoodCategories(vararg foodCategories: FoodCategoryJpa): MutableList<FoodCategoryJpa>
}