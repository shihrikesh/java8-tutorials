package sequencedCollection;

import java.util.ArrayList;
import java.util.List;

public class SeqListSample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Alfa","Beta","charlie","decka","echo","foxtrot"));
        List<String> rList = list.reversed();

        System.out.println(list);
        System.out.println(rList);

        list.set(2,"hrishi");

        System.out.println(list);
        System.out.println(rList);

        rList.set(1,"shikha");

        System.out.println(list);
        System.out.println(rList);

    }
}
