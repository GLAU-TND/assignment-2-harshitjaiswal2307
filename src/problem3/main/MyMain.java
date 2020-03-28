/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;


public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue obj = new MyPriorityQueue();
        obj.insert("harshit",1);
        obj.insert("sparsh",4);
        obj.insert("siddharth",3);
        obj.insert("kavya",2);
        obj.insert("sameksha",5);
        obj.display();
    }
}
