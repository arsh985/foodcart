package com.foodCart.foodCart.repository;

import com.foodCart.foodCart.model.Restaurant;
import com.foodCart.foodCart.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    User save(User user);


    User findByEmail(String email);
    User findByFirstName(String firstName);


}
