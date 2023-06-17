package jkcodebase.jwt.example.exception;

public class UserNotFoundException extends Exception {
      public UserNotFoundException(){
       super("user with this username not found..");
   }

    public UserNotFoundException(String msg){
        super(msg);
    }
}
