package com.dev.collections;

import java.util.HashMap;

public abstract class  Product1 implements ProductInt() {
	HashMap<String,ProductInt>hm = new HashMap<>();
	
	public Product1 putData(String,ProductInt) {
		if(key!=null && product!=null) {
			Product1 data =hm.put(key,product);
			return data;
		}
		return null;
	}
	public ProductInt getData(String,ProductInt P1) {
		ProductInt data = hm.get(key);
	
	
	return null;
}


	