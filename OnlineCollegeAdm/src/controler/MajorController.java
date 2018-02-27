package controler;

import java.util.HashMap;

import model.Major;


public class MajorController {
	
	private static HashMap<Integer, Major> majorMap = new HashMap<Integer, Major>();
	
	public static void addMap(int key, Major major){	
		majorMap.put(key, major);
	}

	public static HashMap<Integer, Major> getMajorMap() {
		return majorMap;
	}

}
