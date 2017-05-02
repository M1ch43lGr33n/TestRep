package readingFromFileAndEdit;

import java.util.ArrayList;

public class SplitingString {
	
	@SuppressWarnings("null")
	public static void Split(String arrayList, int i){
		
		ArrayList<Person> listPeople = new ArrayList <>(); //creates array for storing people objects
		ArrayList<Animal> listAnimal = new ArrayList <>(); // creates array for storing animal objects
		
		String holder = arrayList;	//change text input to a single string
		
		String[] sections = holder.split("&");	//split string via & to give people and animal section
		
		String peopleStr = sections[0]; // holds people info
		String animalStr = sections[1]; // holds Animal info
		
		//code to split up people 
		String[] peopleInfo = peopleStr.split("%"); // need to separate info for each person to name, dob, occ
		for(int j = 0; j < peopleInfo.length; j ++){
			
			
			String[] sepPeopleInfo = peopleInfo[j].trim().split("\n");
			
			String salaryStr = sepPeopleInfo[3].substring(2, sepPeopleInfo[3].length()); // creating salary in to an integer
			int salary = Integer.parseInt(salaryStr);
			Person person1 = new Person(sepPeopleInfo[0], sepPeopleInfo[1], sepPeopleInfo[2], salary);
			listPeople.add(person1);
			}
		
		System.out.println(listPeople.get(0).name + " " + listPeople.get(0).dob + " " +listPeople.get(0).occ +" "+ listPeople.get(0).salary);
		
		System.out.println("------");
		
		//code to split up animals
		
		String[] animalInfo = animalStr.split("%"); // need to separate info for each animal name and type
		for(int j = 0; j < animalInfo.length; j ++){
			String a = animalInfo[j].trim().toString();
			String[] sepAnimalInfo = a.split("\n");
			Animal pet = new Animal(sepAnimalInfo[0] , sepAnimalInfo[1] );
			listAnimal.add(pet);
		}
		
		//setting pets to people. 
		System.out.println(listAnimal.get(2).name + " " + listAnimal.get(2).species);
		listPeople.get(0).setAnimal(listAnimal.get(1));
		listPeople.get(1).setAnimal(listAnimal.get(1));
		listPeople.get(2).setAnimal(listAnimal.get(2));
		for(int l = 0; l<listPeople.size(); l++){
			System.out.println(listPeople.get(l).name + " " + listPeople.get(l).dob + " " +listPeople.get(l).occ +" "+ listPeople.get(l).salary + " " + listPeople.get(l).getPet().getName() + " " + listPeople.get(l).getPet().getSpecies());
		}
		
		int [] salHolder = null;
		int sum = 0;
		for(int l = 0; l < listPeople.size() ; l++){
				if(listPeople.get(l).getPet().getName().equals("Cat")){
					salHolder[l] = listPeople.get(l).getSalary();
				}
		}
		for(int k = 0; k < salHolder.length; k++){
			sum =  sum + salHolder[k];
		}
		sum /= salHolder.length;
		System.out.println(sum);
	}
	
}
