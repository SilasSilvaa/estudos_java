package threads;

import threads.dominio.Members;
import threads.service.EmailDeliveryService;

import javax.swing.*;

public class EmailDeliveryTest1 {
    public static void main(String[] args) {
        Members members = new Members();
        Thread jiraya = new Thread(new EmailDeliveryService(members), "Jiraya");
        Thread kakashi = new Thread(new EmailDeliveryService(members), "Kakashi");

        jiraya.start();
        kakashi.start();

        while (true){
            String email = JOptionPane.showInputDialog("Entre com seu e-mail");
            if(email == null || email.isEmpty()){
                members.close();
                break;
            }

            members.addMemberEmail(email);
        }

    }
}
