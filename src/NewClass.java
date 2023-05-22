/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class NewClass {
   int id;
   String name;
   
   public static void main(String[]args){
       NewClass c=new NewClass();
//       c.methodName();
       System.out.println(c.methodName());
       
   }
   public String methodName(){
       id=1;
       name="Saman";
       return name;
   }
}
