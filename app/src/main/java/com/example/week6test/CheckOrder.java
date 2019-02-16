package com.example.week6test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CheckOrder {


    public static void main (String[] args){
        String orderString =  "[{}]{{{)";

        if(checkTheOrder(orderString)){
            System.out.println("Your Structure was correct!");
        }
        else {
            System.out.println("Your Structure was bad, REDO!");
        }
    }


    static boolean checkTheOrder(String testString){
        Stack<Character> characterStack = new Stack<>();

        String legend = "{[(";

        char paren = '(';
        char bracket = '[';
        char curlyBrace = '{';
        for(int i=0; i<testString.length();i++){
            if(legend.indexOf(testString.charAt(i)) != -1) {
                characterStack.push(testString.charAt(i));
            }else{
                if(!characterStack.isEmpty()) {
                    if (characterStack.peek() == paren && testString.charAt(i) == ')') {

                        System.out.println(characterStack.pop() + " good )");
                    } else if (characterStack.peek() == bracket && testString.charAt(i) == ']') {

                        System.out.println(characterStack.pop() + " good ]");
                    } else if (characterStack.peek() == curlyBrace && testString.charAt(i) == '}') {

                        System.out.println(characterStack.pop() + " good }");
                    } else {
                        return false;
                    }
                }else {
                    return false;
                }
                }
        }
        if(characterStack.isEmpty()){
            return true;
        }
        else {
            return false;
        }
    }
}
