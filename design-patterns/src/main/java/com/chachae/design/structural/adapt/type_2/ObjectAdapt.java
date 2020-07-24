package com.chachae.design.structural.adapt.type_2;

import com.chachae.design.structural.adapt.Source;
import com.chachae.design.structural.adapt.Targetable;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/24 10:44
 */
public class ObjectAdapt implements Targetable {

  private final Source source;

  public ObjectAdapt(Source source) {
    super();
    this.source = source;
  }

  @Override
  public void editTextFile() {
    this.source.editTextFile();
  }

  @Override
  public void editWordFile() {
    System.out.println("a word file editing");
  }
}
