package com.greenfox.barbara.exam.model;

import com.greenfox.barbara.exam.repository.LicensePlateRepository;
import java.util.List;

public class Response  {

  Status result;
  List<LicencePlates> data;

  public Response(Status result, List<LicencePlates> data) {
    this.result = result;
    this.data = data;
  }

  public Response() {
  }

  public Status getResult() {
    return result;
  }

  public void setResult(Status result) {
    this.result = result;
  }

  public List<LicencePlates> getData() {
    return data;
  }

  public void setData(List<LicencePlates> data) {
    this.data = data;
  }
}
