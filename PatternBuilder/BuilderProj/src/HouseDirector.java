public class HouseDirector {
	public static void main(String[] args) {
		HouseBuilder woodHouseBuilder = new WoodHouseBuilder();
		House woodHouse = woodHouseBuilder.addWalls().addWindows().addRoof().build();
		System.out.println(woodHouse);
		
		HouseBuilder brickHouseBuilder = new BrickHouseBuilder();
		House brickHouse = brickHouseBuilder.addWalls().addWindows().addRoof().build();
		System.out.println(brickHouse);
		
		HouseBuilder panelHouseBuilder = new PanelHouseBuilder();
		House panelHouse = panelHouseBuilder.addWalls().addWindows().addRoof().build();
		System.out.println(panelHouse);
	}
}
