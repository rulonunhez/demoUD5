package com.example.demo.controller;

import com.example.demo.issues.entities.IssueReport;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IssueController {

    @GetMapping("/issuereport") //2
    public String getReport(Model model) { //3
        model.addAttribute("issuereport", new IssueReport());
        return "issues/issuereport_form";
    }

    @PostMapping("/issuereport") //4
    public String submitReport(IssueReport issueReport, Model model) { //5
        model.addAttribute("issuereport", new IssueReport()); //3
        model.addAttribute("submitted", true); //4
        return "issues/issuereport_form";
    }

    @GetMapping("/issues")
    public String getIssues(Model model) {  //6
        return "issues/issuereport_list";
    }
}
