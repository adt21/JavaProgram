package Oops;

public class TernaryOperator {

	public static void main(String args[]){
        int n1 = 10, n2 = 5, res;
        System.out.println("First Number : " + n1);
        System.out.println("First Number : " + n2);
        res = (n1 > n2) ? (n1 + n2):(n1-n2);
        System.out.println("Result = " + res);
    }
//if (n1>n2) this statement will be true then (n1+n2) will be done otherwise (n1-n2) will be activate
//if (n1>n2) will false
}
 