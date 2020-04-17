package com.cerner.training.behaviour.state;

public class Kid {
	private int age;
	private KidState kidState;
	public Kid(int age){
		this.setAge(age);
	}
	
	public void play(){
		kidState.play();
	}
	
	public void eat(){
		kidState.eat();
	}
	
	public void setAge(int age){
		this.age = age;
		if(age == 1){
			kidState = new FirstYearKid();
		}else if(age ==2){
			kidState = new SecondYearKid();
		}else if(age ==3){
			kidState = new ThirdYearKid();
		}else if(age == 4){
			kidState = new FourthYearKid();
		}else{
			kidState = new FirstYearKid();
		}
	}
}
