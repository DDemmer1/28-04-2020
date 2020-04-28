package javaII;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;

import java.util.Map.Entry;

public class Application {

	public static void main(String[] args) {
		
		Map <String, Item> itemMap = new HashMap<>(); 
		
		Item item1 = new Item("Topf", 5, 19.80f);
		Item item2 = new Item("Schüssel", 6, 19.99f);
		Item item3 = new Item("Nudeln", 435, 0.99f);
		Item item4 = new Item("Reis", 99, 1.99f);
		
		
		itemMap.put("5fdg56gdf", item1);
		itemMap.put("dsg890dfj", item2);
		itemMap.put("dsg8dssdg", item3);
		itemMap.put("dfg8dfg9k", item4);
		
		for (Entry<String, Item> entry : itemMap.entrySet()) {
			Item currentItem = entry.getValue();
			String currentId = entry.getKey();
			System.out.println(currentId + "   -   " + currentItem.getPrice() +"€");
		}
		
//		int i = item1.compareTo(item2);
//		System.out.println(i);
		
		List<Item> itemList = new ArrayList<>(itemMap.values());
		
		Collections.sort(itemList);
		
		for (Item item : itemList) {
			System.out.println(item.getPrice());
		}
		
	}

}
