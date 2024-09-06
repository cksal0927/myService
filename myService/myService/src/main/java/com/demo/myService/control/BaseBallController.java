package com.demo.myService.control;

import com.demo.myService.DTO.PitcherDto;
import com.demo.myService.Data.Ranking;
import com.demo.myService.service.BaseBallService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BaseBallController {

    private final BaseBallService baseBallService;

    @GetMapping("/")
    public String main(){

        return "main";
    }

    @GetMapping("/bbsearch")
    public String bbsearch(@ModelAttribute PitcherDto pitcherDto, Model model){
//        pitcherDto = baseBallService.searchPitcher(pitcherDto);
//        baseBallService.searchPitcher(pitcherDto);
//        model.addAttribute("pitcher", pitcherDto);

        List<PitcherDto> list = baseBallService.searchPitcher(pitcherDto);

        model.addAttribute("pitcherList", list);
        return "pitcherInfo";
    }

}