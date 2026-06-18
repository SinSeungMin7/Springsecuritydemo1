package com.example.demo.contorller;

import com.example.demo.model.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MemberController {
    // 전역변수
    private List<Member> members = List.of(
            new Member(1L, "카리나", "Karina@naver.com", null),
            new Member(2L, "장원영", "Won@naver.com", null),
            new Member(3L, "카리나", "honggd@naver.com", null),
            new Member(4L, "카리나", "parkgd@naver.com", null)
    );

    @GetMapping("/member/list")
    public String memberList(Model model){
        model.addAttribute("members", members);
        return "/membe-list";
    }

}


