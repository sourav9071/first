package com.org.food.repository;

import com.org.food.model.FoodModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

@Repository

public interface FoodRepo extends MongoRepository<FoodModel, Integer> {

}
