//Chick.java
class Chick implements Animal {
  private String myType;
  private String mySound1;
  private String mySound2;
  private boolean twoSounds;
  
  // Client provides type and sound
  public Chick(String type, String sound) {
    myType = type;
    mySound1 = sound;
    twoSounds = false;
  }
  
  // Client does not provide the type and sound
  public Chick() {
    myType = "unknown";
    mySound1 = "unknown";
  }
  
  // Client provides two sounds
  public Chick(String type, String sound1, String sound2) {
    myType = type;
    mySound1 = sound1;
    mySound2 = sound2;
    twoSounds = true;
  }
    
  public String getSound() {
  	if(twoSounds == true) {
    	if(Math.random() < 0.5) {
      		return mySound1;
    	} else {
      		return mySound2;
      	}
    } else {
    	return mySound1;
    }
  }
  
  public String getType() {
    return myType;
  }
}