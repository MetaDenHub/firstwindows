package tenTwo;

import tenOne.Grut;
/*
 * 
 *  inner classes main in tenThree
 *  
 * */
public class EstLiGrut {
	protected class DaEstGrut implements Grut {
		@Override
		public void grut() {
			System.out.println("ya est Grut");
		}
		DaEstGrut getGrut() {
			return new DaEstGrut();
		}
	}
	public Grut grut1() {
		return new DaEstGrut();
	}
	
}
