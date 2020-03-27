package will.shiro.groceriesstore.domain.mapper

import will.shiro.groceriesstore.data.entity.FoodCategoryJpa
import will.shiro.groceriesstore.domain.entity.FoodCategory

object FoodCategoryMapper {
    fun domainToJpa(vararg foodCategory: FoodCategory): Array<FoodCategoryJpa> {
        return foodCategory.map {
            FoodCategoryJpa(
                id = it.id
            )
        }.toTypedArray()
    }
}