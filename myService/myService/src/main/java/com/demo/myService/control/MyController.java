package com.demo.myService.control;

import com.demo.myService.DTO.BestFoodDto;
import com.demo.myService.service.FoodService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class MyController {

    private final FoodService foodService;

    @GetMapping("/food")
    public String food(){
        return "food";
    }

    @GetMapping("/bestFood")
    public String bestFood( Model model){
        List<BestFoodDto> bestFoodDtoList = foodService.getFoods();
        model.addAttribute("foodList", bestFoodDtoList);
        return "bestFood";
    }

}