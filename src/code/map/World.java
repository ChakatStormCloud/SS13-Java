/**
 * 
 */
package code.map;

import code.map.tiles.TileSpace;

import java.util.ArrayList;
import java.util.List;

/**
 * @author StormCloud
 *
 */
public class World {

	//===========Static=================//
	private static List<String> WorldList = new ArrayList<String>();

	public static List<String> getWorldList(){

		//TODO re-add this if "back wash" becomes an issue.
//		List<String> list = Lists.<String>newArrayList(); list.addAll(WorldList);
//		return (list);
		return (WorldList);
	}


	//==============Instance=============//
	public final String name;
	public final int size;

	private TileSpace[][] grid;

	/**
	 * 
	 * @param nameIn - Name of the World
	 * @param sizeIn - the width and height of the World
	 * @throws Exception if the Name is already taken.
	 */
	public World(String nameIn, int sizeIn) throws Exception {
		if(WorldList.contains(nameIn) ){
			throw new Exception("World by this name already exists!");
		}
		this.name = nameIn;
		this.size = sizeIn;
		WorldList.add(this.name);

		grid = new TileSpace[size][size];

		for(TileSpace[] row:grid){
			for(TileSpace tile:row){
				tile = new TileSpace();
			}
		}

	}


}
