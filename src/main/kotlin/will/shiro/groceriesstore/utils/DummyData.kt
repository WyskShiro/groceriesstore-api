package will.shiro.groceriesstore.utils

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import will.shiro.groceriesstore.domain.entity.FoodCategory
import will.shiro.groceriesstore.domain.usecase.foodcategory.SaveFoodCategories
import java.time.LocalDate
import java.util.*
import java.util.function.Consumer
import javax.annotation.PostConstruct


@Component
class DummyData {
    @Autowired
    private lateinit var saveFoodCategories: SaveFoodCategories

    @PostConstruct
    fun saveFoodCategories() {
        saveFoodCategories.execute(
            FoodCategory(1),
            FoodCategory(2),
            FoodCategory(3),
            FoodCategory(4)
        )
    }
}
