package com.example.site;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DeviceRepository extends JpaRepository<Conf,Long>{
    @Query("SELECT p FROM Conf p WHERE concat(p.type1, '', p.groupp, '', p.date_first, '', p.data_last, '', p.fio) LIKE %?1%")
    List<Conf> search(String keyword);
}
