import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing {
    JFrame frame;

    public static void main(String[] args) {
        Swing example = new Swing();
        example.go();
    }
    public void go() {
        frame = new JFrame();
        JButton button = new JButton("Should I do it?");
        button.addActionListener(new AngelListener()); //Назначает объекты слушателями (наблюдателями) событий кнопки.
        button.addActionListener(new DevilListener());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setSize(200,200);
        frame.setVisible(true);
    }

    class AngelListener implements ActionListener { //Определения наблюдателей в виде
       // внутренних классов (хотя возможны и другие способы)
        public void actionPerformed(ActionEvent event) {
            System.out.println("Don’t do it, you might regret it!");
        }
    }
    class DevilListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            System.out.println("Come on, do it!"); //При изменении состояния субъекта (в данном случае кнопки)
            //вместо update() вызывается метод actionPerformed().
        }
    }

}