public class BoohbahRebellionTest {
    public static void main(String[] args) {
        SupremeBoohbah[] boohbahs =  {new Humbah(), new Jumbah(), new Zumbah(), new Jingbah()};

        System.out.println("\n--- Boohbah Rebellion Begins ---\n");
        for (SupremeBoohbah boobhbah : boohbahs) {
            boobhbah.command();
        }

        System.out.println("\n--- Overloaded Commands & Story---\n");

        ((Jingbah)boohbahs[3]).command("Do we really have to fight?", false);
        ((Jingbah)boohbahs[3]).command("I can't believe this...\n", true);
        
        ((Jumbah)boohbahs[1]).command(boohbahs[1].name + " retorts: We must fight! It is pertinent to our pulchritudinous world!\n");
        ((Humbah)boohbahs[0]).command(boohbahs[0].name + " reacts: You dare defy our leader? Jumbah, I solemnly promise you shall not live to see another day!");
        ((Humbah)boohbahs[0]).command(boohbahs[0].name + " prepeares an attack.\n");
        ((Zumbah)boohbahs[2]).command(boohbahs[2].name + " attacks Humbah in the back: You are lost brother. The leader is flawed, and it is too late for you to see that.\n");
        ((Humbah)boohbahs[0]).command(boohbahs[0].name + " stumbles onto his back, gazing at the war-torn sky: Zumbah, you... traitor...");
        ((Humbah)boohbahs[0]).command(boohbahs[0].name + " says: Our b-brotherhood... It's too far gone, isn't it?");
    }
}
    
