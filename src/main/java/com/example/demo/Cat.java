package com.example.demo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
@Entity
@NoArgsConstructor
//@RequiredArgsConstructor
class Cat {

    @Id
    @GeneratedValue
    Long id;

    @NotNull
    String name;
}

