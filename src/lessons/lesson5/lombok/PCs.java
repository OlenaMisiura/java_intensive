package lessons.lesson5.lombok;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class PCs {
    private int id;
    private String name;

    public boolean equals(PCs pc2){
        boolean result =this.id==pc2.id;
////                &&
////                this.name.equals(pc2.name);
            return  result;
   }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        PCs pCs = (PCs) o;
//        return id == pCs.id &&
//                name.equals(pCs.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name);
//    }
}

