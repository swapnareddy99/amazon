package com.epam.loggers1;
public class App 
{
	double s,a,c;
	double simple(double p,double r ,double t) {
		 return a=p*(1+r*t);
	}
	double compound(double p,double r,double t) {
		 s=(p*r*t)/100;
		return c=p*Math.pow(1.0+r/100.0,t);
	}
	int construction(int choice) {
		Standard s=new Standard();
		switch (choice) {
		case 1:  s.standard();
			break;
		case 2: s.aboveStandard();
			break;
		case 3: s.highStandard();
			break;
		case 4: s.automatedHome();
			break;
		default: s.defaults();
		}
		return 0;
	}
}