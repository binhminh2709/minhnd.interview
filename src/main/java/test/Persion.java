package test;

import lombok.Data;

@Data
public class Persion {

  private String name;
  private Integer age;

  public Persion(String name, Integer age) {
    this.name = name;
    this.age = age;
  }
}
