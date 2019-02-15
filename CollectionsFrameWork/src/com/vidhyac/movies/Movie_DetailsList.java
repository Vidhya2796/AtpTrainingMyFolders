package com.vidhyac.movies;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Movie_DetailsList<String> {
	//private ClassType obj;
	//like setter method...here we rename the set method as add
	
	private ArrayList<String> arr;
	
	//add movie into arraylist
	public void add_movie(ArrayList<String> arr){
		//arr= new ArrayList<ClassType>();
		this.arr = arr;
	}
	//get all movie
	public ArrayList<String> get_all_movie(){
		return this.arr;
	}
	//remove particular movie
	public void remove_movie(int index){
		arr.remove(index);
	}
	
	public ArrayList<String> sortAscending() {          
		//Collections.sort(this.arr);   
		return this.arr;    
	  } 
	
	//remove_AllMovies
	public void remove_AllMovies(){
		arr.removeAll(arr);
	}

	//find_movie_By_mov_Name(), find_movie_By_Genre()
	public String find_movie_By_mov_Name(String mov_Name){
		//ClassType mov=(ClassType)mov_Name;
		int i=0;
		if((String)arr.get(i)==mov_Name){
			System.out.println(arr);
		}
			i++;
		return (String) arr;
	}	
	
	//sorting Collections.sort() 
	public void sort(){
		Collections.sort(this.arr);
	}
	
	
/*	public ArrayList<String> sortAscending() {         
	    Collections.sort(this.arrayList);         
	    return this.arrayList;     
	  }       
	  public ArrayList<String> sortDescending() {         
	    Collections.sort(this.arrayList, Collections.reverseOrder());         
	    return this.arrayList;     
	  }*/
}
