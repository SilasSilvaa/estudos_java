package classes.models;

public class Anime2 {

    private String name;
    private static int[] episodes;

    //Initialize block
    static{
        System.out.println("Dentro do bloco de inicialização");
        episodes = new int[10];
        for(int i = 0; i < episodes.length; i++){
            episodes[i] = i + 1;
        }
    }

    public Anime2(String name){
        this.name = name;
    }

    public Anime2(){
        for(int episode : Anime2.episodes ){
            System.out.println(episode + " ");
        }

    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getName() {
        return name;
    }

    public int[] getEpisodes(){
        return episodes;
    }

}
