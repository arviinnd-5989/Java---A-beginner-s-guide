class StrOps{
public static void main(String args[]){
String str1 = "java is #1.";
String str2 = new String(str1);
String str3 = "Java strings are powerful";

int result, idx;
char ch;

System.out.println("Length of str1 " + str1.length());

for (int i = 0; i<str1.length();i++)
System.out.print(str1.charAt(i));
System.out.println();

if(str1.equals(str2))
System.out.println("equal");
else 
System.out.println("not equal");

if(str1.equals(str3))
System.out.println("equals");
else
System.out.println("Not equal");

result = str1.compareTo(str3);

if(result == 0)
System.out.println("equal");
else if (result <0)
System.out.println("Str1 is less");
else
System.out.println("Str1 is greater");

str2 = "One Two One";

idx = str2.indexOf("One");
System.out.println(idx);
idx = str2.lastIndexOf("One");
System.out.println(idx);
}
}
