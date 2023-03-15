package com.example.site;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ConfRepository extends JpaRepository<Conf,Long>{
    @Query("SELECT p FROM Conf p WHERE concat(p.name_, '', p.date_, '', p.first_fio, '', p.last_fio) LIKE %?1%")
    List<Conf> search(String keyword);
}