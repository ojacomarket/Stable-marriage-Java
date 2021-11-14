package playtech.demo;

import playtech.demo.utils.Utils;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByKey;
import static playtech.demo.Validation.*;

public class ProjectApplication {

    public static void main(String[] args) {

        List<String> res = Validation.getCharacters("Elves");
        List<Elf> listOfElves = new ArrayList<>();
        for (String name : res
        ) {
            listOfElves.add(new Elf(name));
        }

        List<String> res2 = getCharacters("Dwarves");
        List<Dwarf> listOfDwarves = new ArrayList<>();
        for (String name : res
        ) {
            listOfDwarves.add(new Dwarf(name));
        }

        List<String> values = getRelationsFromFile("test2.txt");
		/*for (String s:values
			 ) {
			System.out.println(s);
		}*/

        List<String[]> la = getEntity("(?:[:=x]) ", values);

        //la.stream().forEach(x -> Arrays.stream(x).forEach(System.out::println));

        List<String> elves = new ArrayList<>();
        List<String> dwarves = new ArrayList<>();
        List<Integer> elves_love = new ArrayList<>();
        List<Integer> dwarves_love = new ArrayList<>();

        for (int i = 0; i < la.size(); i++) {
            elves.add(la.get(i)[0]);
            dwarves.add(la.get(i)[1]);
            if (la.get(i)[2].contains("R")) {
                String removeLetter = la.get(i)[2].replaceAll("[R]", "");
                String removeWhiteSpaces = removeLetter.replaceAll(" ", "");
                elves_love.add(Integer.parseInt(removeWhiteSpaces));
            } else if (la.get(i)[2].contains("L")) {
                String removeLetter = la.get(i)[2].replaceAll("[L]", "");
                String removeWhiteSpaces = removeLetter.replaceAll(" ", "");
                elves_love.add(Integer.parseInt(removeWhiteSpaces) * (-1));
            }
            if (la.get(i)[3].contains("R")) {
                String removeLetter = la.get(i)[3].replaceAll("[R]", "");
                String removeWhiteSpaces = removeLetter.replaceAll(" ", "");
                dwarves_love.add(Integer.parseInt(removeWhiteSpaces));
            } else if (la.get(i)[3].contains("L")) {
                String removeLetter = la.get(i)[3].replaceAll("[L]", "");
                String removeWhiteSpaces = removeLetter.replaceAll(" ", "");
                dwarves_love.add(Integer.parseInt(removeWhiteSpaces) * (-1));
            }
        }
       /* elves.stream().forEach(System.out::println);
        System.out.println();
        System.out.println();
        dwarves.stream().forEach(System.out::println);
        System.out.println();
        System.out.println();
        elves_love.stream().forEach(System.out::println);
        System.out.println();
        System.out.println();
        dwarves_love.stream().forEach(System.out::println);*/

        //Make sums
      /*  List<Integer> ii = new ArrayList<>();
        for (int i = 0; i < elves_love.size(); i++) {
            ii.add(elves_love.get(i) + dwarves_love.get(i));
        }*/
        //  Map<String, String> couples = new TreeMap<>();

        //ii.stream().forEach(System.out::println);

     /*   Map<List<String>, Integer> couples = new HashMap<>();
        for (int i = 0; i < elves_love.size(); i++) {
            couples.put(List.of(elves.get(i), dwarves.get(i)), ii.get(i));
        }*/

        // System.out.println(mm.keySet());


    /*    List<Integer> copySorted = new ArrayList<>(ii);
        Collections.sort(copySorted);
        Collections.reverse(copySorted);
        Set<Integer> set = new TreeSet<>(ii);*/
        //ii.stream().forEach(System.out::println);

        // set.stream().forEach(System.out::println);


        //    int count = 0;
        //  int temp = 5;
        //     System.out.println(ii.stream().filter(x -> x == set.toArray()[set.size() - temp - 1]).count());
        //      ii.stream().filter(x -> x == set.toArray()[set.size() - temp - 1]).forEach(System.out::println);
        //      Map<List<String>, Integer> finalSet = new HashMap<>();
        // List<Integer>
        //      int temp = 0;

//        int indx = 0;

        //System.out.println(set.toArray()[set.size() - finalI]);
        //       Map<Integer, Integer> ind_xx = new HashMap<>();
        //Set<Integer> indexes = new TreeSet<>();
        //       int counter = 1;








    /*    List<Integer> indc = new ArrayList<>();
        List<Integer> left = new ArrayList<>();
*/

        //    for (int i = 0; i < set.size()/*ii.size()*/;i++) {
        //int temp = count;
        // int finalTemp = temp;

        //         int finalI = i;

        //   gg = (int) ii.stream().filter(x -> x == copySorted.get(finalI)).count();
            /*for (int i1 = 0; i1 < ii.size(); i1++) {
                if(ii.get(i1) == copySorted.get(finalI)) {
                    System.out.println("i is ::: " + i + "  :::   " + copySorted.get(finalI));
                    gg++;
                }
            }*/
        //gg = (int) ii.stream().filter(num -> num == copySorted.get(finalI)).count();


        //COMMENTED
        //     int gg = (int) ii.stream().filter(num -> num == copySorted.get(finalI)).count();
        //    int gg = (int) ii.stream().filter(num -> num == set.toArray()[set.size() - 1 - finalI]).count(); //ok
        // System.out.println(gg);


            /*for (int i1 = 0; i1 < ii.size(); i++) {
                if (ii.get(i1) == copySorted.get(finalI)) {
                    gg++;
                }
            }*/
        //System.out.println(gg);

        // gg = (int)set.stream().filter(x -> x == copySorted.get(finalI)).count();
        //  System.out.println("Count is :::: " + gg);

        //*************************************************
        // Fully ready code for case gg = 0
       /*     if (gg == 1) {

                indx = ii.indexOf((int) set.toArray()[set.size() - 1 - finalI]); //ok

                int finalIndx = indx;
                //System.out.println("INDEX " + finalIndx);

                // System.out.println(finalSet.keySet().contains(List.of("hh","fd")));
                if (finalSet.isEmpty()) {
                    //COMMENTED
                  //  finalSet.put(List.of(elves.get(finalIndx), dwarves.get(finalIndx)), copySorted.get(finalI));
                    finalSet.put(List.of(elves.get(finalIndx), dwarves.get(finalIndx)), (int) set.toArray()[set.size() - 1 - finalI]);
                //    i++;
                } else {
                    if (finalSet.keySet()
                            .stream()
                            .anyMatch(list ->
                                    list.contains(elves.get(finalIndx)) || list.contains(dwarves.get(finalIndx)))
                    ) {
                      //  i++;
                    } else {
                        //COMMENTED
                        //finalSet.put(List.of(elves.get(finalIndx), dwarves.get(finalIndx)), copySorted.get(finalI));
                        finalSet.put(List.of(elves.get(finalIndx), dwarves.get(finalIndx)), (int) set.toArray()[set.size() - 1 - finalI]);
                     //   i++;
            */  //      }
        //  }
        //  i++;
        //g > 0
//elves.forEach(System.out::println);
       /* Map<List<String>, List<Integer>> pairs_init = new HashMap<>();
        for(int i = 0; i < elves.size(); i++) {
            pairs_init.put(List.of(elves.get(i), dwarves.get(i)), List.of(elves_love.get(i), dwarves_love.get(i)));
        }*/

       /* Map<String, List<String>> ranksElves = new HashMap<>();
        Map<String, List<String>> ranksDwarves = new HashMap<>();*/
     //   List<Integer> sort = Utils.sort_desc_list(elves_love);

        //sort.forEach(System.out::println);
       // Set<String> el = new TreeSet<>(elves);
       // el.forEach(System.out::println);
      /*  List<Map<Elf, String>> finalArray = new ArrayList<>();
        for (int i = 0; i < el.size(); i++) {
            //first - index, second love value
            Map<Elf, String> tt = new TreeMap<>();
            List<Integer> rankelf = new ArrayList<>();
            List<String> indexes = new ArrayList<>();
            for (int j = 0; j < elves.size(); j++) {
                if (el.toArray()[i].equals(elves.get(j))) {
                   // rankelf.add(elves_love.get(j));
                //    indexes.add(dwarves.get(j));
                    tt.put(new Elf(elves.get(j), List.of(j, elves_love.get(j))), dwarves.get(j));
                    //tt.put(dwarves.get(j), elves_love.get(j));
                }
            }

            finalArray.add(tt);
        }*/

        //finalArray.forEach(System.out::println);





        //sort.forEach(System.out::println);
   /*     Set<String> el2 = new TreeSet<>(dwarves);
       // el2.forEach(System.out::println);
        List<List<Dwarf>> gg = new ArrayList<>();
        List<Map<Dwarf, String>> finalArray2 = new ArrayList<>();
        for (int i = 0; i < el2.size(); i++) {
            //first - index, second love value
          //  Map<Dwarf, String> tt = new TreeMap<>();
            List<Dwarf> check = new ArrayList<>();
            for (int j = 0; j < dwarves.size(); j++) {
                if (el2.toArray()[i].equals(dwarves.get(j))) {
                   // System.out.println(elves.get(j));
                    // rankelf.add(elves_love.get(j));
                    //    indexes.add(dwarves.get(j));
                    check.add(new Dwarf(List.of(j, dwarves_love.get(j))));
                    //tt.put(new Dwarf(dwarves.get(j), List.of(j, dwarves_love.get(j))), elves.get(j));
                    //tt.put(dwarves.get(j), elves_love.get(j));
                }
            }
            //List<Integer> e = new ArrayList<>(tt.keySet());
            System.out.println();
          //  finalArray2.add(tt);
            Collections.sort(check);
            gg.add(check);
        }*/
      // finalArray2.forEach(System.out::println);
        //System.out.println(finalArray2.get(0).keySet());
        //System.out.println(finalArray2.get(0).values());
      // Map<String, List<String>> elf_Rank = new HashMap<>();
     //   Map<String, List<String>> dwarf_Rank = new HashMap<>();
       /* for (int i = 0; i<finalArray.size(); i++) {
            elf_Rank.put((String) el.toArray()[i], List.copyOf(finalArray .get(i).values()));

        }*/
    //    gg.forEach(System.out::println);
      /*  for (int i = 0; i < gg.size(); i++) {
            elf_Rank.put((String) el2.toArray()[i], gg.get(i).stream().map(x -> elves.get(x.getIndex().get(0))).collect(Collectors.toList()));
        }*/
      //  System.out.println(elf_Rank.keySet());
//System.out.println(elf_Rank.values());
       /* for(int i = 0; i < elves.size(); i++) {
            System.out.println(elves.get(i) + "    " + dwarves.get(i));
        }*/
        //System.out.println(finalArray.get(0).keySet());
        //System.out.println(finalArray.get(0).values());
        /*elf_Rank.keySet().forEach(System.out::println);
        System.out.println();
        System.out.println();
        elf_Rank.values().forEach(System.out::println);*/
        /*for (int i = 0; i < finalArray.size(); i++) {
            for (int j = 0; j < finalArray.get(i).size(); j++) {
                elf_Rank.put(finalArray.get(i).get(0), finalArray.get())
            }
        }*/
      /*  Map<String, String> matched_couple = new TreeMap<>();
        List<String> free = new LinkedList<>(elves);

        while(!free.isEmpty()) {
            String elf = free.remove(0);
            List<String> elfPrefers =

        }*/


      //  int max = -1000;
     /*  for (int i = 0; i < pairs_init.size(); i++) {
            if (pairs_init.keySet().contains("Darcassan ")) {
                int temp = (int) pairs_init.values().toArray()[i];
                max = max > temp ? max : temp;
            }
        }*/

       //    int temp = pairs_init.keySet().stream().filter(list -> list.contains());

        //System.out.println(temp);










       // Set<String> setOfElves = new HashSet<>(elves);
      //  setOfElves.forEach(System.out::println);
        // elves_love.forEach(System.out::println);
     //   Map<String, String> stableCouples = new HashMap<>();
        // int i = elves.size();
     //   System.out.println(pairs_init.keySet());
      //  System.out.println(pairs_init.values());
       /* for (int i = 0; i < elves.size(); i++) {

        }*/
        Map<String, List<String>> elvesMatch = Utils.getPreferences(elves,dwarves,elves_love);
     /*   System.out.println(elvesMatch.keySet());
        System.out.println(elvesMatch.values());

        System.out.println();
        System.out.println();*/

        Map<String, List<String>> dwarvesMatch = Utils.getPreferences(dwarves,elves,dwarves_love);
      /*  System.out.println(dwarvesMatch.keySet());
        System.out.println(dwarvesMatch.values());*/


    }
    //******************************

      /*      else {
                Set<Integer> indexes = new TreeSet<>();
                // List<Integer> indexes = new ArrayList<>();
                if (finalSet.isEmpty()) {
                } else {
                    int cc = 0;*/
                   /* for (int m = 0; m < ii.size(); m++) {
                        if(ii.get(m) == copySorted.get(m)) {
                            indexes.add(m);
                        }
                    }*/
    // if (ii.get())
                   /* ii.forEach(num -> {
                        if(num == (int) set.toArray()[set.size()  - 1 - finalI]) {
                            indexes.add(ii.indexOf(num));
                            System.out.println("Index i ::: " + set.toArray()[set.size()  - 1 - finalI] + "" +
                                    "    Value :::" + ii.indexOf(num));
                        }
                    });*/
          /*          for (int inn = 0; inn < ii.size(); inn++) {
                        if (set.toArray()[set.size() - 1 - finalI] == ii.get(inn)) {
                            indexes.add(inn);
                        }
                    }


                    for(int in = 0; in < indexes.size(); in++) {
                        int finalIn = in;
                        if (finalSet.keySet()
                                .stream()
                                .anyMatch(list ->
                                        list.contains(elves.get((int) indexes.toArray()[finalIn]))
                                                || list.contains(dwarves.get((int) indexes.toArray()[finalIn]))
                                )) {
                        } else {
                            indc.add(finalIn);
                           // left.add(finalIn);
                               // cc++;
                                //indc = finalIn;
                            }
                        }
                   // for (int u = 0; u < indexes.size(); u++) {
                      //  int finalU = u;
                        indexes.removeIf(index -> finalSet.keySet().stream().anyMatch(list ->
                                    list.contains(elves.get(index))
                                            || list.contains(dwarves.get(index))));
                    indc.removeAll(indexes);

                    if (indexes.size() == 1)// &&
                    /*finalSet.keySet().stream().noneMatch(list ->
                            list.contains(elves.get(indc.get(0)))
                                    || list.contains(dwarves.get(indc.get(0))))) {
                        int check = 0;
                        for (int g = 0; g < indc.size(); g++) {
                            int finalG = g;
                            if (finalSet.keySet().stream().anyMatch(list ->
                                    list.contains(elves.get(indc.get(finalG)))
                                            || list.contains(dwarves.get(indc.get(finalG))))) {
                                check++;
                            }
                        }
                        if (check > 0) {

                        } else {
                            finalSet.put(List.of(elves.get((int) indexes.toArray()[0]),
                                    dwarves.get((int) indexes.toArray()[0])), (int) set.toArray()[set.size() - 1 - finalI]);
                        }
                    }*/
    //}
    //      }
                       /* if (cc == 1) {
                            finalSet.put(List.of(elves.get((int)indexes.toArray()[indc]),
                                    dwarves.get((int)indexes.toArray()[indc])),(int) set.toArray()[set.size()  - 1 - finalI]);
                        }*/
                       /* else if (in == indexes.size() - 1) {
                            if (cc > 1) {

                            } else {
                                finalSet.put(List.of(elves.get((int)indexes.toArray()[finalIn]),
                                        dwarves.get((int)indexes.toArray()[finalIn])),(int) set.toArray()[set.size()  - 1 - finalI]);
                            }
                        }
                        else {
                            cc++;
                        }*/
    //}

                /*    indexes.forEach(index -> {
                        if (finalSet.keySet()
                            .stream()
                            .anyMatch(list ->
                                    list.contains(elves.get(index)) || list.contains(dwarves.get(index)))
                    ) {

                    } *//*else if (finalSet.keySet().stream().noneMatch(listOfNames -> listOfNames.contains(elves.get(index)) &&
                                listOfNames.contains(dwarves.get(index)))) {
                            cc.getAndIncrement();

                        }  else {
                            finalSet.put(List.of(elves.get(index), dwarves.get(index)), copySorted.get(finalI));
                        }
                    });*/

    //  System.out.println(ii.get(i));
                  /*  if (ii.get(i) == copySorted.get(finalI)) {
                        int i3i = copySorted.get(finalI);
                        //System.out.println("I value ::: " + i3i);
                        indexes.add(i);
                    }*/

                    /*for (int m = 0; m < ii.size(); m++) {
                        if (ii.get(m) == copySorted.get(finalI)) {
                            indexes.add(m);
                        }
                    }*/
    //        }
                   /* indexes.stream().forEach(index -> {
                        if(finalSet.keySet().stream().anyMatch(list -> {
                            if(list.contains(elves.get(index)) || list.contains(dwarves.get(index))) {
                                return true;
                            }
                            return false;
                        } )) {

                        } else {
                            finalSet.put(List.of(elves.get(index), dwarves.get(index)), copySorted.get(finalI));
                        }

                    });
                }*/
    //      }
    //   System.out.println("I num is ::: " + i);
    //    }


    // System.out.println(ii.size() == copySorted.size());
    //ii.forEach(System.out::println);
    // copySorted.forEach(System.out::println);
    // indexes.forEach(System.out::println);
    //   set.forEach(System.out::println);
    // System.out.println(set.size());
    //set.stream().forEach(System.out::println);
    // System.out.println(finalSet.keySet());

    // int val = -1000;
    /*    List<String> ttmm = new ArrayList<>();
        List<String> ttmm2 = new ArrayList<>();
        List<Integer> vg = new ArrayList<>();
        List<Integer> vg2 = new ArrayList<>();
        Set<String> blah = new TreeSet<>(elves);
        Set<String> blahDw = new TreeSet<>(dwarves);*/
    //blah.forEach(System.out::println);
  /*      for (int i = 0; i < blah.size(); i++) {
            int val = -1000;
            String partner = "Hello";
            for (int j = 0; j < elves.size(); j++) {

                if (blah.toArray()[i].equals(elves.get(j))) {*/
                  /*  System.out.println();
                  System.out.println(blah.toArray()[i]);
                    System.out.println(elves.get(j));
                    System.out.println();*/

    //int temp1 = ii.get(j);
                /*    if (val < ii.get(j)) {
                        val = ii.get(j);
                        partner = dwarves.get(j);
                    }*/ /*else {
                        val = val;
                        //partner = dwarves.get(j);
                    }*/
          /*      }


            }
            ttmm.add(partner);
            vg.add(val);

            System.out.println("Max value for " + blah.toArray()[i] + " is " + val);

            }
        System.out.println(
        );
        System.out.println();
        for (int i = 0; i < blahDw.size(); i++) {
            int val = -1000;
            String partner = "Hello";
            for (int j = 0; j < dwarves.size(); j++) {

                if (blahDw.toArray()[i].equals(dwarves.get(j))) {*/
                  /*  System.out.println();
                  System.out.println(blah.toArray()[i]);
                    System.out.println(elves.get(j));
                    System.out.println();*/

    // int temp1 = ii.get(j);
                 /*   if (val < ii.get(j)) {
                        val = ii.get(j);
                        partner = elves.get(j);
                    }
                }


            }
            ttmm2.add(partner);
            vg2.add(val);

            System.out.println("Max value for " + blahDw.toArray()[i] + " is " + val);


        }*/
    // }
    // elves.forEach(System.out::println);
       /* System.out.println("Possible partners ::: ");
        for (int d = 0; d < blah.size(); d++) {
            System.out.println(blah.toArray()[d] +"  +  "+ ttmm.get(d) + " with a value of "+vg.get(d));
        }
        System.out.println();
        System.out.println();
        for (int d = 0; d < blahDw.size(); d++) {
            System.out.println(blahDw.toArray()[d] +"  +  "+ ttmm2.get(d) + " with a value of "+vg2.get(d));
        }
        Map<List<String>, Integer> fj = new HashMap<>();
        Map<List<String>, Integer> fj2 = new HashMap<>();
        for (int a = 0; a < blah.size(); a++) {
            fj.put(List.of((String)blah.toArray()[a], ttmm.get(a)), vg.get(a));
        }
        for (int a = 0; a < blahDw.size(); a++) {
            fj2.put(List.of((String)blahDw.toArray()[a], ttmm2.get(a)), vg2.get(a));
        }*/
    //System.out.println(couples.keySet());
    //  System.out.println(couples.values());

    //Map<String, List<String>> mens = new HashMap<>();
    // Map<String, List<String>> wens = new HashMap<>();
    //get sort womens by specific men in desc order
       /* int minimal = -100;
        for (int v = 0; v < ii.size(); v++) {

        }*/
    //List<Integer> nnn = Utils.sort_asc_list(copySorted);
    // nnn.forEach(System.out::println);

}

//}
