package com.tyss.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
	public Student(){
		
	}
private int sid;
private String sname;

private Gadgets gadgets;
}
