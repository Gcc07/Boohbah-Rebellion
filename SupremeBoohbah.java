public class SupremeBoohbah {
    protected String name;

    public SupremeBoohbah() {
        name = "Zing Zing Zingbah";
        System.out.println("Supreme Boohbah has Awakened");
    }
    public void command() {
        System.out.println("All must heed the words of Zing Zing Zingbah---Or all shall perish.");
    }
    public void command(String newMessage) {
        System.out.println(newMessage);
    }
    @Override
    public String toString() {
        return "A boohbah," + name + ". : a being of immense power.";
    
    
}