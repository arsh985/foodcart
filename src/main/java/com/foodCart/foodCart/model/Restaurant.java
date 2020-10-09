package com.foodCart.foodCart.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "restaurant", uniqueConstraints = @UniqueConstraint(columnNames = "restaurantName"))
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int restaurantId;
    private String restaurantName;
    private String restaurantLocation;
    private BigDecimal restaurantRating;

    public Restaurant(int restaurantId, String restaurantName, String restaurantLocation, BigDecimal restaurantRating) {
        this.restaurantId = restaurantId;
        this.restaurantName = restaurantName;
        this.restaurantLocation = restaurantLocation;
        this.restaurantRating = restaurantRating;
    }

    public Restaurant() {
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantLocation() {
        return restaurantLocation;
    }

    public void setRestaurantLocation(String restaurantLocation) {
        this.restaurantLocation = restaurantLocation;
    }

    public BigDecimal getRestaurantRating() {
        return restaurantRating;
    }

    public void setRestaurantRating(BigDecimal restaurantRating) {
        this.restaurantRating = restaurantRating;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "restaurant_id=" + restaurantId +
                ", restaurant_name='" + restaurantName + '\'' +
                ", restaurant_location='" + restaurantLocation + '\'' +
                ", restaurant_rating=" + restaurantRating +
                '}';
    }
}
