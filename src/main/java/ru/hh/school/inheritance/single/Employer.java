package ru.hh.school.inheritance.single;

import javax.persistence.Entity;

@Entity(name = "EmployerSingle")
public class Employer extends User {

  private String company;

  public void setCompany(String company) {
    this.company = company;
  }

  @Override
  public String generateGreeting() {
    return super.generateGreeting() + " from " + company;
  }
}
