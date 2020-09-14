class Gen<T>{
T ob;

Gen(T o){
ob = o;
}


T getob(){
return ob;
} 
}
class RawDemo{
public static void main(String args[]){
Gen<Integer> iOb = new Gen<Integer>(88);
Gen<String> strOb = new Gen<String>("generics test");

Gen raw = new Gen(98.6);

double d = (Double) raw.getob();
System.out.println(d);
strOb = raw;
}
}

