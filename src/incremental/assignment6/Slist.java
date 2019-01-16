package incremental.assignment6;

public class Slist<T> {
  public SlistIterator<T> slistIterator = new SlistIterator<>();

  @Override
  public String toString(){
      String output = "";
     while(slistIterator.hasNext()){
         output += slistIterator.next().toString();
         output += "->";
     }
     if(output.equals(""))
         return "List is empty";
     return output;

  }
  public SlistIterator<T> iterator(){
      return slistIterator;
  }
}