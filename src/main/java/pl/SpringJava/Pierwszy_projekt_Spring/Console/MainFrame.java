package pl.SpringJava.Pierwszy_projekt_Spring.Console;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;
@SpringBootApplication
public class MainFrame extends JFrame {

    MainFrame(){
        initUI();
    }

    public void initUI(){

        setTitle("TimeGuard");

        //Buttons Objects

        JButton buttonUserTimeStamp=new JButton("Wprowadź czas");
        JButton buttonTimeStamp=new JButton("Zapisz aktualny czas");
        JButton buttonAdditionalTime=new JButton("Dodaj dodatkowe minuty");

        //Buttons positioning

        buttonAdditionalTime.setBounds(50,300,50,20);
        buttonTimeStamp.setBounds(125,300,50,20);
        buttonUserTimeStamp.setBounds(200,300,50,20);

        //Buttons adding to the frame

        add(buttonAdditionalTime);
        add(buttonUserTimeStamp);
        add(buttonTimeStamp);

        //frame configuration

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,500);
        setLayout(null);
        setVisible(true);
    }



}
