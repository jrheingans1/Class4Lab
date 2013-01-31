/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author jrheingans1
 */
public class Banking {
    private double salary = 50000.00;

    public double getSalary() {
        return salary;
    }   
    
    public static void main(String[] args) {
      Banking one = new Banking();
      double sal = one.getSalary();
      System.out.println(sal);        
      BankingPayments two = new BankingPayments();
      double pay = two.getPayments();
      System.out.println(sal/pay);
    }
}
