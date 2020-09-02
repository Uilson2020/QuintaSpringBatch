package QuintaSpringBatch.demo.repository;

import QuintaSpringBatch.demo.model.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepositoryImpl extends StoreRepository, JpaRepository<Store, Long> {
}
