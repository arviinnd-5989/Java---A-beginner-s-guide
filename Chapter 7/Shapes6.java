class TwoDShape{
private double width;
private double height;

TwoDShape(){
width = height = 0.0;
}

TwoDShape(double w, double h){
width = w;
height = h;
}

TwoDShape(double x){
width = height = x;
}

double getWidth(){return width;}
double getHeight(){return height;}
void setWidth(double w){width=w;}
void setHeight(double h){height = h;}

void showDim(){
System.out.println(width + " " + height);
}
}

class Triangle extends TwoDShape{
private String style;

Triangle(){
super();
style = "none";
}

Triangle(String s, double w, double h){
super(w,h);
style = s;
}

Triangle(double x){
super(x);
style = "filled";
}

double area(){
return getWidth()*getHeight()/2;
}

void showStyle(){
System.out.println(style);
}
}

class ColorTriangle extends Triangle{
private String color;

ColorTriangle(String c, String s, double w, double h){
super(s,w,h);
color = c;
}

String getColor(){return color;}

void showColor(){
System.out.println(color);
}
}

class Shapes6{
public static void main (String args[]){
ColorTriangle t1 = new ColorTriangle("Blue","Outlined",8.0,12.0);
ColorTriangle t2 = new ColorTriangle("Red","filled",2.0,2.0);

System.out.println("t1");
t1.showStyle();
t1.showDim();
t1.showColor();
System.out.println(t1.area());

System.out.println();

System.out.println("t2");
t2.showStyle();
t2.showDim();
t2.showColor();
System.out.println(t2.area());
}
}

