package org.example.umcspringworkbook4.service.StoreService;

import java.util.List;
import java.util.Optional;

import org.example.umcspringworkbook4.domain.Store;
import org.example.umcspringworkbook4.repository.StoreRepository.StoreRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class StoreQueryServiceImpl implements StoreQueryService{

	private final StoreRepository storeRepository;

	@Override
	public Optional<Store> findStore(Long id) {
		return storeRepository.findById(id);
	}

	@Override
	public List<Store> findStoresByNameAndScore(String name, Float score) {
		List<Store> filteredStores = storeRepository.dynamicQueryWithBooleanBuilder(name, score);

		filteredStores.forEach(store -> System.out.println("Store: " + store));

		return filteredStores;
	}
}