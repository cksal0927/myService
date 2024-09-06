package com.demo.myService.service;

import com.demo.myService.DTO.PitcherDto;
import com.demo.myService.Data.Ranking;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BaseBallService {

    public List<PitcherDto> searchPitcher(PitcherDto pitcherDto){
        // 투수 이름으로 데이터베이스에서 조회하여 가져왔다는 가정 하에
        // 데이터베이스에서 가져온 데이터들을 DTO에 저장해야 한다.
        // DTO 객체 생성하여 데이터들 저장시키는 방법
        // 1. 클래스 메서드를 구현하여 객체 생성
        // 2. DTO 생성자 메서드로 생성
        // 3. DAO 또는 Entity 내부 클래스로 생성하여 사용

//        PitcherDto dto = PitcherDto.of(pitcherDto.getName());  // of(데이터베이스에서 가져온 데이터들)

        List<Ranking.Pitcher> list = Ranking.plist();

        List<PitcherDto> pitcherDtoList = new ArrayList<>();

        for(Ranking.Pitcher pitcher : list){
            pitcherDtoList.add(PitcherDto.of(pitcher.getName(), pitcher.getLostPoint(), pitcher.getStrikeOut(), pitcher.getEra()));
        }

        return pitcherDtoList;
    }

}