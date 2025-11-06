public class Jingbah extends SupremeBoohbah{
    public Jingbah() {
        name = "Jingbah, purveyor of peace";
        System.out.println(this.name + " tries to calm the the discourse.");
    }
    @Override
    public void command() {
        System.out.println(this.name + " tries to group hug.");
    }
    public void command(String newMessage, boolean whisper) {
        if (whisper) {
            System.out.println(this.name + " whispers: "+ newMessage.toLowerCase());
        }
        else {
            System.out.println(this.name + " shouts: "+ newMessage.toUpperCase());
        }
    }
    @Override
    public String toString() {
        return "A boohbah," + this.name + ". : a being of immense power.";
    }
    
}