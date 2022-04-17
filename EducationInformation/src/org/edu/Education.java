package org.edu;

public class Education extends Medicine{
	public void ug() {
System.out.println("UG course duration : 3 year");

	}
	public void pg() {
		System.out.println("PG course duration : 2 year");

	}
	public static void main(String[] args) {
		Education ed = new Education();
		ed.bsc();
		ed.bEd();
		ed.bBA();
		ed.bE();
		ed.bTech();
		ed.physiyo();
		ed.dental();
		ed.mbbs();
		ed.ug();
		ed.pg();
	}

}
