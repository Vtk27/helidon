package com.arithmetic.addition;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class multiplicationBLogic {
   public int execute(int a, int b) {
	   System.out.println("multiplication of two nums : "+ (a*b));
	   return a*b;
   }
}
