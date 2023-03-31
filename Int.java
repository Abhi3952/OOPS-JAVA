interface I1{

// in  inerface abstract method automatically take public and abstract , we dont need to apply 

void show();
// we can create default concrete method in interface 

 default void display(){

}

int a=10; 

//in interface all variable automatically public static final 



}
class Int implements  I1 {

 public void show(){
System.out.println("I1");

}

public static void main(String[] args) {
 
// WE cant create object of interface I1 so we have to create object of main class Int 

Int ob1=new Int ();
ob1.show();

}
}