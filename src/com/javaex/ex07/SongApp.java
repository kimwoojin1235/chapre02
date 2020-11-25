package com.javaex.ex07;

public class SongApp {

	public static void main(String[] args) {
		Song iu1=new Song("아이유","좋은날","Real","이민수",2010,3);
		System.out.println(iu1.toString());
		System.out.println("==================================");
		Song iu=new Song();
		
		iu.setTitle("좋은날");
		iu.setAlbum("Real");
		iu.setArtist("아이유");
		iu.setComposer("이민수");
		iu.setYear(2010);
		iu.setTrack(3);
		iu.showinfo();
		//System.out.println(iu.toString());
		
		System.out.println("==================================");
		
		Song big=new Song("BIGBANG","거짓말","Always","G-DRAGON",2007,4);
		big.showinfo();
		//System.out.println(big.toString());
		System.out.println("=================================");
		
		Song buscu= new Song("버스커버스커","벛꽃엔딩");
		
		buscu.setAlbum("버스커버스커1집");
		buscu.setComposer("장범준");
		buscu.setYear(2012);
		buscu.setTrack(4);
		buscu.showinfo();
		//System.out.println(buscu.toString());
		System.out.println("================================");
		
		Song buscu1= new Song("벚꾳엔딩",3);
		buscu1.setArtist("버스커버스커");
		buscu1.setAlbum("버스커버스커1집");
		buscu1.setComposer("장범준");
		buscu1.setYear(2012);
		buscu1.showinfo();
	}

}
