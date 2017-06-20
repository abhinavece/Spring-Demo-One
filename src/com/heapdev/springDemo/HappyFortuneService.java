package com.heapdev.springDemo;
import java.util.Random;

public class HappyFortuneService implements FortuneService {
	String[] fortunes = {
						"Best of luck, score a century today.", 
						"Wish you all the best for your match today.",
						"God bless you."
						};
	Random rand = new Random();
	
	@Override
	public String getFortune() {
		return fortunes[rand.nextInt(2)];
	}

}
