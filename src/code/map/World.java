/**
 * 
 */
package code.map;

import java.util.List;

import com.google.common.collect.Lists;
/**
 * @author StormCloud
 *
 */
public class World {
	private static List<String> WorldList = Lists.<String>newArrayList();
	public final String Name;
	public final int Size;
	/**
	 * 
	 * @param NameIn - Name of the World
	 * @param SizeIn - the width and height of the World
	 * @throws Exception if the Name is already taken.
	 */
	public World(String NameIn, int SizeIn) throws Exception {
		if(WorldList.contains(NameIn) ){
			throw new Exception("World by this name already exsists!");
		}
		this.Name = NameIn;
		this.Size = SizeIn;
		WorldList.add(this.Name);
	}
	
	public static List<String> getWorldList(){
		
		//TODO re-add this if "back wash" becomes an issue.
//		List<String> list = Lists.<String>newArrayList(); list.addAll(WorldList);
//		return (list);
		return (WorldList);
	}
}
