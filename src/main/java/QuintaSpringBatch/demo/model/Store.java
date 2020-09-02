package QuintaSpringBatch.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Store {

    @Id
    private Long id;
    private String name;
    private String number;
    private String city;
    private Integer cdBranch;
    private String dsBranch;
    private String flag;


    public Store(Long id, String name, String number, String city, Integer cdBranch, String dsBranch, String flag) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.city = city;
        this.cdBranch = cdBranch;
        this.dsBranch = dsBranch;
        this.flag = flag;

    }

    public Store() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getCdBranch() {
        return cdBranch;
    }

    public void setCdBranch(Integer cdBranch) {
        this.cdBranch = cdBranch;
    }

    public String getDsBranch() {
        return dsBranch;
    }

    public void setDsBranch(String dsBranch) {
        this.dsBranch = dsBranch;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Dados da loja{" +
                "Id=" + id +
                ", nome='" + name + '\'' +
                ", número=" + number +
                ", city='" + city + '\'' +
                ", cdFilial=" + cdBranch + '\'' +
                ", dsFilial=" + dsBranch + '\'' +
                ", bandeira=" + flag + '\'' +
                '}';
    }

}
