class Test{
    float sum = 0.0f;
    float add(float... a){
        for(float i :a){
            sum += i;

        }
    return sum;
    }
}

class varargs{
    public static void main(String[] args){
        Test t= new Test();
        System.out.println(t.add());
        System.out.println(t.add(1.1f,2.1f));
        System.out.println(t.add(1.1f));
        System.out.println(t.add(10,20));
        System.out.println(t.add(10,20.1f));
        System.out.println(t.add(10,20.1f));
        
    }
}