import javax.swing.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MyWindowApp extends JFrame { //Наследуя от JFrame мы получаем всю функциональность окна

    public MyWindowApp(){
        super("Вызов Лешки"); //Заголовок окна
        setBounds(300, 300, 300, 300); //Если не выставить
        //размер и положение
        //то окно будет мелкое и незаметное

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //это нужно для того чтобы при
        //закрытии окна закрывалась и программа,
        //иначе она останется висеть в процессах
    }

    public static void main(String[] args) { //эта функция может быть и в другом классе
        ImageIcon icon1 = createIcon("images/settings.jpg");
        JLabel label = new JLabel(icon1);
        panel.add(label).setBounds(10,10,27,30);
        MyWindowApp app = new MyWindowApp(); //Создаем экземпляр нашего приложения
        app.setVisible(true); //С этого момента приложение запущено!
    }
}