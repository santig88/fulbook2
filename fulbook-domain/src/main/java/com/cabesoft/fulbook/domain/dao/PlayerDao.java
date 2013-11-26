package com.cabesoft.fulbook.domain.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.cabesoft.fulbook.domain.model.dto.PlayerDTO;


public interface PlayerDao  extends PagingAndSortingRepository<PlayerDTO, Long> {
	

	PlayerDTO findByName(String name);

}
