package com.javaex.ex07;

public class Song {
	//필드6개
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	//생성자0
	public Song() {
	}
	//생성자6
	public Song( String artist, String title, 
			String album, String composer, int year, int track) {
		this(title,track);//다른생성자 호출(사용한다.)
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		System.out.println("생성자(6)");
	}
	//생성자2(타이틀,아티스트)
	public Song(String artist,String title) {
		this.title = title;
		this.artist = artist;
	}
	//생성자2(타이틀, 작곡가)확인용
	/*public Song(String title, String composer) {
		this.title = title;
		this.composer = composer;
	}*/
	//생성자2(타이틀, 트랙번호)확인
	public Song(String title, int track) {
		this.title = title;
		if (track <5) {
			this.track = 0;
		}else {
			this.track = track;
		}
		System.out.println("생성자(2)");
	}
	//get/set
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	
	//일반메소드 showinfo
	public void showinfo() {
		System.out.println(artist + "," + title + "(" + album + ", " + year + ", " 
	+ track + "번 track, " + composer + "작곡)");
	}
	//일반 메소드 tostring
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}
	
}
