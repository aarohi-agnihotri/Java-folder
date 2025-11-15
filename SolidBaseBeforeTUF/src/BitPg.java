import java.util.*;
class BitPg{
    static void getBit(){
        int n = 5;
        int pos = 2;
        int bitMask = 1 << pos;

        if((bitMask & n) == 0)
        System.out.println("bit was 0");
        else
        System.out.println("bit was 1");
        return;
    }

    static void setBit(){
        int n = 5;
        int pos = 2;
        int bitMask = 1 << pos;

        if((bitMask & n) == 0)
        System.out.println("bit was 0");
        else
        System.out.println("bit was 1");
        return;
    }

    static void clearBit(){
        
    }
    static void updateBit(){
        
    }
    
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        // System.out.println("Enter number of rows:");
        // int r=sc.nextInt();
        // getBit();
        setBit();
        // clearBit();
        // updateBit();
        }
    }