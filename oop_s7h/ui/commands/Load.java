package oop_s7h.ui.commands;

import oop_s7h.ui.Console;

public class Load extends Command
{
    public Load(Console console) 
    {
        super(console);
    }

    @Override
    public String description() 
    {
        return "Загрузить семью. ";
    }

    @Override
    public void execute() 
    {
        getConsole().loadFamily();   
    }
    
}
