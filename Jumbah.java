public class Jumbah extends SupremeBoohbah{
    public Jumbah() {
        super();
        name = "Jumbah, the rebellious chieftain";
        System.out.println(this.name + " spits on the Empire!");
    }
    @Override
    public void command() {
        super.command("The words of Zing Zing Zingbah are all a facade! " + this.name + " enacts an insurrection!");
    }
}
