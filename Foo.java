package javaPattern;

public class Foo {

		    String name;
		    
		    String address;

		    public Foo() {
		        
		    }
		    
		    private static final Foo GOOD_NIGHT= new Foo();
		    
		    public Foo(String name) {
		        this.name = name;
		    }
		    
		    
		    public static Foo withName(String name) {
		       return new Foo(name);
		    }
		    
		    public static Foo getFoo() { // static을 붙이면 메서드로 사용
		        return GOOD_NIGHT; // 위에 static final 로 해놓은 GooD_NIGHT 을 리턴하면 Foo 객체가 리턴됨! 
		    }
		    
		    
		    public static void main(String[] args){
		        Foo foo = new Foo("name");
		        Foo foo1 = Foo.getFoo();
		        Foo foo2 = Foo.withName("withName");
		        System.out.println("foo2 = " + foo2);
		        System.out.println("foo1 = " + foo1);
		        System.out.println("foo = " + foo);
		        
		        
		    }
		

	}


