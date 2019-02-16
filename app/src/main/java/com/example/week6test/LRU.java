package com.example.week6test;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Iterator;

public class LRU {
    static Deque<Integer> deque;
    static HashSet<Integer> map;
    static int cacheSize;

    LRU(int n)
    {
        deque=new LinkedList<>();
        map=new HashSet<>();
        cacheSize=n;
    }

    public void refer(int nextValue)
    {
        if(!map.contains(nextValue))
        {
            if(deque.size()==cacheSize)
            {
                int last=deque.removeLast();
                map.remove(last);
            }
        }
        else
        {
            deque.remove(nextValue);
        }
        deque.push(nextValue);
        map.add(nextValue);
    }

    public void display()
    {
        Iterator<Integer> itr = deque.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
    }


    public static void main(String[] args) {
        LRU winterCache=new LRU(10);
        winterCache.refer(1);
        winterCache.refer(7);
        winterCache.refer(3);
        winterCache.refer(1);
        winterCache.refer(4);
        winterCache.refer(2);
        winterCache.display();
    }
}