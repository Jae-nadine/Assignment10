package com.coderscampus.Unit14.assignment10;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.steretype.Service;
import org.springframework.web.client.RestTemplate;

@Service 
public class MealPlanService {
	
	@Value("${spoonacular.urls.base}")
	private String baseUrl;

}
