package com.gvacharya.operaters;

public class TernaryOperator {
	int variable1;
	int variable2;
	
	public TernaryOperator(int vaiable1,int vaiable12) {
		this.variable1=variable1;
		this.variable2=variable2;
	}

	public TernaryOperator() {
		// TODO Auto-generated constructor stub
	}

	public int getVariable1() {
		return variable1;
	}

	public void setVariable1(int variable1) {
		this.variable1 = variable1;
	}

	public int getVariable2() {
		return variable2;
	}

	public void setVariable2(int variable2) {
		this.variable2 = variable2;
	}
	public int ternaryOperator() {
		return (variable1>variable2)?variable1:variable2;
		
	}

}
