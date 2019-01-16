package incremental.assignment3.task5;

public class OuterClassOne {
    public class InnerClassOne{
        private String message;
        InnerClassOne(String message){
            this.message = message;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
}
