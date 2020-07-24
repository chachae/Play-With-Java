package com.chachae.design.structural.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/24 16:31
 */
public class FemaleFilter implements Filter {

  @Override
  public List<Person> filterGender(List<Person> persons) {
    List<Person> res = new ArrayList<>();
    for (Person person : persons) {
      if (person.getGenderCode().equals(GenderEnum.FEMALE.getCode())) {
        res.add(person);
      }
    }
    return res;
  }
}
