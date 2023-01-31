import java.util.ArrayList;
import java.util.List;

public abstract class HouseBuilder {
	String builderName;
	HouseType houseType;
	House house = new House();
	
	public void setHouseType(HouseType houseType) {
		this.houseType = houseType;
		house.setHouseType(houseType);
	}
	public abstract HouseBuilder addWalls();
	public abstract HouseBuilder addRoof();
	public abstract HouseBuilder addWindows();

	public House build() {
		System.out.println("Build the house!");
		return house;
	}
}