class Overload{
void ovlDemo(){
System.out.println("No parameters");
}

void ovlDemo(int a){
System.out.println(a);
}

int ovlDemo(int a, int b){
System.out.println(a + " " + b);
return a +b;
}

double ovlDemo(double a, double b){
System.out.println(a + " " + b);
return a + b;
}
}

class OverloadDemo{
public static void main(String args[]){
Overload ob = new Overload();
int resI;
double resD;

ob.ovlDemo();
System.out.println();

ob.ovlDemo(2);
System.out.println();

resI = ob.ovlDemo(4,6);
System.out.println(resI);
System.out.println();

resD = ob.ovlDemo(1.1, 2.32);
System.out.println(resD);

}
}
