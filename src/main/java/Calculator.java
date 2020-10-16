


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leon
 */
public class Calculator {
    
    //This is the constructor
    public Calculator() {
        
    }
    public int addTwoNumbers(int num1,int num2) {
        int answer1;
        answer1 = num1 + num2;
        return answer1;
    }
    public int subtractTwoNumbers(int num1,int num2) {
        int answer2;
        answer2 = num1 - num2;
        return answer2;
    }
    public int mutiplyTwoNumbers(int num1,int num2) {
        int answer3;
        answer3 = num1 * num2;
        return answer3;

    }
    public int integerDivideTwoNumbers(int num1,int num2) {
        int answer4;
        answer4 = num1 / num2;
        return answer4;
    }
    public int floatDivideTwoNumbers(int num1,int num2) {
       int answer5;
       answer5 = num1 % num2;
       return answer5;
    }
    public int squareOneNumbers(int num) {
       int answer6;
       answer6 = num * num;
       return answer6;
    }
    public int cubeOneNumbers(int num) {
       int answer7;
       answer7 = num * num * num;
       return answer7;
    }
    public String Even(int num) {
        String answer8;
        if (num % 2 == 0) {
            answer8 = "The number is even.";
        } else {
            answer8 = "The number is not even.";
        }
        return answer8;
    } 
    public boolean checkPrime(int num) {
        
        boolean flag = true;
    
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        
        }
        return flag;
    }    
    
}
                


    
    

   
    
    
    



    
    
    

    
            

