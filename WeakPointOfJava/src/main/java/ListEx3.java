package ex3;

import java.util.ArrayList;
import java.util.List;

public class ListEx3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("えび");
		list.add("甘えび");
		list.add("伊勢えび");
		list.add("桜えび");
		list.add("赤えび");
		System.out.println("え→ゑに置き換えます");
		for (String str : list) {
			System.out.println(str.replace("え", "ゑ"));
		}
	}
}
