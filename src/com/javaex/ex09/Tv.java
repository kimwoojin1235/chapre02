package com.javaex.ex09;

public class Tv {
	// 필드
	private int channel;
	private int volume;
	private boolean power;

	// 생성자
	public Tv() {}
	
	public Tv(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;

	}

	// 메소드 get/set
	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean getPower() {
		return power;
	}

	public void setchannel(int channel) {
		if (this.power == true) {
			if (channel > 255) {
				this.channel = 255;
			} else if (channel <= 0) {
				this.channel = 1;
			} else if (channel <= 255) {
				this.channel = channel;
			}
		} else {
			status();
		}
	}

	public void setchannel(boolean a) {
		if (this.power == true) {
			if (a == true) {
				if (channel == 255) {
					this.channel = 255;
				} else {
					this.channel += 1;
				}
			} else if (a == false) {
				if (channel <= 1) {
					this.channel = 1;
				} else {
					this.channel -= 1;
				}
			}
		} else {
			status();
		}
	}

	public void setvolume(int volume) {
		if (this.power == true) {
			if (volume > 100) {
				this.volume = 100;
			} else if (volume <= 100) {
				this.volume = volume;
			}
		} else {
			status();
		}
	}

	public void setvolume(boolean b) {
		if (this.power == true) {
			if (b == true) {
				if (volume == 100) {
					this.volume = 100;

				} else {
					this.volume += 1;
				}
			} else if (b == false) {
				if (volume <= 0) {
					this.volume = 1;
				} else {
					this.volume -= 1;
				}
			}
		} else {
			status();
		}
	}

	public void setpower(boolean power) {
		if (power == true) {
			this.power = true;
		} else {
			this.power = false;
		}
	}

	public void status() {
		if (this.power == true) {
			System.out.println("채널:" + channel + " 볼륨:" + volume + " 전원:" + power);
		} else {
			System.out.println("채널:" + channel + " 볼륨:" + volume + " 전원:" + power);
		}
		

	}
	@Override
	public String toString() {
		return "Tv [channel=" + channel + ", volume=" + volume + ", power=" + power + "]";
	}
}
