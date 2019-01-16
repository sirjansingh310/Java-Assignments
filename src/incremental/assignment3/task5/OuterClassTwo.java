package incremental.assignment3.task5;

//public class OuterClassTwo {
    /*
    public class InnerClassTwo extends OuterClassOne.InnerClassOne {
        public InnerClassTwo(String message) {
            super(message);
        }
    }
    // ERROR
    */
    // the above was done as described in the question. This resulted in an error because InnerClassOne was out of scope.
    // To fix this either we can make InnerClassOne a static class or our OuterClassTwo can extend OuterClassOne as described
    // in the next section.



//}

public class OuterClassTwo extends OuterClassOne{
    public class InnerClassTwo extends InnerClassOne{
        InnerClassTwo(String message){
            super(message);
        }
    }
}
