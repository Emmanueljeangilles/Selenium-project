package com.cydeo.tests.day09_javaFaker;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class Java_Faker {

      @Test
    public void JavaFakerTest(){
          //Use fakeer to generate random information
        Faker faker = new Faker();
        System.out.println("faker.name().fullName() = " + faker.name().fullName());
          System.out.println("faker.address().fullAddress() = " + faker.address().fullAddress());
          System.out.println("faker.numerify(\"954-###-####\") = " + faker.numerify("954-###-####"));
          System.out.println("faker.job().title() = " + faker.job().title());
          System.out.println("faker.aviation().aircraft() = " + faker.aviation().aircraft());
          System.out.println("faker.book().genre() = " + faker.book().genre());
      }























}
