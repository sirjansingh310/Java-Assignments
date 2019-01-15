package incremental.assignment1.sirjan.assignment.singleton;

public class User {
    private String username;

    public static User createUser(String user){
        /*
        This throws an error because non-static variables can't be used inside static context.
        The non-static members are object specific and can't be set using static methods as it leads to ambiguity.Static variables are
        shared by all the objects so we can use them in static methods.
        */
//        this.username = username;
//        return this;

        return new User();
    }
    public void printUserDetails(){
        System.out.println(username);
    }
}
