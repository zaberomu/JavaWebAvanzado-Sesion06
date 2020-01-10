package com.tecsup.gestion;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class GestorSpittle implements SpittleRepository {

	@Override
	public List<Spittle> findSpittles(Long max, int count) {
		List<Spittle> spittles = new ArrayList<Spittle>();
		for (int i=0;i<count;i++) {
			spittles.add(new Spittle("Spittle "+i,new Date()));
		}
	return spittles;
	}

}
