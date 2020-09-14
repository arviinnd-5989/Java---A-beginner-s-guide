class A{
int i;
}

class B extends A{
int i;

B(int a, int b){
super.i = a;
i = b;
}

void show(){
System.out.println(super.i);
System.out.println(i);
}
}

class UseSuper{
public static void main(String args[]){
B subOb = new B(1,2);
subOb.show();
}
}
