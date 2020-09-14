interface NumericTest{
boolean test(int n, int m);
}

class LambdaDemo2{
public static void main(String args[])
{
NumericTest isFactor = (n,d) -> (n%d) == 0;

if(isFactor.test(10,2))
System.out.println("factor");
if(!isFactor.test(10,3))
System.out.println("not factor");

NumericTest absEqual = (n,m) -> (n<0?-n:n)==(m<0?-m:m);

if(absEqual.test(4,-4))
System.out.println("equal");
}
}
