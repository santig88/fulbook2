package com.cabesoft.fulbook.domain.model.dto;

import java.util.Map;

import com.cabesoft.fulbook.domain.model.helpers.PlayerSlot;
import com.cabesoft.fulbook.domain.model.helpers.PlayerStat;



public class ItemDTO {
	
	private String name;
	private PlayerSlot slot;
	private Map<PlayerStat, Integer> stats;
	

	public PlayerSlot getSlot() {
		return slot;
	}

	public void setSlot(PlayerSlot slot) {
		this.slot = slot;
	}

	public Map<PlayerStat, Integer> getStats() {
		return stats;
	}

	public void setStats(Map<PlayerStat, Integer> stats) {
		this.stats = stats;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		

}
