/*1. Create a class say Rectangle in such a way that the comparision between the two instance of rectangle is done on the basis of there values i.e.

        Rectangle rec1 = new Rectangle(12, 13);
        Rectangle rec2 = new Rectangle(12, 13);

        if(rec1.equal(rec2)){
        sysout("Objects are equal")
        }else{
        sysout("Objects are not equal")
        }

        expected output is "Objects are equal"

        Hint: Override the equal method*/

package Session_10;

public class Rectangle_equal {
    int len, bred;



    public Rectangle_equal(){
        this.bred=10;
        this.len=20;
    }

    public Rectangle_equal(int l,int b){
        this.bred=b;
        this.len=l;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;

        } else if (!(obj instanceof Rectangle_equal)) {
            return false;

        }

        Rectangle_equal rec = (Rectangle_equal) obj;

        return Integer.compare(len, rec.len) == 0 && Integer.compare(bred, rec.bred) == 0;
    }


        public static void main (String[]args){

        Rectangle_equal r1 = new Rectangle_equal(20,10);
        Rectangle_equal r2 = new Rectangle_equal(20,10);

        if (r1.equals(r2)){
            System.out.println("Equals");
        }
        else
            System.out.println("Not equal");
            
            
         
            System.out.println("\n\nCustom Exception part=============================================================\n");
                try {
                    int area = 3;
                    throw new CalculateAreaNotSupported(area);
                }
                catch (CalculateAreaNotSupported ex){
                    System.out.println("inside CalculateAreaNotSupported catch");
                }
                catch (Exception ex){
                    System.out.println("Inside generic catch");
                }

        }
    }
