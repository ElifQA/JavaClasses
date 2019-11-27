package com.class26;

public class TestDegree {//overriding ex

	public static void main(String[] args) {
		Degree under=new Degree();
		under.getDegree();
		
		Undergraduate u=new Undergraduate();
		u.getDegree();
		
		Postgraduate post=new Postgraduate();
		post.getDegree();
	}

}
