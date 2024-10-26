package com.builder;

public class Mobile {

	private String name;
	private String ram;
	private String rom;
	private String cameraSize;
	private String OS;
	private String price;
	
	
	public Mobile(MobileBuilder mobileBuilder) {
		this.cameraSize=mobileBuilder.cameraSize;
		this.name=mobileBuilder.name;
		this.OS=mobileBuilder.OS;
		this.ram=mobileBuilder.ram;
		this.rom=mobileBuilder.rom;
		this.price=mobileBuilder.price;
	}
	
	
	public static class MobileBuilder{
		
		private String name;
		private String ram;
		private String rom;
		private String cameraSize;
		private String OS;
		private String price;
		
		public MobileBuilder setName(String name) {
			this.name = name;
			return this;
		}
		
		public MobileBuilder setRam(String ram) {
			this.ram = ram;
			return this;
		}
		
		public MobileBuilder setRom(String rom) {
			this.rom = rom;
			return this;
		}
		
		public MobileBuilder setCameraSize(String cameraSize) {
			this.cameraSize = cameraSize;
			return this;
		}
		
		public MobileBuilder setOS(String oS) {
			this.OS = oS;
			return this;
		}
		
		public MobileBuilder setPrice(String price) {
			this.price = price;
			return this;
		}
		
		
		public Mobile build()
		{
			return new Mobile(this);
		}
	}


	@Override
	public String toString() {
		return "Mobile [name=" + name + ", ram=" + ram + ", rom=" + rom + ", cameraSize=" + cameraSize + ", OS=" + OS
				+ ", price=" + price + "]";
	}
	
	
	
	
}
