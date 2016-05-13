package com.test;

import java.util.Map;
import java.util.TreeMap;

public enum TEST {
  
  A1(Group.A),
  A2(Group.A),
  A3(Group.A),
  A4(Group.A),
  B1(Group.B),
  B2(Group.B),
  B3(Group.B),
  C1(Group.C),
  C2(Group.C),
  C3(Group.C),
  C4(Group.C),
  C5(Group.C);
  
  private static Map<Integer, TEST> ss = new TreeMap<Integer, TEST>();
  private static final int START_VALUE = 100;
  private int value;
  private Group group;
  
  static {
    for(int i=0;i<values().length;i++) {
      values()[i].value = START_VALUE + i;
      ss.put(values()[i].value, values()[i]);
    }
  }
  
  TEST(Group group) {
      this.group = group;
  }
  
  public boolean isInGroup(Group group) {
      return this.group == group;
  }
  
  public static TEST fromInt(int i) {
    return ss.get(i);
  }
  
  public int value() {
    return value;
  }
  
  public enum Group {
      A,
      B,
      C;
  }
}

