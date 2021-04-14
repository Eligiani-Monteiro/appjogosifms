package com.ifms.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ifms.dto.ModalidadeDTO;
import com.ifms.entities.Modalidade;
import com.ifms.repositories.ModalidadeRepository;

@Service
public class ModalidadeService {


	@Autowired
	private ModalidadeRepository repostory;
		
	
	@Transactional(readOnly = true)
	public  List<ModalidadeDTO> findAll(){
		 List<Modalidade>list=repostory.findAll();
		
		return list.stream().map(modalidade -> new ModalidadeDTO(modalidade)).collect(Collectors.toList());
		
	}


	public ModalidadeDTO finById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}


	

}