package com.azam.spm;

public class TurboEngine implements Engine{
	private String name;

	@Override
	public void start() {
		System.out.println(name+" started");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
