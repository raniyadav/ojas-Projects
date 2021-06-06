package com.app.inheritan;

public class DayScholar extends Student {
double transportFee=2000;
DayScholar(){
	
}
DayScholar(int studentId,String sName,double examFee,double transportFee){
	super(studentId,sName,examFee);
	this.transportFee=transportFee;
	
}
//double payFee(int amount){
//	System.out.println(displayDetais());
//	return (super-payfee(amount)payfee(amount)+transportFee)-amount;
//}
String displayDetails(){
	return "DayScholor[transportFee"+super.displayDetais()+"]";
	
}
public String toString() {
	return "DayScholar [transportFee=" + transportFee + "Student [studentId=" + studentId + ", sName=" + getsName()
				+ ", examFee=" + examFee + "]";
}

}
