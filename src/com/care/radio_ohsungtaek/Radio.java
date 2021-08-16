package com.care.radio_ohsungtaek;

public class Radio {
	private int channel = 10;
	private int volume = 10;

	public void channelUp() {
		channel += 1;
	}
	public void channelDown() {
		channel -= 1;
	}
	public void volumeUp() {
		volume += 1;
	}
	public void volumeDown() {
		volume -= 1;
	}
	public void channelPrint() {
		System.out.println("현재 채널 : "+channel);
	}
	public void volumePrint() {
		System.out.println("현재 볼륨 : "+volume);
	}
	
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume=volume;
	}
	
	
}
