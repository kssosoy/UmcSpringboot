package org.example.umcspringworkbook4.service.StoreService;

import java.util.List;
import java.util.Optional;

import org.example.umcspringworkbook4.domain.Store;

public interface StoreQueryService {
	Optional<Store> findStore(Long id);
	List<Store> findStoresByNameAndScore(String name, Float score);
}