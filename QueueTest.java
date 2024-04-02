import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
       
public static String one(){  //OUTPUT 5
       
        Queue<String> one = new LinkedList<String>();
        for (int i=1; i<=6; i++)
        {
                one.offer("" + i);
        }
       
        while (one.size()>1) {
                one.offer(one.poll());
                one.poll();
        }
        return one.peek();
               
       
}
       
public static Queue<String> two(){   //OUTPUT [4, 5, 6]
Queue<String> two = new LinkedList<String>();
for (int i=1; i<=6; i++){
        two.offer("" + i);
}
for(int i=1; i<=two.size(); i++)
        two.poll();
return two;
       

}
       
public static int three(){     // Exception in thread "main" java.lang.ArithmeticException: / by zero
Queue<Integer> three = new LinkedList<Integer>();
for (int i=1; i<=6; i++){
        three.offer( i);
}

int sum =0;
while (three.size() > 0)
        sum += three.poll();
return sum/three.size();
       

}
//words is unchanged at the end of the method
public static boolean isAlphabetical(Queue<String> words) {
        Queue<String> temp = new LinkedList<String>();
        boolean inOrder = true;
        int count = words.size();
        for (int i = 1; i< count; i++) {
                String top = words.poll();
                if (top.compareTo(words.peek()) > 0)
                        inOrder =false;
                temp.offer(top);
        }
        temp.offer(words.poll());
        words = temp;
        System.out.println(words);
        return inOrder;
}

//words is unchanged at the end of the method
public static boolean isAlphabetical2(Queue<String> words) {
        boolean inOrder = true;
        int count = words.size();
        for (int i = 1; i<= count; i++) {
                String top = words.poll();
                if (top.compareTo(words.peek()) > 0)
                        inOrder =false;
                words.offer(top);
        }
        //words.offer(words.poll());
        System.out.println(words);
        return inOrder;
}

public static Queue<String> reverse(Queue<String> x)
{
	ArrayList<String> temp = new ArrayList<String>();
	
	while(x.size() > 0)
	{
		temp.add(x.poll());
	}
	while(!(temp.isEmpty()))
	{
		x.offer(temp.remove(temp.size()-1));
		
	}
	
	return x;
}

public static boolean search(Queue<String>x,String lookFor)
{
	if(x.contains(lookFor))
	{
		return true;
	}
	return false;
}

        public static void main(String[] args) {
                // TODO Auto-generated method stub
               
                System.out.println(one());
                System.out.println(two());
                //System.out.println(three());
               
                Queue<String> one = new LinkedList<String>();
                 one.offer("A");
                 one.offer("B");
                 one.offer("C");
                 one.offer("D");
                 one.offer("A");
                 System.out.println(reverse(one));
                 System.out.println(search(one, "E"));
                 //System.out.println(isAlphabetical2(one));
        }

}