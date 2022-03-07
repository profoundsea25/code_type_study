package study.jpaspringboot1.domain.item;

import lombok.Getter;
import lombok.Setter;
import study.jpaspringboot1.domain.Category;
import study.jpaspringboot1.exception.NotEnoughStockException;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "dtype")
@Getter @Setter
public class Item {

    @Id @GeneratedValue
    @Column(name = "item_id")
    private Long id;

    private String name;
    private int price;
    private int stockQuality;

    @ManyToMany(mappedBy = "items")
    private List<Category> categories = new ArrayList<>();

    // 비즈니스 로직
    public void addStock(int quantity) {
        this.stockQuality += quantity;
    }


    public void removeStock(int quantity) {
        int restStock = this.stockQuality - quantity;
        if (restStock < 0) {
            throw new NotEnoughStockException("need more stock");
        }
        this.stockQuality = restStock;
    }
}
