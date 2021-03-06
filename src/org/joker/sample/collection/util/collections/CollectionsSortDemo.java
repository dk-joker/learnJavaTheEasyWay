package org.joker.sample.collection.util.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * a demo for Collections sort Utils test
 *
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-04-16 13:55
 */
public class CollectionsSortDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-1);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(-5);
        arrayList.add(7);
        arrayList.add(4);
        arrayList.add(-9);
        arrayList.add(-7);
        System.out.println("原始数组:");
        System.out.println(arrayList);
        // void reverse(List list)：反转
        Collections.reverse(arrayList);
        System.out.println("Collections.reverse(arraylist):");
        System.out.println(arrayList);

        Collections.rotate(arrayList, 4);
        System.out.println("Collections.rotate(arraylist, 4):");
        System.out.println(arrayList);

        // void sort(List list),按自然排序的升序排序
        Collections.sort(arrayList);
        System.out.println("Collections.sort(arraylist):");
        System.out.println(arrayList);

        // void shuffle(List list),随机排序
//        Collections.shuffle(arraylist);
//        System.out.println("Collections.shuffle(arraylist):");
//        System.out.println(arraylist);

        // void swap(List list, int i , int j),交换两个索引位置的元素
        Collections.swap(arrayList, 2, 5);
        System.out.println("Collections.swap(arraylist, 2, 5):");
        System.out.println(arrayList);

        // 定制排序的用法
        Collections.sort(arrayList, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println("定制排序后：");
        System.out.println(arrayList);
    }
}

