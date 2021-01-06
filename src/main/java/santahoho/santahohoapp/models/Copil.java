package santahoho.santahohoapp.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Copil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    private String name;
    private String address;
    private String city;
    private String phone;

    @ManyToOne
    @JoinColumn(name="taraid", insertable=false, updatable=false)
    private Tara tara;
    private Integer taraid;

    @OneToMany(mappedBy="copil")
    private List<Cadou> cadou;

}
