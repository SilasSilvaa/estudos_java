package modificadorfinal;

import modificadorfinal.models.Anime;
import modificadorfinal.models.Car;
import modificadorfinal.models.Ferrari;

public class Main {
    public static void main(String[] args) {

        Anime anime = new Anime("One Piece");
        System.out.println(anime);

        Car car = new Car();
        System.out.println(Car.LIMIT_SPEED);

        car.BUYER.setName(" ");
        System.out.println(car.BUYER);

    }
}
