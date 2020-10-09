package com.foodCart.foodCart.controller;

import com.foodCart.foodCart.model.Food;
import com.foodCart.foodCart.model.Restaurant;
import com.foodCart.foodCart.model.User;
import com.foodCart.foodCart.repository.FoodRepository;
import com.foodCart.foodCart.repository.RestaurantRepository;
import com.foodCart.foodCart.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/get")
public class MainController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestaurantRepository restaurantRepository;

    @Autowired
    private FoodRepository foodRepository;
    /////////// BELOW METHODS ARE FOR FETCH THE DATA /////////////////////////////////////////////////////


    ///////////////  RETIEVE ALL USERS ///////////////////////
    @GetMapping("/alluser")
    public List<User> getAllUser(){
        return (List<User>) userRepository.findAll();
    }


    //////////////// RETRIEVE ALL RESTAURANTS //////////////////////////
    @GetMapping("/allres")
    public List<Restaurant> getRestaurant(){
        return (List<Restaurant>) restaurantRepository.findAll();
    }

    ///////////////// RETRIEVE ALL FOOD ITEMS //////////////////////

    @GetMapping("/allfood")
    public List<Food> getFood(){
        return (List<Food>) foodRepository.findAll();
    }

    /////////  METHODS TO FIND SINGLE USER/RESTAURANT/FOOD_ITEM /////////////////////////////

    ////////// FIND USER BY EMAIL //////////////////
    @GetMapping("/user/{email}")
    public User getUser(@PathVariable("email") String email){
        return userRepository.findByEmail(email);
    }

    ///////////  FOR FIND BY USER  BY NAME //////////////
    @GetMapping("/users/{firstName}")
    public User getUserByName(@PathVariable("firstName") String firstName){
        return userRepository.findByFirstName(firstName);
    }

    ////////////// FOR FIND BY RESTAURANT NAME ///////////////
    @GetMapping("/res/{restaurantName}")
    public Restaurant getByName(@PathVariable("restaurantName") String restaurantName){
        return restaurantRepository.findByRestaurantName(restaurantName);
    }
    ////////////// FOR FIND BY FOOD NAME ///////////////

    @GetMapping("/food/{foodName}")
    public Food getByfoodName(@PathVariable("foodName") String foodName){
        return foodRepository.findByFoodName(foodName);
    }

    ////////////// FOR FIND FOOD BY FOOD_CATEGORY NAME ///////////////

    @GetMapping("/foods/{foodCategory}")
    public List<Food> getByfoodCategory(@PathVariable("foodCategory") String foodCategory){
        return (List<Food>) foodRepository.findByFoodName(foodCategory);
    }

}
