


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leon
 */
public class Main {
    public static void main(String[] args) {
        //Initialize an instance of calculator class
        Calculator myCalc = new Calculator();
        
        
        int answer1 = myCalc.addTwoNumbers(2,2);
        System.out.println(answer1);
       
        int answer2 = myCalc.subtractTwoNumbers(2, 2);  //subtract 2 numbers
        System.out.println(answer2);

        int answer3 = myCalc.mutiplyTwoNumbers(2, 2);  //mutiply 2 numbers
        System.out.println(answer3);
        
        int answer4 = myCalc.integerDivideTwoNumbers(2, 2);  //integer divide 
        System.out.println(answer4);
        
        int answer5 = myCalc.floatDivideTwoNumbers(2, 2);  //float divide
        System.out.println(answer5);
        
        int answer6 = myCalc.squareOneNumbers( 2 );  //square one number
        System.out.println(answer6);
        
        int answer7 = myCalc.cubeOneNumbers( 2 );  //cube one number
        System.out.println(answer7);
        
        String answer8 = myCalc.Even(2 );  //even
        System.out.println(answer8);

        boolean flag = myCalc.checkPrime(17);
        System.out.println(flag);
 
    }
}
