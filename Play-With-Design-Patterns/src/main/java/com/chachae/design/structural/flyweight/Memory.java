package com.chachae.design.structural.flyweight;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/24 15:55
 */
public class Memory {

  private String id;
  private Long size;
  private Boolean isUsed;

  public Memory(String id, Long size, Boolean isUsed) {
    this.id = id;
    this.size = size;
    this.isUsed = isUsed;
  }

  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public Boolean getUsed() {
    return isUsed;
  }

  public void setUsed(Boolean used) {
    isUsed = used;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "Memory{" +
        "id='" + id + '\'' +
        ", size=" + size +
        ", isUsed=" + isUsed +
        '}';
  }
}
