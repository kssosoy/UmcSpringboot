package org.example.umcspringworkbook4.repository.StoreRepository;

import org.example.umcspringworkbook4.domain.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Long>, StoreRepositoryCustom {
}
