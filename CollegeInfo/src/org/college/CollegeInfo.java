package org.college;

public class CollegeInfo {
private void collegeData() {
	
	collegeData("rvs7676","982872");
	collegeData(87898778787l);
	collegeData("nehrunagar,Erode", 638104);
	collegeData(115, 154);
	collegeData(215, 54);
	collegeData(120);
	collegeData(1050l);
	collegeData(500l, 550l);
	collegeData(10, "UG,PG");
	collegeData('2',"boys,girls");
	collegeData(2, 3);
	collegeData('2');
	collegeData(600);
	
	System.out.println("Over all college information");
}
private void collegeData(String name) {

	System.out.println("college name is:"+name );
}
private void collegeData(String collegeID,String collegeCode) {
	
	System.out.println("college ID is:" +collegeID  +" \n "+ "collegecode is: "+ collegeCode );
	
}
private void collegeData(long collegeMOBnumber) {
	System.out.println("collegeMobNumber is:"+collegeMOBnumber);
	
	
}
private void collegeData(String collegeAddress,int pincode) {
	System.out.println("collegeAddress  is:" +collegeAddress  +" \n "+ "pincode is: "+ pincode);

}
private void collegeData(int maleStaff,float femaleStaff) {
	System.out.println("no of maleStaff is:" +maleStaff  +" \n "+ "no of femaleStaff is: "+ femaleStaff);
	
}
private void collegeData(int teachingStaff,int nonteachingstaff) {
	System.out.println("no of teachingStaff is:" +teachingStaff  +" \n "+ "no of femaleStaff is: " +nonteachingstaff);
	
}
private void collegeData(int businfo) {
	System.out.println("total no of buses" +businfo);
	

}
private void collegeData(float studentInfo) {
	System.out.println("total no of students " + studentInfo);
	
}
private void collegeData(float maleStudents,float femaleStudents) {
	System.out.println("no of maleStudents is:" +maleStudents  +" \n "+ "no of femaleStudents is: " +femaleStudents);

}
private void collegeData(int deptInfo,String courseInfo) {
	System.out.println("deptInfo is:" +deptInfo  +" \n "+ "courseInfo is: " +courseInfo);
	
}
private void collegeData(char hostelNo,String hostelName) {
	System.out.println("no of hostel is:" +hostelNo  +" \n "+ "hostelName is: " +hostelName);
	
}

private void collegeData(double playgroundInfo,int gyminfo) {
	System.out.println("no of playgroundInfo is:" +playgroundInfo  +" \n "+ "gyminfo is: " +gyminfo);
		
}
private void collegeData(char cafetariaInfo) {
	System.out.println("cafetaria avalable in no:" +cafetariaInfo );
	
}
private void collegeData(double areaofCollege) {
	System.out.println("acre of collge:" +areaofCollege);
	
}
public static void main(String[] args) {
	CollegeInfo ci = new CollegeInfo();
	ci.collegeData();

	ci.collegeData("rvs college of enginnering");
}
}
