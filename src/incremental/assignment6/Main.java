package incremental.assignment6;

public class Main {
    public static void main(String[] args) {
        Slist<Integer> slist = new Slist<>();
        SlistIterator<Integer> slistIterator = slist.iterator();
        slistIterator.add(10);
        slistIterator.add(20);
        slistIterator.add(30);
        slistIterator.add(40);
        slistIterator.add(50);
        System.out.println(slist.toString());
        slistIterator.remove(30);
        System.out.println(slist.toString());
        Slist<String> slist1 = new Slist<>();
        SlistIterator<String> slistIterator1 = slist1.iterator();
        slistIterator1.add("abc");
        slistIterator1.add("def");
        slistIterator1.add("ghi");
        System.out.println(slist1.toString());
        slistIterator1.remove("def");
        System.out.println(slist1.toString());

    }

}
