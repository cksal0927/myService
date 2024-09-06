package com.demo.myService.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PitcherDto {

    private String name;  // 이름
    private int lostPoint;  // 실점
    private int strikeOut;  // 탈삼진
    private float avgEarnedRun;  // 평균 자책점

    public static PitcherDto of(String name, int lp, int so, float aer){

        PitcherDto pitcherDto = new PitcherDto();
        pitcherDto.setName(name);
        pitcherDto.setLostPoint(lp);
        pitcherDto.setStrikeOut(so);
        pitcherDto.setAvgEarnedRun(aer);

        return pitcherDto;
    }

}