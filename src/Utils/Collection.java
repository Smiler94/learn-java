package Utils;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class Collection {
    public static void main(String args[]) {
        Collection col = new Collection();
        col.runList();
    }

    private void runList() {

        List<String> list = new ArrayList<String>();

        list.add("Hello");
        list.add("World");
        list.add("HAHAHAHHA");

        // 第一种遍历，使用 foreach
        for (String s : list) {
            System.out.println(s);
        }

        // 第二种遍历，把链表变为数组相关
        String[] strArray = new String[list.size()];
        list.toArray(strArray);
        for(int i = 0;i<strArray.length;i++) {
            System.out.println(strArray[i]);
        }

        // 第三种遍历，使用迭代器
        Iterator<String>  ite = list.iterator();
        while(ite.hasNext()) { // 判断下一个元素之后有值
            System.out.println(ite.next());
        }
    }
}
