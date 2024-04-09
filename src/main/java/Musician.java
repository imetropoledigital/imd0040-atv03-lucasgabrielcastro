public class Musician extends Person {
    // fields
    private bool playClassicalMusic;
    private bool canImprovise;
    private bool canCompose;

    // constructor(s)
    public Musician(string name, string hometown, bool playClassicalMusic, bool canImprovise, bool canCompose)
    {
        super(name, hometown);
        this.playClassicalMusic = playClassicalMusic;
        this.canImprovise = canImprovise;
        this.canCompose = canCompose;
    }
    // methods
    public void play()
    {
        System.out.println("Playing guitar");
    }
}
