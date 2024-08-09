/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd.coursework;
import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author PROJET NDAGANO
 */
public class BOSTONRUNNER {
    public static void main(String[] args){
         String [] names={"Elena","Thomas","Hamilton","Suzie",
           "Phil","Matt","Alex","Emma","John","James","Jane","Emily","Daniel","Neda","Aaron","Kate"};
       int [] time={341,273,278,329,445,402,388,275,243,334,412,393,299,343,317,265};
    // i just declared another arrays which will store values from the original one
    Integer[]timebox=Arrays.stream(time).boxed().toArray(Integer[]::new);
    String[] namecopy=names.clone();
   
    for(int k=0;k<time.length;k++)// this is actually our outerloop and in this case wwe need it so that the code run
    for(int i=0;i<time.length -1;i++)// this is our inner loop which is verifying if the elements are in good order
    {if(timebox[i]<timebox[i+1])//if that statement is true do what follows=>
    {int temptime=timebox[i];
    timebox[i]=timebox[i+1];
    timebox[i+1]=temptime;
    String temptname=namecopy[i];
    namecopy[i]=namecopy[i+1];
    namecopy[i+1]=temptname;
    }}
    int fastestrun=timebox[0];// the arrays always start as 0 according to order
    String fastestrunName=namecopy[0];
    System.out.println("the fastest runner is: "+ fastestrunName+" - "+fastestrun+" minutes .");
    int second=timebox[1];
    String name=namecopy[1];
    
    System.out.println(" the second runner is: "+ name+" - "+ second+" minutes ");
    
    
    }}