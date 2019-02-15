package com.vidhyac.collection;

public class Person implements Comparable<Person> {
	public String name;
	public int weight;
	public float height;
	
	//parameterised constructor
	public Person(String name,int weight,float height){
		this.name=name;
		this.weight=weight;
		this.height=height;
	}
	
	//Comparable interface do sorting based on weight
	@Override
	public int compareTo(Person per) {
		//sort weight based on ascending order
		if(weight>per.weight){
			return 1;
		}
		else if(weight<per.weight){
			return -1;
		}
		else{
			//return 0;
			//if two persons having same weight then it sorts height based on descending order
			if(height<per.height){
				return 1;
			}
			else if(height>per.height){
				return -1;
			}
			else
				return 0;
		}
	}
	
	/*String name[]={"Vidhya","Priya","Sudha","Dhivya","Pechi"};
	int weight[]={54,55,38,54,70};//weight in kg
	float height[]={5.7f,5.2f,5.3f,5.0f,5.9f};//height in feet
*/
	


}