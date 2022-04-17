package org.computerinformation;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("size : ram 8gb,harddisk : 500gb,");

	}
public static void main(String[] args) {
	Desktop dk = new Desktop();
	dk.computerModel();
	dk.desktopSize();
}
}
