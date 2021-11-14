package playtech.demo.utils;

import playtech.demo.Dwarf;

import java.util.*;
import java.util.stream.Collectors;

public abstract class Utils {
    public static List<Integer> sort_desc_list (List<Integer> array) {
        List<Integer> inversed = new ArrayList<>();
        Collections.sort(array);
        for (int i = array.size() - 1; i >= 0; i--) {
            inversed.add(array.get(i));
        }
        return inversed;
    }

    public static Map<String, List<String>> getPreferences (List<String> heroesThatLove, List<String> heroesToBeLoved, List<Integer> heroesLoveLevel) {
        Set<String> uniqueHeroes = new TreeSet<>(heroesThatLove);
        List<List<Dwarf>> couplesList = new ArrayList<>();
        for (int i = 0; i < uniqueHeroes.size(); i++) {
            List<Dwarf> check = new ArrayList<>();
            for (int j = 0; j < heroesThatLove.size(); j++) {
                if (uniqueHeroes.toArray()[i].equals(heroesThatLove.get(j))) {
                    check.add(new Dwarf(List.of(j, heroesLoveLevel.get(j))));
                }
            }
            Collections.sort(check);
            couplesList.add(check);
        }
        Map<String, List<String>> preferencesOfHeroes = new HashMap<>();
        for (int i = 0; i < couplesList.size(); i++) {
            preferencesOfHeroes.put((String) uniqueHeroes.toArray()[i], couplesList.get(i).stream().map(x -> heroesToBeLoved.get(x.getIndex().get(0))).collect(Collectors.toList()));
        }
        return preferencesOfHeroes;
    }
}
