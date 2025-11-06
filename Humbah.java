public class Humbah extends SupremeBoohbah{
    public Humbah() {
        super();
        name = "Humbah, the steadfast general";
        System.out.println(this.name +" heeds the words of his master.");
    }
    @Override
    public void command() {
        super.command(this.name + " remains steadfast in his pursuit of discipleship.");
    }
}
