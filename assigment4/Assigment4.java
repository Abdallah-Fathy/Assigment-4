/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment4;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Assigment4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MemberFactory memberFactory = new MemberFactory();
        System.out.println("Enter The member name: ");
        String memberName = input.nextLine();
        System.out.println("Enter the Salary: ");;
        double salary = input.nextDouble();
        System.out.println("Enter The Years of Work: ");
        int year = input.nextInt();
        Staff member =memberFactory.desiredMember(memberName);
        member.setSalary(salary);
        member.setYearsOfWork(year);
        System.out.println("year details for " + memberName + "is: ");
        System.out.println("Salry is: " + member.getSalary());
        System.out.println("Years of Works is: " + member.getYearOfWork() );
        
                
        
    }
    
}
