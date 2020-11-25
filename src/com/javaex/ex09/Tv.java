package com.javaex.ex09;

public class Tv {
	//필드
	private int channel;
	private int volume;
	private boolean power;
	//생성자
	public Tv(int channel, int volume, boolean power) {
		this.channel=channel;
		this.volume=volume;
		
	}
	//메소드 get/set
	public void setchannel(int channel) {
		if (channel>255) {
			this.channel=255;
		}else if (channel<=0) {
			this.channel=1;
		}
		else if(channel<=255) {
			this.channel=channel;
		}	
	}
	public void setchannel(boolean a) {
		if (a==true) {
				if (channel==255) {
					this.channel=255;
				}else {
					this.channel+=1;
				}
			}else if (a==false) {
				if (channel<=1) {
					this.channel=1;
				}else {
					this.channel-=1;
				}
			}
		}
	public void setvolume(int volume) {
		if (volume>100) {
			this.volume=100;
		}else if (volume<=100) {
			this.volume=volume;
			}
		}
	public void setvolume(boolean b) {
		if (b==true) {
			if (volume==100) {
				this.volume=100;
			}else if (volume<=0) {
				this.volume=1;
			}else {
				this.volume+=1;
			}
		}else if (b==false) {
			if (volume==255) {
				this.volume=255;
			}else if (volume<=0) {
				this.volume=1;
			}else {
				this.volume-=1;
			}
		}
	}
	public void setpower(boolean power) {
		this.power=power;
	}	
	public void status() {
		System.out.println("채널:"+channel+" 볼륨:"+volume+" 전원:"+power);

}
}
