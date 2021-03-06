package com.greenfox.barbara.exam.repository;

import com.greenfox.barbara.exam.model.LicencePlates;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface LicensePlateRepository extends CrudRepository<LicencePlates, String> {

  @Query(value = "SELECT * FROM exam.licence_plates WHERE plate LIKE %?1%", nativeQuery = true)
  List<LicencePlates> findPlate(String q);

  @Query(value = "SELECT * FROM exam.licence_plates WHERE plate LIKE \"?DT%\"", nativeQuery = true)
  List<LicencePlates> findAllDiplomat(String q);

  @Query(value = "SELECT * FROM exam.licence_plates WHERE plate LIKE \"?RB%\"", nativeQuery = true)
  List<LicencePlates> findAllPolice(String q);

  List<LicencePlates> findByCarBrand(String brand);

}
