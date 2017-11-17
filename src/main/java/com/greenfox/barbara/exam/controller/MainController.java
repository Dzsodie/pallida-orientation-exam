package com.greenfox.barbara.exam.controller;

import com.greenfox.barbara.exam.repository.LicensePlateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @Autowired
  LicensePlateRepository licensePlateRepository;

  @RequestMapping({"/", ""})
  public String list(Model model) {
    model.addAttribute("list", licensePlateRepository.findAll());
    return "index";
  }

  @GetMapping(value = "/search")
  public String search(@RequestParam(required = false) String keyword, Model model) {
    model.addAttribute("matching", licensePlateRepository.findIt(keyword));
    return "index";
  }

}