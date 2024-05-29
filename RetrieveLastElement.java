import java.util.LinkedList;

public class RetrieveLastElement 
{
    public static void main(String[] args) 
{
                LinkedList<Integer> linkedList = new LinkedList<>();

               linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);

                if (!linkedList.isEmpty())
 {
            int lastElement = linkedList.getLast();
            System.out.println("Last element of the linked list: " + lastElement);
        } else {
            System.out.println("Linked list is empty.");
        }
    }
}
