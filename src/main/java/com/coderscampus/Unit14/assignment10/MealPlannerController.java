package com.coderscampus.Unit14.assignment10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MealPlannerController {
	
	@GetMapping("mealplanner/week")
	public ResponseEntity<String> getWeekMeals(
			@RequestParam String numCalories;
			@RequestParam String diet;
			@RequestParam String exclusion) {
		return ResponseEntity.ok("Week meal plan logic will ")
	}

}
