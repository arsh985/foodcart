package com.foodCart.foodCart.repository;

import com.foodCart.foodCart.model.Food;
import com.foodCart.foodCart.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FoodRepository extends JpaRepository<Food,Integer> {

    Food save(Food food);

    Food findByFoodName(String foodName);

   List<Food> findByFoodCategory(String foodCategory);
}
