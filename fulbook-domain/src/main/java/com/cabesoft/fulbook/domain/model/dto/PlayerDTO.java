package com.cabesoft.fulbook.domain.model.dto;

import java.util.Map;
import java.util.Set;

import org.springframework.data.annotation.Id;

import com.cabesoft.fulbook.domain.model.helpers.PlayerSlot;
import com.cabesoft.fulbook.domain.model.helpers.PlayerStat;


public class PlayerDTO {
	@Id
	private String id;
	private String name;
	private Map<PlayerStat, Integer> stats;
	private Map<PlayerSlot, ItemDTO> items;
	private Set<ItemDTO > inventory;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<PlayerStat, Integer> getStats() {
		return stats;
	}
	public void setStats(Map<PlayerStat, Integer> stats) {
		this.stats = stats;
	}
	public Map<PlayerSlot, ItemDTO> getItems() {
		return items;
	}
	public void setItems(Map<PlayerSlot, ItemDTO> items) {
		this.items = items;
	}
	public Set<ItemDTO> getInventory() {
		return inventory;
	}
	public void setInventory(Set<ItemDTO> inventory) {
		this.inventory = inventory;
	}

	
	

}
	