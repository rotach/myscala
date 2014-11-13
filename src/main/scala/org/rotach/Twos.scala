package org.rotach


/******************************************
 * Class to deal with "twos"
 ******************************************/

class Twos {
  def twos(nums: Array[Int]): Int = {
    if (nums.size == 1) {
      return if (nums(0) == 2) 1 else 0
    } else {
      return (if (nums(0) == 2) 1 else 0) + twos(nums.slice(1,nums.size))
    }
  }

  def nottwos(nums: Array[Int]): Int = {
    if (nums.size == 1) {
      return if (nums(0) == 2) 0 else 1
    } else {
      return (if (nums(0) == 2) 0 else 1) + nottwos(nums.slice(1,nums.size))
    }
  }
}
