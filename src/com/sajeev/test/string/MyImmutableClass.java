package com.sajeev.test.string;

public final class MyImmutableClass {

	private String name;
	
	private String mobile;

	
	public MyImmutableClass(String name, String mobile) {
		super();
		this.name = name;
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}

	public String getMobile() {
		return mobile;
	}
	
	
}
