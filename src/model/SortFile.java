/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class SortFile 
{
    private String content_file;
    private ArrayList numbers;

    public SortFile(String content_file) {
        this.content_file = content_file;
        numbers = new ArrayList();
    }
    
    
    public void addNumbers()
    {
        
       
    
    }
    
    public void ShellSort()
    {
    
    }
    
    

    public ArrayList getNumbers() {
        return numbers;
    }

    public void setNumbers(ArrayList numbers) {
        this.numbers = numbers;
    }
    
    public String getContent_file() {
        return content_file;
    }

    public void setContent_file(String content_file) {
        this.content_file = content_file;
    }
    
    
    
}
