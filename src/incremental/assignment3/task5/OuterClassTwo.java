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
    // the above was done as described in the question. This resulted in an error because InnerClassOne was non-static
    // to make it work we have to make InnerClassOne as static inner class in OuterClassOne
    // or we our OuterClassTwo can extend OuterClassOne. In this way InnerClassOne is in scope for InnerClassTwo

//}

public class OuterClassTwo extends OuterClassOne{
    public class InnerClassTwo extends InnerClassOne{
        InnerClassTwo(String message){
            super(message);
        }
    }
}