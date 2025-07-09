/*
public class Assignment4{
    public static void main(String[]args){
        int x=151;
        if(x%5==0)
            System.out.println("divisible");
        else
            System.out.println("Not divisible");

    }
}



public class Assignment4 {
    public static void main(String[]args){
        int x=341;
        if(x%2==0)
            System.out.println("even");
        else
            System.out.println("Odd");
    }
}



public class Assignment4 {
    public static void main(String[]args){
        int x=199;
        if((x&1)==0)
            System.out.println("even");
        else
            System.out.println("Odd");
    }
}

public class Assignment4 {
    public static void main(String[]args){
        int x=80;
        int y=384;
        System.out.println(x>y?x+" is greater than "+y+" is greater than"+x);
    }
}


public class Assignment4 {
    public static void main(String[]args){
        int x=00;
        if(x>0)
            System.out.println("positive");
        else if(x<0)
            System.out.println("negative");
        else
            System.out.println("Zero");
    }
}



public class Assignment4 {
    public static void main(String[]args){
        int x=80;
        int y=384;
        int z=394;
        if(x>y && x>z)
            System.out.println(x);
        else if(y>x && y>z)
            System.out.println(y);
        else
            System.out.println(z);

    }
}



public class Assignment4 {
    public static void main(String[]args){
        char x='$';
        if((x>='A' && x<'Z')||(x>='a'&&x<='z'))
            System.out.println("alphabet");
        else
            System.out.println("Special character");

    }
}


public class Assignment4 {
    public static void main(String[]args){
        int x=1990;
        if(x/100>0 && x/100<9)
            System.out.println("three digit number");
        else
            System.out.println("not a three digit number");
    }
}


public class Assignment4 {
    public static void main(String[]args){
        int x=1991;
        if(x%5==0 || x%7==0)
            System.out.println("divisible");
        else
            System.out.println("not divisible");
    }
}


public class Assignment4 {
    public static void main(String[]args){
        int x=-4;
        System.out.println(x>0?"positive":"non positive");
    }
}



public class Assignment4 {
    public static void main(String[]args){
        int age=59;
        char g='F';
        if(g=='M'){
            if(age>50)
                System.out.println("Rs 10");
            else
                System.out.println("Rs 20");
        }
        else
        {
            if(age<30)
                System.out.println("Rs 50");
            else
                System.out.println("Rs 40");
        }
    }
}


public class Assignment4 {
    public static void main(String[]args)
    {
        int marks=34;
        char grade='A';
        if(marks>=90 && marks<=100)
            System.out.println("Grade: A");
        else if (marks>=80 && marks<=89) {
            System.out.println("Grade: B");
        }
        else if (marks>=70 && marks<=79) {
            System.out.println("Grade: C");
        }
        else if (marks>=60 && marks<=69) {
            System.out.println("Grade: D");
        }
        else if (marks>=50 && marks<=59) {
            System.out.println("grade: E");
        }
        else
            System.out.println("F");
    }
}


 *

public class Assignment4 {
    public static void main(String[]args)
    {
        int i=1;
        while (i<=5)
        {
            System.out.println(i+") MySirG");
            i++;
        }
    }
}


public class Assignment4 {
    public static void main(String[]args)
    {
        int i=10;
        while (i>0)
        {
            System.out.print(i+" ");
            i--;
        }
    }
}



public class Assignment4 {
    public static void main(String[]args)
    {
        int i,j;
        for(i=1;i<=4;i++)
            for(j=6;j>1;j--)
            {
                System.out.print(i+j+" ");
            }

    }
}


 *

public class Assignment4 {
    public static void main(String[]args)
    {

    first:
        for(int i=1;i<=10;i++)
        {
            for(int j=1;j<=5;j++) {
                if (i + j > 8)
                    break first;
                System.out.println(i + j);
            }
        }
    }
}

*/
public class Assignment4 {
    public static void main(String[]args){
        int x=80;
        int y=384;
        System.out.println(x>y?x+" is greater than "+y:y+" is greater than "+x);
    }
}
