import java.util.Scanner;

class RDrest{
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println("::WELCOME TO RD RESTAURANT::");
        System.out.println("1. for break fast");
        System.out.println("2. for lunch");
        System.out.println("3. for dinner");
      
        System.out.println("select any one : ");
        int select=n.nextInt();
    

        switch(select){
            case 1:
            {
                System.out.println("1. coffe Rs. 80");
                System.out.println("2. Tea Rs. 50");
                
                
                break;
            }

            case 2:{
                System.out.println("1. pulao naan Rs. 250");
                System.out.println("2. Rice Rs. 100");
        
                break;
            }

            case 3:
            {
                System.out.println("1. TACOS Rs. 450");
                System.out.println("2. kadai paneer Rs. 400");
            }

        }
        int price=0;
        System.out.println("Enter choice : ");
        int select1 =n.nextInt();
       if(select==1){
        if(select1==1){
        price=80;
        }
        else{
          price=50;
        }
       }

       if(select==2){
        if(select1==1){
        price=250;
        }
        else{
            price=100;
        }
       }

       if(select==3){
        if(select1==1){
         price=450;
        }
        else{
            price=400;
        }
       }
        int dis=20;
        int Gst=(price*15)/100;
       int total=price-dis+Gst;
       System.out.println("Your Total Bill : "+ total);
       System.out.println("Thank You");

        n.close();
    }

}