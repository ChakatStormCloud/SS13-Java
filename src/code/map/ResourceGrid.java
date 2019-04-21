package code.map;

import java.util.ArrayList;

public abstract class ResourceGrid {
	
	public static ArrayList<ArrayList<ResourceGrid>> gridRegistry = new ArrayList<ArrayList<ResourceGrid>>();
	public int id;
	public abstract String getName();
	
	public ResourceGrid() {
		
	}
	
	public void joinGrids(ResourceGrid... toJoin) {
		
	}
	
	
}
