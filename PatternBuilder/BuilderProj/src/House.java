import java.util.*;

public class House {
	String name;
	HouseType houseType;
	Roof roof;
	List<Wall> walls;
	List<Window> windows;
	
	public House() {
		this.walls = new ArrayList<Wall>();
		this.windows = new ArrayList<Window>();
	}
	public House setHouseType(HouseType houseType) {
		this.houseType = houseType;
		switch (houseType) {
			case WOOD: this.name = "My wood house"; break;
			case BRICK: this.name = "My brick house"; break;
			case PANEL: this.name = "My holiday panel house"; break;
		}
		return this;
	}
	House addRoof(Roof roof) {
		this.roof = roof;
		return this;
	}
	House addWall(Wall wall) {
		this.walls.add(wall);
		return this;
	}
	House addWindow(Window window) {
		this.windows.add(window);
		return this;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		StringBuilder display = new StringBuilder();
		display.append("---- " + this.name + " ----\n");
		for (Wall wall : walls) {
			display.append("--- " + wall.name + " ---\n");
		}
		for (Window window : windows) {
			display.append("--- " + window.name + " ---\n");
		}
		display.append("--- " + roof.name + " ---\n");
		return display.toString();
	}
}

 
 
