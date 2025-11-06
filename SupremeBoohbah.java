public class SupremeBoohbah {
    protected String name;

    public SupremeBoohbah() {
        name = "Zing Zing Zingbah";
        System.out.println("Supreme Boohbah awakens! " + "All must heed the words of " + name + "!");
    }
    public void command() {
        System.out.println("All must heed the words of Supreme Boohbah---Or all shall perish.");
    }
    public void command(String newMessage) { // Overloaded command
        System.out.println(newMessage);
    }
    @Override
    public String toString() {
        return "A boohbah," + name + ". : a being of immense power.";
    }
    
}