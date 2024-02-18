package com.azam.spm;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PowerEngine implements Engine{
	
	@Value("Power Engine")
	private String name;
	
	@Override
	public void start() {
		System.out.println(name + " started");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
