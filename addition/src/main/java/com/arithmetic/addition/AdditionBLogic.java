package com.arithmetic.addition;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AdditionBLogic {
  public int execute(int a, int b) {
	  System.out.println("blogic addition " + (a+b));
	  return a+b;
  }
}
