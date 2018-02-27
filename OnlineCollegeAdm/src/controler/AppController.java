package controler;

import java.util.ArrayList;


import model.Application;


public class AppController {
	private static ArrayList<Application> appList = new ArrayList<Application>();
	
	public static void addApp(Application app) {	
			appList.add(app);
	}

	public static ArrayList<Application> getAppList() {
		return appList;
	}

}
