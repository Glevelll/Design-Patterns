public class PanelHouseBuilder extends HouseBuilder {
	String windowMaterial = "Plastic glass";
	String wallMaterial = "Concrete";
	String roofMaterial = "Shingles";
	public PanelHouseBuilder() {
		this.builderName = "Panel House Builder";
		setHouseType(HouseType.PANEL);
	}
	public HouseBuilder addWalls() {
		System.out.println("Wall made out of " + wallMaterial);
		house.addWall(new Wall(wallMaterial));
		return this;
	}
	public HouseBuilder addWindows() {
		System.out.println("Window made out of " + windowMaterial);
			house.addWindow(new Window(windowMaterial));
		return this;
	}
	public HouseBuilder addRoof() {
		System.out.println("Roof made out of " + roofMaterial);
		house.addRoof(new Roof(roofMaterial));
		return this;
	}
	public House build() {
		System.out.println("Create everything together");
		return house;
	}
}