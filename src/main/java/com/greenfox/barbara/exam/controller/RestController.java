package com.greenfox.barbara.exam.controller;

import com.greenfox.barbara.exam.model.LicencePlates;
import com.greenfox.barbara.exam.repository.LicensePlateRepository;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @Autowired
  LicensePlateRepository licensePlateRepository;

  @GetMapping("/api/search/{brand}")
  public Object searchBrand(@PathVariable(required = false) String brand) {

    List<LicencePlates> licencePlates = licensePlateRepository.findByCarBrand(brand);

    return licencePlates;
  }
}
