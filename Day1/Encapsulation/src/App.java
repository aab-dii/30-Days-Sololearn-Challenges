import java.util.Scanner;

public class App
{
	public static void main(String[] args) {
	    Scanner read = new Scanner(System.in);
	    int a = read.nextInt();
	    
	    Pupil pupil =  new Pupil();
            pupil.setAge(a);
            pupil.check(a);
            read.close();
	}
}

class Pupil{
    private int age;
    
    //complete setter method
    public void  setAge(int a){
       this.age = a;
    }
    
    public int getAge(){
        return age;
    }

    public void check(int age){
        if (age > 6){
            System.out.println("Welcome");
        }else{
            System.out.println("Sorry");
        }
    }
}