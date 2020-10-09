package com.foodCart.foodCart.controller;

import com.foodCart.foodCart.model.Food;
import com.foodCart.foodCart.model.Restaurant;
import com.foodCart.foodCart.model.User;
import com.foodCart.foodCart.repository.FoodRepository;
import com.foodCart.foodCart.repository.RestaurantRepository;
import com.foodCart.foodCart.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class UserRegistrationCtrl {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RestaurantRepository restaurantRepository;

    @Autowired
    private FoodRepository foodRepository;


    @PostMapping("/user")
    public String registerUser(@RequestBody User user){
        userRepository.save(user);
        return user.getEmail()+" Registered Successfully.";
    }

    @PostMapping("/restaurant")
    public String registerRestaurant(@RequestBody Restaurant restaurant){
        restaurantRepository.save(restaurant);
        return restaurant.getRestaurantName()+" Registered Successfully.";
    }

    @PostMapping("/food")
    public String addFood(@RequestBody Food food){
        foodRepository.save(food);
        return food.getFoodName()+" Added Successfully.";
    }






}
