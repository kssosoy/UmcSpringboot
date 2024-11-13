package org.example.umcspringworkbook4.repository.StoreRepository;

import java.util.List;

import org.example.umcspringworkbook4.domain.Store;

public interface StoreRepositoryCustom {
	List<Store> dynamicQueryWithBooleanBuilder(String name, Float score);
}