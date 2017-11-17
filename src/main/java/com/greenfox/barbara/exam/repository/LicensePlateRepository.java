package com.greenfox.barbara.exam.repository;

import com.greenfox.barbara.exam.model.LicencePlates;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface LicensePlateRepository extends CrudRepository<LicencePlates, String> {

  @Query(value = "SELECT * FROM exam.licence_plates WHERE plate LIKE %%", nativeQuery = true)
  List<LicencePlates> findIt(String keyword);

}
