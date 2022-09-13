import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Random;

public class petAPP {
	public static void main(String[] args) {
		ArrayList<pet> pets = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		String continueExit;
		
		//pet(name, type, color, gender, age, weight, height, hunger)
		pets.add(new pet("Scooby-Doo", "Dog", "Brown", "Male", 52, 70, 12, 4));
		pets.add(new pet("Garfield", "Cat", "Orange", "Male", 45, 40, 20, 7));
		pets.add(new pet("Appa", "Flying Bison", "White", "Male", 106, 10000, 100, 3));
		pets.add(new pet("Lola", "Bunny", "Brown", "Female", 31, 68, 21, 9));
		
		do {
			int optionPet;
			
			do {//User Interface
				System.out.println("(1) List Pets\r\n" + "(2) Hunger Levels\r\n" + "(3) Feed Pets\r\n" + "(4) Play Time\r\n" + "(5) Add Pet\r\n" + "(6) Delete Pet\r\n" + "(7) Exit");
                System.out.print("Select an option: ");
                optionPet = scan.nextInt();
                
                if(optionPet == 1) {//List Pets
                	for (int petList = 0; petList < pets.size(); petList++) {
                        System.out.println("Name: " + pets.get(petList).getName());
                        System.out.println("Type: "+ pets.get(petList).getType());
                        System.out.println("Gender: "+ pets.get(petList).getGender());
                        System.out.println("Color: "+ pets.get(petList).getColor());
                        System.out.println("Age: "+ pets.get(petList).getAge());
                        System.out.println("Height: "+ pets.get(petList).getHeight());
                        System.out.println("Weight: "+ pets.get(petList).getWeight() + "\n");
                    }
                }else if(optionPet == 2) {//Hunger Levels(0 Very Hungry - 10 Very Full)
                	for (int petList = 0; petList < pets.size(); petList++) {
                        if(pets.get(petList).getHunger() >= 5) {//If the level is less than 5 than the pet is hungry
                        	System.out.println(pets.get(petList).getName() + " is NOT hungry");
                        	System.out.println("Hunger Level: " + pets.get(petList).getHunger() + "/10\n");
                        }else {
                        	System.out.println(pets.get(petList).getName() + " is hungry");
                        	System.out.println("Hunger Level: " + pets.get(petList).getHunger() + "/10\n");
                        }
                    }
                }else if(optionPet == 3) {//Feed Pets
                	for (int petList = 0; petList < pets.size(); petList++) {
                        if(pets.get(petList).getHunger() >= 5) {//Only feeds pets if the level is less than 5
                        	double foodWeight = 1.23;//If the pet doesn't eats it'll lose weight.
                        	double weightDec = pets.get(petList).getWeight() - foodWeight;
                        	pets.get(petList).setWeight(weightDec);
                        	System.out.println(pets.get(petList).getName() + " is not hungry yet!");
                        }else {
                        	int feedMax = 10;
                        	pets.get(petList).setHunger(feedMax);
                        	double foodWeight = 3.21;//If the pet eats it'll gain weight.
                        	double weightInc = pets.get(petList).getWeight() + foodWeight;
                        	pets.get(petList).setWeight(weightInc);
                        	System.out.println(pets.get(petList).getName() + " is feed!");
                        }
                    }
                }else if(optionPet == 4) {//Play Time
                	System.out.println("(1) Walk\r\n" + "(2) Swim\r\n" + "(3) Play ball\r\n");//Each activity lowers a different amount of hunger level
                    System.out.print("Select an option: ");
                    int optionPlay = scan.nextInt();
                    
                    if (optionPlay == 1) {//Walk
                    	for (int petList = 0; petList < pets.size(); petList++) {
                            System.out.println(pets.get(petList).getName() + " had fun walking");
                    	int walk = 1;//Lowers Hunger level by 1
                    	int hungerWalk= pets.get(petList).getHunger() - walk;
                    	pets.get(petList).setHunger(hungerWalk);
                    	}
                    	System.out.println("\n");
                    }else if(optionPlay == 2){//Swim
                    	for (int petList = 0; petList < pets.size(); petList++) {
                            System.out.println(pets.get(petList).getName() + " had fun swiming");
                    	int swim = 3;//Lowers Hunger level by 3
                    	int hungerSwim= pets.get(petList).getHunger() - swim;
                    	pets.get(petList).setHunger(hungerSwim);
                    	}
                    	System.out.println("\n");
                    }else if(optionPlay == 3){//Play Ball
                    	for (int petList = 0; petList < pets.size(); petList++) {
                            System.out.println(pets.get(petList).getName() + " had fun playing ball");
                    	int playBall = 2;//Lowers Hunger level by 2
                    	int hungerPlayBall= pets.get(petList).getHunger() - playBall;
                    	pets.get(petList).setHunger(hungerPlayBall);
                    	}
                    	System.out.println("\n");
                    }else {
                    	System.out.println("Invalid! Try Again!\n");
                    }	
                	
                }else if(optionPet == 5) {//Add Pet
                	System.out.println("Enter name for pet ");
                	String newPetName = scan.next();
                	
                	System.out.println("Enter type of pet ");
                	String newPetType = scan.next();
                	
                	System.out.println("Enter color for pet ");
                	String newPetColor = scan.next();
                	
                	System.out.println("Enter gender of pet ");
                	String newPetGender = scan.next();
                	
                	System.out.println("Enter age of pet ");
                	int newPetAge = scan.nextInt();
                	
                	System.out.println("Enter weight of pet ");
                	double newPetWeight = scan.nextDouble();
                	
                	System.out.println("Enter height of pet ");
                	double newPetHeight = scan.nextDouble();
                	
                	Random rand = new Random();//The hunger level is randomly assigned from 0-10
                	int newPetHunger = rand.nextInt(10);
                	
                	//pet(name, type, color, gender, age, weight, height, hunger)
            		pets.add(new pet(newPetName, newPetType, newPetColor, newPetGender, newPetAge, newPetWeight, newPetHeight, newPetHunger));
                }else if(optionPet == 6) {//Delete Pet
                	for (int petList = 0; petList < pets.size(); petList++) {
                		 System.out.println("Name: " + pets.get(petList).getName());
                    }
             	   System.out.println("\n\nEnter pet name to be deleted: ");
                   String delPetName = scan.next();
                   int petTerminated = 0;
                   Iterator<pet> data = pets.iterator();
                   while (data.hasNext()) {
                	   if (data.next().getName().equals(delPetName)) {
                		   petTerminated = 1;
                		   data.remove();
                        }
                    }
                    if (petTerminated == 1) {
                        System.out.println("Pet Terminated :( ");
                        
                    } else {
                        System.out.println("Pet Name: " + delPetName + " not found!");
                    }
                }else if(optionPet == 7) {//Exit
                	System.out.println("Exit!");
                }else {
                    System.out.println("Invalid! Try Again!\n");
                }
                
			}while (optionPet != 7);
			
			System.out.println("Are you Sure? (y/n)");
	        continueExit = scan.next();
		}while (!continueExit.equalsIgnoreCase("y"));
	}
}

