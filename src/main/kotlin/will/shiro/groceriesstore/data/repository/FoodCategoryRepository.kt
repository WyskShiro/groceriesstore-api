package will.shiro.groceriesstore.data.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import will.shiro.groceriesstore.data.entity.FoodCategoryJpa

@Repository
interface FoodCategoryRepository : JpaRepository<FoodCategoryJpa, Long> {

    fun findFoodCategoryJpaByIdAndName(id: Long, name: String): List<FoodCategoryJpa>?

}