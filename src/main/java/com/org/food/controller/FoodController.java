package com.org.food.controller;

import com.org.food.model.FoodModel;
import com.org.food.repository.FoodRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Food")

public class   FoodController {

    @Autowired
    private FoodRepo foodRepo;

    @PostMapping("/food")
    public void createFoodRecord(@RequestBody FoodModel foodModel)
    {
        foodRepo.save(foodModel);
    }

    @GetMapping("/getall")
    public List<FoodModel> getAllRecordsFromDb()
    {
        return foodRepo.findAll();

    }
    @PutMapping("/update")
    public void updateData(@RequestBody FoodModel foodModel)
    {
        foodRepo.save(foodModel);
    }
    @DeleteMapping("/delete{id}")
    public void deleteRecord(@PathVariable ("id")int id)
    {
        foodRepo.deleteById(id);
    }



}
