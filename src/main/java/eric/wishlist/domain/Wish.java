package eric.wishlist.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Wish extends BaseEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String url;

    @Column(columnDefinition = "TEXT")
    private String image;

    @Column(length = 510, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(precision = 2)
    private Double price;

    private String symbol;

    /*
        나중에 구현:
        private Category category;
        private Domain domain;
        private List<Tag> tags;
     */

    @Builder
    public Wish(String url, String image, String title, String description, Double price, String symbol) {
        this.url = url;
        this.image = image;
        this.title = title;
        this.description = description;
        this.price = price;
        this.symbol = symbol;
    }
}
