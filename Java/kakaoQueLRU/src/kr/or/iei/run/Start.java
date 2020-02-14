package kr.or.iei.run;

import kr.or.iei.lru.Lru;
import kr.or.iei.lru.LruMap;

public class Start {

	public static void main(String[] args) {
		
		Lru lru = new Lru();
		lru.main();
		
		LruMap lruMap = new LruMap();
		lruMap.main();
	}
}
