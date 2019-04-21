package code.map;

import java.io.File;

public class Map {
	
	public static Map loadMap(File file){
		//TODO check map validity
		
		Map map = new Map(file);
		//TODO read map header
		
		return map;
	}
	private LoadedMap mapData = null;
	
	
	private int maxPlayers;
	private int minPlayers;
	
	private String mapName;
	private String mapDescription;
	
	File mapFile;
	
	Map(File file){
		this.mapFile = file;
	}
	
	public int getMaxPlayers(){
		return maxPlayers;
	}
	public int getMinPlayers(){
		return minPlayers;
	}
	
	public String getMapName(){
		return mapName;
	}
	public String getMapDescription(){
		return mapDescription;
	}
	
	public boolean isLoaded(){
		return mapData!=null;
	}
	
	private void setDetails(int min, int max, String name, String description){
		this.maxPlayers = max;
		this.minPlayers = min;
		this.mapName = name;
		this.mapDescription = description;
	}
	
	
}
