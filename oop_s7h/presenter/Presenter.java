package oop_s7h.presenter;

import oop_s7h.model.FamilyFree;
import oop_s7h.model.Human;
import oop_s7h.model.IO;
import oop_s7h.model.comporator.HumanComporatorByAge;
import oop_s7h.ui.View;

public class Presenter 
{
    private View view;
    private IO serializ;
    private FamilyFree<Human> familyConnect;
    private HumanComporatorByAge sortAge;

    public Presenter(View view, FamilyFree<Human> familyConnect, IO serializ, HumanComporatorByAge sortAge) 
    {
        this.familyConnect = familyConnect;
        this.view = view;
        this.serializ = serializ;
        this.sortAge = sortAge;
        view.setPresenter(this);
    }

    public void addHumanNew(String name, String sex, int age)
    {        
        familyConnect.addFamilyFree(new Human(name, sex, age));
        view.print("Новый член семьи добавлен !");
    }

    public void familyPrint() 
    {
        String family = familyConnect.toString();
        view.print(family);       
    }

    public void humanSearch(String name) 
    {
        Human chelovek = familyConnect.getByName(name);
        if (chelovek == null) view.print("Такого человека нет в семье !");
        
        else 
        {
            String human = chelovek.toString();
            view.print(human);
        }
    }

    public void saveFamily()
    {
        familyConnect.saveObj(serializ);
        view.print("Семейное древо сохранено !");
    }

    public void loadFamily()
    {
        serializ.load("FreeFamily.data");
    }

    public void sortFamilyName()
    {
        familyConnect.getFamilyFree().sort(null);
        view.print("Сортировка завершена !");
    }

    public void sortFamilyAge()
    {
        familyConnect.getFamilyFree().sort(sortAge);
        view.print("Сортировка завершена !");
    }

}
