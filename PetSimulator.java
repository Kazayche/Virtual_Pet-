public class PetSimulator
{
  public static void main(String[] args)
  {
    // create an array that can hold up to 10 pets
    Pet[] pets = new Pet[10];
   
    // adopt four pets, two cats, two dogs
    pets[0] = new Pet("Rishi", Pet.CAT);
    pets[1] = new Pet("Tanush", Pet.CAT);
    pets[2] = new Pet("Vish", Pet.DOG);
    pets[3] = new Pet("Arnav", Pet.DOG);
   
    // feed your pets
    pets[0].feed();
    pets[1].feed();
    pets[2].feed();
    pets[3].feed();
   
    // make yourself the owner
    pets[0].setOwner("Shourya");
    pets[1].setOwner("Shourya");
    pets[2].setOwner("Shourya");
    pets[3].setOwner("Shourya");
   
    // dogs make noise, take them for a walk
    pets[2].makeNoise();
    pets[3].makeNoise();
    pets[2].walk();
    pets[3].walk();
   
    // cats make noise
    pets[0].makeNoise();
    pets[1].makeNoise();
   
    // give all pets a treat
    pets[0].giveTreat();
    pets[1].giveTreat();
    pets[2].giveTreat();
    pets[3].giveTreat();
   
    // groom your cats
    pets[0].groom();
    pets[1].groom();
   
    // play with all pets
    pets[0].play();
    pets[1].play();
    pets[2].play();
    pets[3].play();
   
    // all pets nap and get fed
    pets[0].sleep();
    pets[0].feed();
    pets[1].sleep();
    pets[1].feed();
    pets[2].sleep();
    pets[2].feed();
    pets[3].sleep();
    pets[3].feed();
   
    System.out.println("--- MY PETS ---");
    System.out.println(pets[0]);
    System.out.println(pets[1]);
    System.out.println(pets[2]);
    System.out.println(pets[3]);
   
    // get a couple of pets for your friend
    pets[4] = new Pet("Jay", Pet.CAT);
    pets[5] = new Pet("Aarav", Pet.DOG);
   
    // set owner to friend's name
    pets[4].setOwner("Dev");
    pets[5].setOwner("Dev");
   
    System.out.println("--- MY PETS ---");
    System.out.println(pets[0]);
    System.out.println(pets[1]);
    System.out.println(pets[2]);
    System.out.println(pets[3]);
  }
}

