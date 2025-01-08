//package SortingandSearching;
import java.util.*;
import java.io.*;
public class RestaurantsCustomers {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        List<Event> events=new ArrayList<>();
        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int arrival=Integer.parseInt(st.nextToken());
            int departure=Integer.parseInt(st.nextToken());
            events.add(new Event(arrival,1));
            events.add(new Event(departure,-1));
        }
        events.sort((e1,e2)->e1.time==e2.time ? e1.type-e2.type:e1.time-e2.time);
        int currentCustumors=0;
        int maxCustomers=0;
        for(Event event:events){
            currentCustumors+=event.type;
            maxCustomers=Math.max(maxCustomers,currentCustumors);
        }
        System.out.println(maxCustomers);
    }

    static class Event{
        int time;
        int type;
        Event(int time,int type){
            this.time=time;
            this.type=type;
        }
    }
}
