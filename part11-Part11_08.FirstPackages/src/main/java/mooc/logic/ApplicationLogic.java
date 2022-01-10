package mooc.logic;


import mooc.ui.UserInterface;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Ania
 */
public class ApplicationLogic {
    
    private UserInterface ui;
    
    public ApplicationLogic(UserInterface ui) {
        this.ui = ui;
    }
    
    public void execute(int times) {
        for(int i = 0; i < times; i ++) {
            System.out.println("Application logic is working");
            ui.update();
        }
    }
    
}
