package QuintaSpringBatch.demo.batch;

import QuintaSpringBatch.demo.model.Store;
import org.springframework.stereotype.Component;
import org.springframework.batch.item.ItemProcessor;
import java.util.HashMap;
import java.util.Map;

@Component
public class Processor implements ItemProcessor<Store, Store> {

    private static final Map<String, String> NAME_TO_ADDRESS = new HashMap<>();
    private static final Map<Integer, String> NUMBER_TO_FULLBRANCH = new HashMap<>();

    public Processor() {
        NAME_TO_ADDRESS.put("Tutoia", "Rua Tutoia, n1045 - Paraíso SP");
        NAME_TO_ADDRESS.put("Joaquim Floriano", "Rua Joaquim Floriano, n825 - Itaim Bibi SP");
        NAME_TO_ADDRESS.put("Andradas", "R. dos Andradas, 1195 - Porto Alegre RS");
        NAME_TO_ADDRESS.put("Nossa Sra. das Gracas", "Av. Minas Gerais, 1824 - Nossa Sra. das Gracas/ Gov Valadares MG");
        NAME_TO_ADDRESS.put("Tancredo Neves","Av. Tancredo Neves, 148 - Caminho das Arvores MG");

        NUMBER_TO_FULLBRANCH.put(81,"DROGA RAIA - Rua Tutóia, 1045 Paraiso - SP, CEP 04007000 / CNPJ 61585865062009");
        NUMBER_TO_FULLBRANCH.put(171,"DROGA RAIA - Rua Joaquim Floriano, 212 Itaim Bibi - SP, CEP 04534001 / CNPJ 61585865060804");
    }

    @Override
    public Store process(Store store) throws Exception {
        String nameBranch = store.getName();
        String name = NAME_TO_ADDRESS.get(nameBranch);
        store.setName(name);
        System.out.println(String.format("Convertido de [%s] para [%s]", nameBranch, name));

        Integer branch = store.getCdBranch();
        String fullBranch = NUMBER_TO_FULLBRANCH.get(branch);
        store.setDsBranch(fullBranch);
        System.out.println(String.format("Convertido de [%s] para [%s]", branch, fullBranch));


        return store;
    }
}
