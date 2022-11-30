package com.kluevja.bankappweb.models;

<<<<<<< HEAD
import lombok.EqualsAndHashCode;
=======
>>>>>>> 88e49c0 (Модель и репа для Аккаунта)
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@ToString
<<<<<<< HEAD
@EqualsAndHashCode
=======
>>>>>>> 88e49c0 (Модель и репа для Аккаунта)
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
<<<<<<< HEAD
    private String name;
    private double balance;
    //private boolean isBlocked;
    //private boolean isSalary;
=======
    private double balans;

>>>>>>> 88e49c0 (Модель и репа для Аккаунта)
}
