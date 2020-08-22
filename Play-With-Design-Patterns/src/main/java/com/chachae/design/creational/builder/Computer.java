package com.chachae.design.creational.builder;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/23 22:30
 */
public class Computer {

  private String cpu;

  private String memory;

  private String disk;

  public String getCpu() {
    return cpu;
  }

  public void setCpu(String cpu) {
    this.cpu = cpu;
  }

  public String getMemory() {
    return memory;
  }

  public void setMemory(String memory) {
    this.memory = memory;
  }

  public String getDisk() {
    return disk;
  }

  public void setDisk(String disk) {
    this.disk = disk;
  }

  @Override
  public String toString() {
    return "Computer{" +
        "cpu='" + cpu + '\'' +
        ", memory='" + memory + '\'' +
        ", disk='" + disk + '\'' +
        '}';
  }
}
