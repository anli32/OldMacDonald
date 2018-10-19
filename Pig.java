class Pig implements Animal {
  private String myType;
  private String mySound;
  
  // Client provides type and sound
  public Pig(String type, String sound) {
    myType = type;
    mySound = sound;
  }
  
  // Client does not provide the type and sound
  public Pig() {
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