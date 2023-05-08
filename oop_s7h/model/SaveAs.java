package oop_s7h.model;

import java.io.Serializable;

public interface SaveAs 
{
    void save(String path, Serializable obj);
}

