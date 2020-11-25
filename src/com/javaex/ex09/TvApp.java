package com.javaex.ex09;

public class TvApp {

	public static void main(String[] args) {
		Tv tv=new Tv(7,20,false);
		tv.status();
		tv.setpower(true);
		tv.setvolume(120);
		tv.status();
		
		tv.setvolume(false);
		tv.status();
		
		tv.setchannel(0);
		tv.status();
		
		tv.setchannel(true);
		tv.setchannel(true);
		tv.setchannel(false);
		tv.status();
		
		tv.setpower(false);
		tv.status();
	}

}
