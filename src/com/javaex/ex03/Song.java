package com.javaex.ex03;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	//생성자
	//메소드와 유사 이름은 클래스명,리턴형 없음
	public Song() {
		//메모리에 올린다.굳이 안적어도 있음
	}
	public Song(String artist, String title,String album,
			String composer, int year, int track) {
		//메모리에 올린다.
		this.title=title;
		this.artist=artist;
		this.album=album;
		this.composer=composer;
		this.year=year;
		this.track=track;
	}

	public void settitle(String title) {
		this.title = title;
	}

	public String gettitle() {
		return title;
	}

	public void setartist(String artist) {
		this.artist = artist;
	}

	public String getartist() {
		return artist;
	}

	public void setalbum(String album) {
		this.album = album;
	}

	public String getalbum() {
		return album;
	}

	public void stecomposer(String composer) {
		this.composer = composer;
	}

	public String getcomposer() {
		return composer;
	}

	public void setyear(int year) {
		this.year = year;
	}

	public int getyear() {
		return year;
	}

	public void settrack(int track) {
		this.track = track;
	}

	public int gettrack() {
		return track;
	}

	public void showinfo() {
		System.out.println(
				artist + "," + title + "(" + album + ", " + year + ", " + track + "번 track, " + composer + "작곡)");
	}

}
