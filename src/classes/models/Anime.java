package classes.models;

public class Anime {

    private String name;
    private int[] episodes;

    //Initialize block
    {
        System.out.println("Dentro do bloco");
        episodes = new int[10];
        for(int i = 0; i < episodes.length; i++){
            episodes[i] = i + 1;
        }
        System.out.println(" ");
    }

    public Anime(String name){
        this.name = name;
    }

    public Anime(){
        for(int episode : this.episodes ){
            System.out.println(episode + " ");
        }

    }

    public String getName() {
        return name;
    }

    public int[] getEpisodes(){
        return episodes;
    }

}
