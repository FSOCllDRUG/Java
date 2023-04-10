package s6h.model;

import java.util.*;

import static java.lang.Character.isDigit;

public class Filter2 {
    public static void filterLaptopSet(Set laptopsSet) {
        Scanner sc = new Scanner(System.in);
        HashSet<Laptop> laptops = new HashSet<>(laptopsSet);


        Map<Integer, String> filter = new HashMap<>();
        filter.put(1, "Производитель");
        filter.put(2, "Операционная система");
        filter.put(3, "Объем жесткого диска");
        filter.put(4, "Объем оперативной памяти");
        filter.put(5, "Объем видео памяти");

        Map<String, Integer> valueFilter = new HashMap<>();
        Map<String, String> stringFilter = new HashMap<>();
        int value;

        System.out.println("Введите параметр отфильтрованного товара: ");


        for (Map.Entry<Integer, String> pair : filter.entrySet()) {
            String valueF = pair.getValue();
            int val = pair.getKey();
            System.out.println(val + " - " + valueF);


            System.out.println("Ввод: ");
            String input = sc.next();
            if (isDigit(input)){
                value = Integer.parseInt(input);

                valueFilter.put(filter.get(val), value);

            } else {
                stringFilter.put(filter.get(val), input);

                }
        }


        List<Laptop> allFilter = laptops.stream().filter(item ->
                item.getHardDriveSize() == valueFilter.get("Объем жесткого диска") ||
                        item.getRamSize() == valueFilter.get("Объем оперативной памяти") ||
                        item.getDedicatedGraphicsMemory() == valueFilter.get("Объем видео памяти") ||
                        item.getManufacture().equals(stringFilter.get("Производитель")) ||
                        item.getOperatingSystem().equals(stringFilter.get("Операционная система"))).toList();

                    for (Laptop el : allFilter) {
                        System.out.println(el);
                    }
    }


    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
