package appstart.mymodappdemo;

import appfuncs.simplefuncs.SimpleMathFuncs;
import appsupport.supportfuncs.SupportFuncs;

public class MyModAppDemo{
public static void main(String [] args){
if(SupportFuncs.isFactor(2,10))
System.out.println("2 is a factor of 10");
System.out.println(SimpleMathFuncs.lcf(35,105));
System.out.println(SimpleMathFuncs.gcf(35,105));
}
}
