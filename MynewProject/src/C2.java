class C2 {


        int i,j,Sum;
        C2(){
            i = 1;
            j = 5;
            Sum = i + j;
            System.out.println( " i= " +i);
            System.out.println( " j= " +j);
            System.out.println( " Sum= " +Sum);
        }
        void display(){
            System.out.println(i+ " " +j+ " " +Sum);
        }
        public static void main(String[] args){

            C2 obj = new C2();
            obj.display();

        }

}

