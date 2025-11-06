public class Zumbah extends SupremeBoohbah{
    public Zumbah() {
        super();
        name = "Zumbah, the conniving lieutenant";
        System.out.println(this.name + " stands forbodingly at the ready.");
    }
    @Override
    public void command() {
        super.command(this.name + " plans an aereal assault on his unassuming master.");
    }
}
