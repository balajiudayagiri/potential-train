package com.innerclasses;

public interface AnonymousInnerClassA{
    public void methodA();
}

class AnonymousInnerClassB{
	AnonymousInnerClassA a = new AnonymousInnerClassA() {
        public void methodA() {
            System.out.println("AnonymousInnerClassB:- anonymous methodA");
        }
    };
}
