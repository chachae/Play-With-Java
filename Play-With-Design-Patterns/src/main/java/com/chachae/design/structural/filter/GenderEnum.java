package com.chachae.design.structural.filter;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/24 16:31
 */
public enum GenderEnum {

  MALE(1, "male"),

  FEMALE(0, "female");

  GenderEnum(Integer code, String name) {
    this.code = code;
    this.name = name;
  }

  private final Integer code;

  private final String name;

  public Integer getCode() {
    return this.code;
  }

  public static String getName(Integer code) {
    for (GenderEnum cur : GenderEnum.values()) {
      if (cur.code.equals(code)) {
        return cur.name;
      }
    }
    return null;
  }

}
