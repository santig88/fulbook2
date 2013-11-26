package com.cabesoft.fulbook.domain.model.dto;

import java.util.Map;

import com.cabesoft.fulbook.domain.model.helpers.TeamStat;

public class TeamModifiers {
	private Map< TeamStat, Integer> stats;

	public Map<TeamStat, Integer> getStats() {
		return stats;
	}

	public void setStats(Map<TeamStat, Integer> stats) {
		this.stats = stats;
	}
}
