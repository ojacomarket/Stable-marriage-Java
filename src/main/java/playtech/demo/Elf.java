package playtech.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
public class Elf implements Comparable<Elf>{

    private String name;

    private List<Integer> index;

    @Override
    public int compareTo(Elf elf) {
        return index.get(1) - elf.index.get(1);
    }

    public Elf(List<Integer> index) {
        this.index = index;
    }

    public Elf(String name) {
        this.name = name;
    }
}
