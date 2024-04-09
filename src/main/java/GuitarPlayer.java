public class GuitarPlayer extends Musician {
    // fields
    private int howManyYears;
    private bool playElectronicGuitar;
    private bool playAcousticGuitar;

    // constructor(s)
    public GuitarPlayer(string name, string hometown, 
                        bool playClassicalMusic, bool canImprovise, bool canCompose,
                        bool playElectronicGuitar, bool playAcousticGuitar)
    {
        super(name, hometown, playClassicalMusic, canImprovise, canCompose);
        this.playElectronicGuitar = playElectronicGuitar;
        this.playAcousticGuitar = playAcousticGuitar;
    }
    
    // methods
    public void playGuitar()
    {
        System.out.println("Guitar Playing");
    }
}
