interface SomeTest<T>{
boolean test(T n, T m);
}

class GenericFunctionalInterfaceDemo{
public static void main(String args[])
{
SomeTest<Integer> isFactor = (n,d) -> (n%d) == 0;
if(isFactor.test(10,2))
System.out.println("factor");

SomeTest<String>isIn = (a,b) -> a.indexOf(b) != -1;

String str = "this is a test";
if(isIn.test(str, "is a"))
System.out.println("found");
}
}
