package com.epam.loggers1;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.epam.loggers1.App;

public class amazoninterest {
	 public static void main( String[] args )
	    {
	    	 final Logger logger = LogManager.getLogger(amazoninterest.class);
	    	 App a=new App();
	 		Scanner sc = new Scanner(System.in);
	 		logger.info("Enter the amount : ");
	 		double p=sc.nextDouble();
	 		logger.info("Enter the number of years : ");
	 		double t=sc.nextDouble();
	 		logger.info("Enter the rate of interest : ");
	 		double r=sc.nextDouble();
	 		double res1=a.simple(p, r, t);
	 		double res2=a.compound(p, r, t);
	 		logger.info("Simple Interest :"+res1);
	 		logger.info("Compound Interest :"+res2);
	 		
	 		logger.info("-----------------------------------------");
	 		logger.info("1.Standard material");
	 		logger.info("2.Above standard material");
	 		logger.info("3.High standard material");
	 		logger.info("4.Automated home");
	 		logger.info("Enter your choice : ");
	 		int choice = sc.nextInt();
	 		a.construction(choice);
	 		sc.close();
	 		
	 	}
	    

}
interface  Total{
	void standard();
	void aboveStandard();
	void highStandard();
	void automatedHome();
	void defaults();
}
class Standard {
	final Logger logger = LogManager.getLogger(Standard.class);
	Scanner sc = new Scanner(System.in);
	void standard() {
		logger.info("Enter the area of land in sqfeet");
		double bal = sc.nextDouble();
		double total_cost = bal*1200;
		logger.info("The total cost of construction = "+total_cost);
		sc.close();
	}

	void aboveStandard() {
		logger.info("Enter the area of land in sqfeet");
		double bal = sc.nextDouble();
		double total_cost = bal*1500;
		logger.info("The total cost of construction = "+total_cost);
		sc.close();
	}

	void highStandard() {
		logger.info("Enter the area of land in sqfeet");
		double bal = sc.nextDouble();
		double total_cost = bal*1800;
		logger.info("The total cost of construction = "+total_cost);
		sc.close();
	}
	void automatedHome() {
		logger.info("Enter the area of land in sqfeet");
		double bal = sc.nextDouble();
		double total_cost = bal*2500;
		logger.info("The total cost of construction = "+total_cost);
		sc.close();
	}
	void defaults() {
		logger.error("Enter a valid choice ");
	}
}