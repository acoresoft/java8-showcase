package com.acoreful.java8.convert;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TypeTest {
	@Test
	public void testInt() throws Exception {
		Object obj="";
		Assert.assertNotNull(obj);
		convertIntByOld(Integer.valueOf(100));
		String str=String.valueOf(100);
		convertIntByOld(str);
		System.out.println(str.getClass());
		Class type=str.getClass();
		
	}
	
	private void convertIntByOld(Object o){
		Object obj=o;//may be an integer
		if(obj instanceof Integer){
			Integer objAsInt=(Integer)obj;
			//do something with 'objAsInt'
		}
		
	}
	private void convertIntByOld2(Object o){
		Object obj=o;//may be an integer
		if(Integer.class.isInstance(obj)){
			Integer objAsInt=Integer.class.cast(obj);
			//do something with 'objAsInt'
		}
	}
	private <T> T convertObj(Class<T> type,T o){
		Object obj=o;//may be an integer
		if(type.isInstance(o)){
			T objAsType=type.cast(obj);
			//do something with 'objAsInt'
			return objAsType;
		}
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
