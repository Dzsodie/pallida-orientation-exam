package com.greenfox.barbara.exam.controller;

import com.greenfox.barbara.exam.exception.InvalidSearchError;
import com.greenfox.barbara.exam.repository.LicensePlateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @Autowired
  LicensePlateRepository licensePlateRepository;

  @RequestMapping("/")
  public String list(
      @RequestParam(required = false) String police,
      @RequestParam(required = false) String diplomat,
      Model model) {

      model.addAttribute("list", licensePlateRepository.findAll());

    return "index";
  }

  @GetMapping(value = "/search")
  public String search(@RequestParam(required = false) String q, Model model) {

    String specialCharacters = " !#$%&'()*+,./:;<=>?@[]^_`{|}~";
    String[] temp = q.split("");

    for (int j = 0; j < temp.length; j++) {
      if (!specialCharacters.contains(temp[j]) && !(temp.length > 7)) {
        model.addAttribute("list", licensePlateRepository.findPlate(q));
      } else {
        model.addAttribute("error", new InvalidSearchError());
      }
    }

      if (q.startsWith("RB")) {
        model.addAttribute("list", licensePlateRepository.findAllPolice(q));
      } else if (q.startsWith("DT")) {
        model.addAttribute("list", licensePlateRepository.findAllDiplomat(q));
      }
      return "index";
    }

    @GetMapping(value = "/search/{brand}")
    public String assigneeTodo (@PathVariable String brand, Model model){

      model.addAttribute("list", licensePlateRepository.findByCarBrand(brand));

      return "index";
    }
}
