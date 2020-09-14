class Gen<T>{
T ob;

Gen(T o){
ob = o;
}

T getob(){
return ob;
}

void showType(){
System.out.println(ob.getClass().getName());
}
}

class GenDemo{
public static void main(String args[]){
Gen<Integer> iOb;

iOb = new Gen<Integer>(88);

iOb.showType();

int v = iOb.getob();
System.out.println(v);

Gen<String> strOb = new Gen<String>("generics");

strOb.showType();
String str = strOb.getob();
System.out.println(str);
}
}

