import java.util.*;
public class thurunu {
 static void data01(){
 Scanner input2 = new Scanner (System.in);
 System.out.print("Enter the length in Cm:"); 
 int length = input2.nextInt();
 Scanner input3 = new Scanner (System.in);
 System.out.print("Enter the width Cm:");
 int width = input3.nextInt();
 System.out.print("Area ="+length*width +"Cm\u00B2");
 }
 static void data02(){
 Scanner input2 = new Scanner (System.in);
 System.out.print("Enter the length in Cm's:"); 
 int length = input2.nextInt();
 Scanner input3 = new Scanner (System.in);
 System.out.print("Enter the width in Cm's:");
 int width = input3.nextInt();
 Scanner input4 = new Scanner (System.in);
 System.out.print("Enter the height in Cm's :");
 int height = input4.nextInt();
 System.out.print("Area ="+length*width*6 +"Cm\u00B2"+'\n');
 System.out.print("Volume ="+length*width*height +"Cm\u00B3");
 }
 static void data03(){
 Scanner input2 = new Scanner (System.in);
 System.out.print("Enter the length in Cm's:"); 
 int length = input2.nextInt();
 Scanner input3 = new Scanner (System.in);
 System.out.print("Enter the width in Cm's:");
 int width = input3.nextInt();
 Scanner input4 = new Scanner (System.in);
 System.out.print("Enter the height in Cm's :");
 int height = input4.nextInt();
 System.out.print("Area ="+((2*length*width)+(2*width*height)+(2*height*length)) 
+"Cm\u00B2"+'\n');
 System.out.print("Volume ="+length*width*height +"Cm\u00B3");
 
 }
 static void data04(){
 Scanner input2 = new Scanner (System.in);
 System.out.print("Enter the radius in Cm's:"); 
 int radius = input2.nextInt();
 Scanner input3 = new Scanner (System.in);
 System.out.print("Enter the height in Cm's :");
 int height = input3.nextInt();
 System.out.print("Area ="+(2*Math.PI*radius*(radius+height))+"Cm\u00B2"+'\n');
 System.out.print("Volume ="+Math.PI*radius*radius*height +"Cm\u00B3");
 }
 static void data05(){
 Scanner input2 = new Scanner (System.in);
 System.out.print("Enter the radius in Cm's:");
 int radius = input2.nextInt(); 
 System.out.print("Area ="+(4*Math.PI*Math.pow(radius,2))+"Cm\u00B2"+'\n');
 System.out.print("Volume ="+((4*Math.PI*Math.pow(radius,3))/3) +"Cm\u00B3");
 }
 public static void main(String args[])
 {
 Scanner input1 = new Scanner (System.in);
 System.out.print("Enter the shape in simple letters :\n(rectangle\nsquare\ncube\ncuboid\ncylinder\nsphere) " );
 String design = input1.next();
 
 if (design.equals("rectangle")) {
 data01();
 }
 else if (design.equals("square")) {
 data01();
 }
 else if (design.equals("cube")) {
 data02();
 }
 else if (design.equals("cuboid")) {
 data03();
 }
 else if (design.equals("cylinder")) {
 data04();
 }
 else if (design.equals("sphere")) {
 data05();
 
 }
 }
}