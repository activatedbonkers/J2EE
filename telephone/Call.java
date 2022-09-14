package telephone;

public class Call {
	String name;
	int phoneNumber;
	//String time;
	public Call(String n, int p) {
		name = n;
		phoneNumber = p;
		//time = t;
	}
	public void display(){
		System.out.println("Name : " + name + " " + "Number : " + phoneNumber);	
	}
}
