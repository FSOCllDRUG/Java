package oop_s7h.ui.commands;

import oop_s7h.ui.Console;

public class FamilyPrint extends Command 
{
    public FamilyPrint(Console console) 
    {
        super(console);
    }

    @Override
    public String description() 
    {
        return "Печать семейного древа.";
    }

    @Override
    public void execute() 
    {
        getConsole().familyPrint();
    }
}