class StaticDemo{
int x;
static int y;

int sum(){
return x + y;
}
}

class SDemo{
public static void main (String args[]){
StaticDemo ob1 = new StaticDemo();
StaticDemo ob2 = new StaticDemo();

ob1.x = 10;
ob2.x = 20;

System.out.println("independent");
System.out.println(ob1.x + " "  + ob2.x);
System.out.println();

System.out.println("Shared");
StaticDemo.y = 19;
System.out.println("19");
System.out.println(ob1.sum());
System.out.println(ob2.sum());

StaticDemo.y = 100;

System.out.println("Change");

System.out.println(ob1.sum());
System.out.println(ob2.sum());
System.out.println();
}
}
