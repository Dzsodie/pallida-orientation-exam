package com.greenfox.barbara.exam.repository;

import com.greenfox.barbara.exam.model.LicencePlate;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface LicensePlateRepository extends CrudRepository<LicencePlate, String> {

  @Query(value = "SELECT * FROM exam.licence_plates WHERE plate LIKE %%", nativeQuery = true)
  List<LicencePlate> findIt(String keyword);

}
