package test;

public class Kullanicilar {
	private String name;
	private int userID;
	public Kullanicilar(String name,int userID) {
		this.name=name;
		this.userID=userID;
	}
	public void getName(String name) {
		this.name=name;
	}
	public String setName() {
		return name;
	}
	public void getUserıd(int userID) {
		this.userID=userID;
	}
	public int setUserıd() {
		return userID;
	}
	@Override
	public String toString() {
		return "user {"+
	            "name: "+name +'\''+
	            "userID: "+userID+'\''+
	            "}";
				
	}

}
