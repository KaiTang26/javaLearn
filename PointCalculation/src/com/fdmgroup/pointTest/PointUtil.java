package com.fdmgroup.pointTest;

public class PointUtil {

	public double distance(points point1, points point2) {
		// TODO Auto-generated method stub
		double sqrtAns = point1.getX() *point2.getX() +point1.getY() *point2.getY();
		double ans = Math.sqrt(sqrtAns);
		return ans;
	}

}
