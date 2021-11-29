
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ania
 */
public class UserInterface {
    
    private Scanner scanner;
    private TodoList list;

    public UserInterface(TodoList list, Scanner scanner) {
        this.scanner = scanner;
        this.list = list;
    }
    
    public void start() {
        while(true){
        System.out.print("Command:");
        String command = scanner.nextLine();
        
        if(command.equals("stop")) {
            break;
        } 
        
        if(command.equals("add")) {
            System.out.print("To add: ");
            String task = scanner.nextLine();
            this.list.add(task);
            
        }
        
        if(command.equals("list")) {
            list.print();
        }
        
        if(command.equals("remove")) {
            System.out.print("Which one is removed?");
            int numerToRemove = Integer.valueOf(scanner.nextLine());
            this.list.remove(numerToRemove);
        }
        
        
            
        }
        
    }
}
