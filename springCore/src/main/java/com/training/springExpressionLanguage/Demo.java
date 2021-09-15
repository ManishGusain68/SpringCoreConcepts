package com.training.springExpressionLanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{5+2}")
	private int x;
	@Value("#{10+2+9999}")
	private int y;

	@Value("#{T(java.lang.Math).sqrt(144)}")
	private double z;
	
	@Value("#{T(java.lang.Math).E}")
	private double e;

	@Value("#{new java.lang.String('Manish Gusain')}")
	private String name;
	
	@Value("#{9>4 }")
	private boolean isActive;
	
	public double getE() {
		return e;
	}

	public void setE(double e) {
		this.e = e;
	}

	public double getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
		
	}

	public int getX() {
		
		return x;
	}

	public void setX(int x) {
		
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}

}
