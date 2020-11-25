package com.javaex.ex03;

public class SongApp {

	public static void main(String[] args) {
		Song iu = new Song("아이유","좋은날","Real","이민수",3,2010);
		Song Bigbang = new Song("BIGBANG","거짓말","Always","G-DRAGON",2007,2);
		Song buscu = new Song("버스커버스커","벗꽃엔딩","버스커버스커1집","장범준",4,2012);

		/*
		iu.setartist("아이유");
		iu.settitle("좋은날");
		iu.setalbum("Real");
		iu.settrack(3);
		iu.setyear(2010);
		iu.stecomposer("이민수");
		iu.showinfo();

		Bigbang.setartist("BIGBANG");
		Bigbang.settitle("거짓말");
		Bigbang.setalbum("Always");
		Bigbang.settrack(2);
		Bigbang.setyear(2007);
		Bigbang.stecomposer("G-DRAGON");
		Bigbang.showinfo();

		buscu.setartist("버스커버스커");
		buscu.settitle("벗꽃엔딩");
		buscu.setalbum("버스커버스커1집");
		buscu.settrack(4);
		buscu.setyear(2012);
		buscu.stecomposer("장범준");
		buscu.showinfo();
		*/
		iu.showinfo();
		Bigbang.showinfo();
		buscu.showinfo();
	}

}
