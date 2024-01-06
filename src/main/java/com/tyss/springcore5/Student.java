package com.tyss.springcore5;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	String name;
	//Student(){}
	
	Student(@Value(value="nasar")String name){
		this.name=name;
	}
	

}
