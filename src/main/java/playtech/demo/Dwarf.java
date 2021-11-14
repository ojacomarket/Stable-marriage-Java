package playtech.demo;

import jdk.jfr.Frequency;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
public class Dwarf implements Comparable<Dwarf>{
    private String name;

    private List<Integer> index;

    @Override
    public int compareTo(Dwarf dwarf) {
        return this.index.get(1) - dwarf.index.get(1);
    }

    public Dwarf(List<Integer> index) {
        this.index = index;
    }

    public Dwarf(String name) {
        this.name = name;
    }
}
