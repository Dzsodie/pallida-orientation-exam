package com.greenfox.barbara.exam.model;

import javax.servlet.http.HttpServletRequest;

public class Status {

  String result;

  public Status(String result) {
    this.result = result;
  }

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }
}
