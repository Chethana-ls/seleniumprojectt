package day34;

import java.awt.List;
import java.util.ArrayList;

public class LISTPRATICE {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("chetan");
		list.add("rupam");
		System.out.println(list.get(0));
		System.out.println(list.size());
		list.remove(1);
		list.remove(0);
		System.out.println(list.size());
		//ysoSystem.out.println(list.get(1));

	}

}
