package will.shiro.groceriesstore.data.dataprovider

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import will.shiro.groceriesstore.data.entity.FoodCategoryJpa
import will.shiro.groceriesstore.data.repository.FoodCategoryRepository
import will.shiro.groceriesstore.domain.boundary.FoodCategoryDataProvider

@Component
class FoodCategoryDataProviderImpl : FoodCategoryDataProvider {

    @Autowired
    private lateinit var foodCategoryRepository: FoodCategoryRepository

    override fun getFoodCategories() {
        // TODO
    }

    override fun saveFoodCategories(vararg foodCategories: FoodCategoryJpa): MutableList<FoodCategoryJpa> {
        return foodCategoryRepository.saveAll<FoodCategoryJpa>(foodCategories.toMutableList())
    }
}