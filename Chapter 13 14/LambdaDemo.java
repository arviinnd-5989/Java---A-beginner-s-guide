interface MyValue{
double getValue();
}

interface MyParamValue{
double getValue(double v);
}

class LambdaDemo{
public static void main(String args[])
{
MyValue myVal;
myVal = () -> 98.6;

System.out.println(myVal.getValue());


MyParamValue myPval = (n) -> 1.0/n;
System.out.println(myPval.getValue(4.0));
}
}
