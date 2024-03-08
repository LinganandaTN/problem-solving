class Stringbuffer_cap{
    public static void main(String[] args){
        StringBuffer s1 = new StringBuffer();
        System.out.println(s1.capacity());
        s1.ensurecapacity();
        System.out.println(s1.capacity());
    }
}