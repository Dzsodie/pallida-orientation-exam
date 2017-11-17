package com.greenfox.barbara.exam.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LicencePlate {

  @Id
  String plate;

  String carBrand;
  String carModel;
  String color;
  Integer year;

  public LicencePlate(String plate, String carBrand, String carModel, String color,
      Integer year) {
    this.plate = plate;
    this.carBrand = carBrand;
    this.carModel = carModel;
    this.color = color;
    this.year = year;
  }

  public LicencePlate() {
  }

  public String getPlate() {
    return plate;
  }

  public void setPlate(String plate) {
    this.plate = plate;
  }

  public String getCarBrand() {
    return carBrand;
  }

  public void setCarBrand(String carBrand) {
    this.carBrand = carBrand;
  }

  public String getCarModel() {
    return carModel;
  }

  public void setCarModel(String carModel) {
    this.carModel = carModel;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }
}
