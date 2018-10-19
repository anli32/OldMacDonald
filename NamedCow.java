class NamedCow extends Cow {
  private String myCowName;
  
  public NamedCow(String type, String name, String sound) {
    myType = type;
    myCowName = name;
    mySound = sound;
  }
  
  public String getName() {
    return myCowName;
  }
}