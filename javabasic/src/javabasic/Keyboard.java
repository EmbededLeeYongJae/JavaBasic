package javabasic;

public class Keyboard extends Device {

	private int keyCount; // 키 개수
	private String keyType; // 키보드 종류(기계식, 멤브레인..)

	Keyboard() {

	}

	Keyboard(int keyCount, String keyType) {
		super();
		this.keyCount = keyCount;
		this.keyType = keyType;

	}

	public int getKeyCount() {
		return keyCount;
	}

	public void setKeyCount(int keyCount) {
		this.keyCount = keyCount;
	}

	public String getKeyType() {
		return keyType;
	}

	public void setKeyType(String keyType) {
		this.keyType = keyType;
	}
	
	@Override
	void on() {
		System.out.println("키보드를 켜다");
	}
	@Override
	void off() {
		System.out.println("키보드를 끄다");
	}

}
