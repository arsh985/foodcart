package com.foodCart.foodCart.repository;

import com.foodCart.foodCart.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant,Integer> {

     Restaurant save(Restaurant restaurant);

     Restaurant findByRestaurantName(String restaurantName);
}
