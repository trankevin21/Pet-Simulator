public class pet {
	private String name;
	private String type;
	private String color;
	private String gender;
	private int age;
	private double weight;
	private double height;
	private int hunger;
	
	public pet(String name, String type, String color, String gender, int age, double weight, double height, int hunger) {
		this.name = name;
		this.type = type;
		this.color = color;
		this.gender = gender;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.hunger = hunger;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public int getHunger() {
		return hunger;
	}
	
	public void setHunger(int hunger) {
		this.hunger = hunger;
	}
	
	public String toString() {
		return "pet [name=" + name +", type=" + type +", color=" + color +", gender="+ gender +", age=" + age +", weight=" + weight +", height=" + height +", hunger=" + hunger + "]";
	}
}

