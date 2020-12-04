/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantsystem;
import restaurantsystem.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
/**
 *
 * @author AresUII
 */
public class RestaurantSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Frame gfx=new Frame();
        gfx.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent killGfx){gfx.dispose();}
        });
        gfx.setSize(800,600);
        //User ID field
        TextField userField=new TextField("User ID");
        userField.setBounds(300,50,200,50);
        gfx.add(userField);
        
        //Password field
        TextField passField=new TextField("Password");
        passField.setBounds(300,150,200,50);
        gfx.add(passField);
        
        //Login button
        Button acceptButton=new Button("Accept");
        acceptButton.setBounds(300,250,200,50);
        gfx.add(acceptButton);
        
        //setLayout to ensure last setBounds is not ignored
        gfx.setLayout(null);
        gfx.setVisible(true);
    }
}