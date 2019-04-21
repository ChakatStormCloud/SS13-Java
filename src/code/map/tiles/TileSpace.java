package code.map.tiles;

import code.entities.Item;
import code.main.ConfigHandler;

import java.util.ArrayList;

public class TileSpace {
	private TileItem[] tilestack;
	private ArrayList<Item> itemsInSpace;
	
	public TileSpace() {
		this.tilestack = new TileItem[ConfigHandler.TILESTACKHEIGHT];
		this.itemsInSpace = new ArrayList<Item>();
	}

	public ArrayList<Item> getItemsInSpace() {
		return itemsInSpace;
	}

	public void addItemtoSpace(Item newItem){
		itemsInSpace.add(newItem);
	}
	
	public TileItem getTileAtLayer(int layer){
		return tilestack[layer];
	}
}
