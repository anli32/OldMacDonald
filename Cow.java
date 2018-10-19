class Cow implements Animal {
  protected String myType;
  protected String mySound;
  
  // Client provides type and sound
  public Cow(String type, String sound) {
    myType = type;
    mySound = sound;
  }
   // Client does not provide the type and sound
  public Cow() {
    myType = "unknown";
    mySound = "unknown";
  }
  
  public String getSound() {
    return mySound;
  }
  
  public String getType() {
    return myType;
  }
}