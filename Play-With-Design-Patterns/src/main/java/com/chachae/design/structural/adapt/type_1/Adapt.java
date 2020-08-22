package com.chachae.design.structural.adapt.type_1;

import com.chachae.design.structural.adapt.Source;
import com.chachae.design.structural.adapt.Targetable;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/24 10:39
 */
public class Adapt extends Source implements Targetable {

  @Override
  public void editWordFile() {
    System.out.println("a word file editing");
  }
}
