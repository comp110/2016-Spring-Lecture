package comp110.lecture26a;

public class OurArrayListDemo {

  public static void main(String[] args) {

    OurArrayList items = new OurArrayList();
    items.add(1.0);
    items.add(2.0);
    items.add(4.0);
    items.add(8.0);

    for (int i = 0; i < items.size(); i++) {
      System.out.println(items.get(i));
    }

  }

}
