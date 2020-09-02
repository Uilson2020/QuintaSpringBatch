package QuintaSpringBatch.demo.batch;

import QuintaSpringBatch.demo.model.Store;
import QuintaSpringBatch.demo.repository.StoreRepositoryImpl;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DBWriter implements ItemWriter<Store> {

    @Autowired
    private StoreRepositoryImpl storeRepository;

    @Override
    public void write(List<? extends Store> stores) throws Exception {

        System.out.println("Dados salvos para Stores: " + stores);
        storeRepository.saveAll(stores);
    }
}
