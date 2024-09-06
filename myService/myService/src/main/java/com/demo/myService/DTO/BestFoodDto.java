package com.demo.myService.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BestFoodDto {

    private String foodName;

    public static BestFoodDto of(String food){
        BestFoodDto bestFoodDto = new BestFoodDto();
        bestFoodDto.setFoodName(food);

        return bestFoodDto;
    }

}