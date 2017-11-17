package com.greenfox.barbara.exam.exception;


public class InvalidSearchError {

String error;

  public InvalidSearchError() {
    this.error = "Sorry, the submitted licence plate is not valid";
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
