package s6h.model;

import java.util.HashSet;
import java.util.Set;

public class Data {
    /**
     * Создаем Множество из списка ноутов
     * @return возращаем Множество в Main
     */
    public static Set<Laptop> baseLaptopSet(){
        Set<Laptop> laptopsSet = new HashSet<>();

        laptopsSet.add(new Laptop("ASUS", "Windows11Pro", 2, 64, 32));
        laptopsSet.add(new Laptop("Lenovo","Windows10Home",2,8,16));
        laptopsSet.add(new Laptop("Acer","Windows10Home",2,16,16));
        laptopsSet.add(new Laptop("DELL","Windows11Home",2,16,16));
        laptopsSet.add(new Laptop("SAMSUNG","DOS",2,16,16));
        laptopsSet.add(new Laptop("Apple","MacOS",2,16,16));
        laptopsSet.add(new Laptop("ASUS","Windows11Home",2,16,16));
        laptopsSet.add(new Laptop("Lenovo","Windows10Home",2,8,16));
        laptopsSet.add(new Laptop("Acer","Windows11Home",2,16,16));
        return laptopsSet;
    }
}
