package com.chachae.design.structural.filter;

import java.util.List;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/24 16:30
 */
public interface Filter {

  List<Person> filterGender(List<Person> persons);

}
