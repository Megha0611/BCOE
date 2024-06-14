package com.gvacharya.operaters;

public class ArithmeticOperators {
	
	float operand1;
	float operand2;
	
	public ArithmeticOperators() {
		
	}
	
	public ArithmeticOperators(float operand1,float operand2) {
		//variable shadowing 
		this.operand1=operand1;
		this.operand2=operand2;
	}
	
///public float getOperand1() {
	///return operand1;
///}
///public void setOperand1(float operand1) {
	///this.operand1=operand1;
///}

///public float getOperand2() {
	///return operand2;
///}
///public void setOperand2(float operand2) {
	///this.operand2=operand2;
///}


public float addTwoOperands() {
	return operand1+operand2;
}
public float substractTwoOperands() {
	return operand1-operand2;
}
public float divisionTwoOperands() {
	return operand1/operand2;
}
public float multiplicationTwoOperands () {
     return operand1*operand2;
}

	
}
