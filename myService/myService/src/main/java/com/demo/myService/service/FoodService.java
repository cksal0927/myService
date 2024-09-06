package com.demo.myService.service;

import com.demo.myService.DTO.BestFoodDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoodService {

    public List<BestFoodDto> getFoods(){

        List<BestFoodDto> bestFoodDtoList = new ArrayList<>();

//        BestFoodDto bestFoodDto = new BestFoodDto();
//        bestFoodDto.setFoodName("파전");
//        bestFoodDtoList.add(bestFoodDto);

        bestFoodDtoList.add(BestFoodDto.of("김치찌개"));
        bestFoodDtoList.add(BestFoodDto.of("연어"));
        bestFoodDtoList.add(BestFoodDto.of("닭볶음탕"));
        bestFoodDtoList.add(BestFoodDto.of("삼겹살"));
        bestFoodDtoList.add(BestFoodDto.of("막창"));

        return bestFoodDtoList;

    }

}