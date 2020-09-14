interface StringTest{
boolean test(String aStr, String bStr);
}

class LambdaDemo3{
public static void main(String args[])
{
StringTest isIn = (a,b) -> a.indexOf(b) != -1;

String str = "this is a test";
if(isIn.test(str, "is a"))
System.out.println("found");
}
}
