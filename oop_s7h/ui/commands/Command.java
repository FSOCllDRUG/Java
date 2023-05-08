package oop_s7h.ui.commands;

import oop_s7h.ui.Console;

public abstract class Command implements Option 
{
    private Console console;

    public Command(Console console) 
    {
        this.console = console;
    }

    public Console getConsole() 
    {
        return console;
    }
}