//No, I wug.
//You wugga
//wug.
//! wug.
//Error
public class Chap04Irv {
 public static void main(String[] args) {
	 String day, month;
	 int date, year;
     System.out.println("Exercise 4.2");
	 zool(11," David"," NO.5 Str.");
	 System.out.println();
     System.out.println("Exercise 4.3");
     day="Saturday";
     date=22;
     month="July";
     year=2015;
     printAmerican(day,month,date,year);
     printEuropean(day,month,date,year);
 }
    public static void zool(int a, String p, String S) { 
        System.out.println(a+p+S);
    }
	public static void printAmerican(String day, String month, int date, int year) {
		System.out.println("American format:");
		System.out.println(day + "," + month + " " + date + "," + year);
	}
	
	public static void printEuropean(String day, String month, int date, int year) {
		System.out.println("European format:");
		System.out.println(day + "," + date + " " + month + "," + year);
	}}

