package com.nisum;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@RequestMapping("/data")
  public String getData() {
	  System.out.println("..reached...");
	  return "from Spring boot Application controller";
  }
}
