package classes;

import classes.models.Player;
import classes.models.Team;

public class Main {
    public static void main(String[] args) {
//        Pessoa pessoa  = new Pessoa();
//        Pessoa pessoa2 = new Pessoa();
//
//        pessoa.name = "Silas";
//        pessoa.yearsOld = 22;
//        pessoa.gender = 'M';
//
//        pessoa2.name = "Silão";
//        pessoa2.yearsOld = 22;
//        pessoa2.gender = 'M';
//
//        pessoa.getMessage();
//        pessoa2.getMessage();
//
//
//        Calc calc = new Calc();
//
//        int[] nums = new int[]{1,2,3,4,5};
//
//        calc.sumVarArgs(nums);
//        calc.sumVarArgs(1,2,3,4,5);
//
//
//        Employee employee = new Employee();
//        employee.setName("Silas");
//        employee.setYearsOld(22);
//        employee.setSalaries(new double[]{1_000, 2_500, 3_000});
//
//        employee.printInfo();
//        employee.averageSalary();
//
//        employee.init("Silas", 22);
//        employee.init("Silas", 22, new double[]{1000, 2000, 3000});
//
//        Anime anime = new Anime("test");
//        System.out.println(anime.getEpisodes());
//        for(int ep : anime.getEpisodes()){
//            System.out.println(ep);
//        }

//        Car.setLimitSpeed(180);
//
//        Car car1 = new Car("BMW", 280);
//        Car car2 = new Car("Mercedes", 275);
//        Car car3 = new Car("Audi", 290);
//
//
//        car1.print();
//        car2.print();
//        car3.print();

//        Anime anime = new Anime();
//        Anime anime2 = new Anime();
//        Anime anime3 = new Anime();

        // Using initialize static block
//        Anime2 anime2 = new Anime2();
//        Anime2 anime3 = new Anime2();
//        Anime2 anime4 = new Anime2();

        Player player1 = new Player("Number 1");
        Player player2 = new Player("Number 2");

        Player[] players = {player1, player2};
        Team team2 = new Team("Team 2", players);

//        for (Player player : players) {
//            player.print();
//        }

//        Team team1 = new Team("Team 1");
//        team1.setPlayers(players);
//        team1.print();

        player1.setTeam(team2);
        player2.setTeam(team2);

        System.out.println("----------");
        team2.print();

        System.out.println("----------");
        System.out.println("Player: " + player1.getName() + " "  + player1.getTeam().getName());
        System.out.println("Player: " + player2.getName() + " "  + player1.getTeam().getName());
    }
}
