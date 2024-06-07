package enums;


import enums.models.Client;
import enums.models.TypeClient;
import enums.models.TypePayment;

public class Main {
    public static void main(String[] args) {

        Client client1 = new Client("Client 1", TypeClient.LEGAL_ENTITY);
        Client client2 = new Client("Client 2", TypeClient.INDIVIDUAL);

        System.out.println(client1);
        System.out.println(client2);

        Client client3 = new Client("Client 3", TypeClient.INDIVIDUAL, TypePayment.DEBIT);
        System.out.println(TypePayment.DEBIT.CalculateDiscount(100));
        System.out.println(client3.getTypePayment().CalculateDiscount(100));

        System.out.println(TypeClient.typeClientByName("Individual"));
    }
}
