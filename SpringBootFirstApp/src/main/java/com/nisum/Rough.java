package com.nisum;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Rough {
  public static void main(String[] args) {
	  int n=5;
	for(int j=1; j<= n; j++) {
		for(int i=1; i<= j; i++) {
			System.out.print("?");
		}
		for(int i=1; i<= n-j+1;i++) {
			System.out.print("8");
		}
		System.out.println();
		
		
	}
  }
 }
