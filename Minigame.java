class Characters{
    String name;
    Characters(String name){
        this.name =name;
    }

   void attack(){}
}
class Warrior extends Characters {
    Warrior(String name){
    super(name);
    }

    @Override
    void attack(){
        System.out.println(name +" Attack for warrior is sword");
    }

}
class Archer extends Characters {
    Archer(String name){
    super(name);
    }
    @Override
   
    void attack(){
        System.out.println(name +" Attack for archer is arrow ");
    }
}
class Mage extends Characters {
    Mage(String name){
    super(name);
    }
    @Override
    void attack(){
        System.out.println(name + " Attack for mage is magic ") ;
       }
}

public class Minigame {
    public static void main(String [] args){
        Characters[] a = {new Warrior("abi") ,new Archer("abi") , new Mage("abi")};
        for(Characters b :a){
            b.attack();
        }
    }
}
