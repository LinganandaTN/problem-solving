class strings{
    public static void main(String[] args){
        String s= new String("hello");
        System.out.println(s);
        
        String previousS = s; // Store the previous value of s
        s="HH";
        System.out.println(s);
        
        String s1 = new String("hey");
        System.out.println(s1);
        
        String previousS1 = s1; // Store the previous value of s1
        s1= s;
        System.out.println(s1);
        
        // Now you can access the previous values using previousS and previousS1
        System.out.println("Previous s: " + previousS);
        System.out.println("Previous s1: " + previousS1);
        
    }
}