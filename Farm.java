class Farm {
  private Animal[] aBunchOfAnimals;
  public Farm() {
    aBunchOfAnimals = new Animal[3];
    aBunchOfAnimals[0] = new NamedCow("cow", "Elsie", "moo");
    aBunchOfAnimals[1] = new Chick("chick", "cluck", "cheep");
    aBunchOfAnimals[2] = new Pig("pig", "oink");
  }
  
  public void animalSounds() {
    for(int nI = 0; nI < aBunchOfAnimals.length; nI++) {
      System.out.println(aBunchOfAnimals[nI].getType() + " goes " + aBunchOfAnimals[nI].getSound());
    }
    //Need to cast as (NamedCow) because Farm does not have getName() function, not all animals have names
    //  Only NamedCow does, so must cast that element, so that you are able to access the getName() function
    System.out.println("The cow is known as " + ((NamedCow)aBunchOfAnimals[0]).getName());
  }
}