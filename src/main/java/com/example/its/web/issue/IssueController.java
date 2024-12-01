package com.example.its.web.issue;

import com.example.its.domain.issue.IssueService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import com.example.its.domain.issue.IssueEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@RequiredArgsConstructor
@Controller
public class IssueController {
    private final IssueService issueService;

    @GetMapping("/issues")
    public String showList(Model model) {
        model.addAttribute("IssueList", issueService.findAll());
        return "issues/list";
    }
}
