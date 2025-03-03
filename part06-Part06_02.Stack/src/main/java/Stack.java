/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */

import java.util.ArrayList;

public class Stack {
    private ArrayList<String> list;
    
    public Stack() {
        this.list = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        if (this.list.size() > 0) {
            return false;
        }

        return true;
    }
    
    public void add(String value) {
        this.list.add(0, value);
    }
    
    public ArrayList<String> values() {
        return this.list;
    }
    
    public String take() {
        String element = this.list.get(0);
        this.list.remove(element);
        return element;
    }
}
