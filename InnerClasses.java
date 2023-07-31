class OuterCls{
    int x=10;

    class InnerCls{
        int y=5;
        public int myInnerMethod(){
            return x; //inner class can acceses attributes and methods of outer class
        }
    }

    /*
    // private inner class cannot be accesed from outside class
    private class PrivateInnerCls{
        int p=15;
    }
    */

    // static inner class can be accesed without creating an object
    static class StaticInnerCls{
        int s=20;
    }
}


class InnerClasses {
    public static void main(String[] args) {
        OuterCls myOuter =new OuterCls();
        OuterCls.InnerCls myInner=myOuter.new InnerCls();
        System.out.println("Outer -> Inner ====> " + (myInner.y+myOuter.x));
        System.out.println("Outer -> Inner -> Outer attribute x ====> " + (myInner.myInnerMethod()));

        /* 
        OuterCls.PrivateInnerCls myPrivateInner=myOuter.new PrivateInnerCls();
        System.out.println("Outer -> PrivateInner ====> " + (myPrivateInner.p+myOuter.x));
        */

        OuterCls.StaticInnerCls myStaticInner=new OuterCls.StaticInnerCls();
        System.out.println("Outer -> Static Inner ====> " + (myStaticInner.s+myOuter.x));
        
    }
}
