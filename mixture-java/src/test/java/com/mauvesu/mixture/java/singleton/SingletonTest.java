package com.mauvesu.mixture.java.singleton;

import static org.junit.Assert.*;
import org.junit.Test;

import com.mauvesu.mixture.java.singleton.HungrySingleton;
import com.mauvesu.mixture.java.singleton.SyncInnerLazySingleton;

public class SingletonTest {
	
	@Test
	public void testHungrySingleton() {
		HungrySingleton singleton = HungrySingleton.getInstance();
		assertEquals(singleton, HungrySingleton.getInstance());
		singleton.setName("test");
		assertEquals("test", HungrySingleton.getInstance().getName());
	}
	
	@Test
	public void testInnerSyncSingleton() {
		SyncInnerLazySingleton singleton = SyncInnerLazySingleton.getInstance();
		assertEquals(singleton, SyncInnerLazySingleton.getInstance());
		singleton.setName("test");
		assertEquals("test", SyncInnerLazySingleton.getInstance().getName());
	}
	
	//TODO ADD TEST FOR SYNCHRONIZATION
}
