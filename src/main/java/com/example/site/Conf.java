package com.example.site;//1-й класс

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Conf {
    public long id;//id

    public String name_;//вид техники
    public String date_;//тип техники
    public String first_fio;//Дата ввоза на склад
    public String last_fio;//Дата вывоза со склада

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName_() {
        return name_;
    }

    public void setName_(String name_) {
        this.name_ = name_;
    }

    public String getDate_() {
        return date_;
    }

    public void setDate_(String date_) {
        this.date_ = date_;
    }

    public String getFirst_fio() {
        return first_fio;
    }

    public void setFirst_fio(String first_fio) {
        this.first_fio = first_fio;
    }

    public String getLast_fio() {
        return last_fio;
    }

    public void setLast_fio(String last_fio) {
        this.last_fio = last_fio;
    }
}
