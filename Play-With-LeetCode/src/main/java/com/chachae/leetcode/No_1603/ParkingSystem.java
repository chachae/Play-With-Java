package com.chachae.leetcode.No_1603;

/**
 *
 * @author chachae
 * @date 2020/10/13 16:52
 * @version v1.0
 */
class ParkingSystem {

  private Integer bigNum;
  private Integer mediumNum;
  private Integer smallNum;

  public ParkingSystem(int big, int medium, int small) {
    this.bigNum = big;
    this.mediumNum = medium;
    this.smallNum = small;
  }

  public boolean addCar(int carType) {
    return switchAndCheck(carType);
  }

  private boolean switchAndCheck(int carType) {
    if (carType == 1 && this.bigNum != 0) {
      --this.bigNum;
      return true;
    } else if (carType == 2 && this.mediumNum != 0) {
      --this.mediumNum;
      return true;
    } else if (carType == 3 && this.smallNum != 0) {
      --this.smallNum;
      return true;
    }
    return false;
  }
}