package dslearn;

import java.io.File;

public class Temp {
	
	public static final String m1 ="D:\\Steam\\steamapps\\common\\RimWorld\\Mods\\1346113625\\Textures\\Hair";
	public static final String m2 ="D:\\Steam\\steamapps\\common\\RimWorld\\Mods\\928642073\\Textures\\Hairs";

	public static void main(String[] args) {
//		System.out.println(m1 + "\\" + "123.txt");
		File f = new File(m1);
		a4(f, m1);
		f = new File(m2);
		a4(f, m2);
	}
	
	public static void a4(File f, String abs) {
		for(File ff : f.listFiles()) {
			String ss = ff.getName();
			if( ss.matches(".*back.png$")) {//System.out.println(true);
				ss = ss.replace("back.png", "north.png");
			}
			else if( ss.matches(".*front.png$")){
				ss = ss.replace("front.png", "south.png");
			}
			else if( ss.matches(".*side.png$")) {
				ss = ss.replace("side.png", "east.png");
			}
			ff.renameTo(new File(abs + "\\\\" +ss));
		}
	}
	
	public static void a1() {
		File f = new File("D:\\Steam\\steamapps\\common\\RimWorld\\Mods\\1346113625\\Textures\\Hair");
		String[] s = f.list();
		for(String ss : s) {
			System.out.print(ss + ' ');
			if( ss.matches(".*back.png$")) {//System.out.println(true);
				ss = ss.replace("back.png", "north.png");
			}
			else if( ss.matches(".*front.png$")){
				ss = ss.replace("front.png", "south.png");
			}
			else if( ss.matches(".*side.png$")) {
				ss = ss.replace("side.png", "east.png");
			}
			System.out.println(ss);
		}
	}
	
	public static void a2() {
		File f = new File("D:\\Steam\\steamapps\\common\\RimWorld\\Mods\\1346113625\\Textures\\Hair");
		for(File ff : f.listFiles()) {
			System.out.println(ff.getName());
		}
	}
	
	public static void a3() {
		File f = new File("D:\\Steam\\steamapps\\common\\RimWorld\\Mods\\1346113625\\Textures\\Hair\\allback_back.png");
		f.renameTo(new File("D:\\Steam\\steamapps\\common\\RimWorld\\Mods\\1346113625\\Textures\\Hair\\allback_north.png"));
	}
}
