import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppFrame extends JFrame implements ActionListener {
    JButton compressButton;
    JButton decompressButton;

    AppFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        compressButton = new JButton("Select file to compress");
        compressButton.setBounds(20,100,200,30);


        decompressButton = new JButton("Select file to decompress");
        decompressButton.setBounds(250,100,200,30);

        this.add(compressButton);
        this.add(decompressButton);

        this.setSize(1000, 500);
        this.getContentPane().setBackground(Color.green);
        this.setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e){

    }



}