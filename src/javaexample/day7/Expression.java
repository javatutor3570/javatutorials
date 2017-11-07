package javaexample.day7;

// evaluates to value may be integer, double, boolean
// integer expression int a = 4 + 5 + 6 - 6 => 9
// airthmetic operation +, -, *, /, % ( modulus gives reminder only valid for integer )
// 5%2 = 1, 5/2 = 2, 5.0/2 = 2.5
// double expression double b = 3.14*4*4=?
// boolean => true or false
// logical operations &&(and), || ( or ),
// > ( greather than ), < (less than), == (equals), >=, <=, !=(not equal to)
// if(rains || wetfeild ){game is cancelled}
// if(uscitizen && more than 5 years of us experience in software ) { valid for application to specified job}

// ternary expression => gives value (?:)
// percentage >= 80 ? "Distinction":"unknown"
// Membertype==Member.Platinum ? totalPrice - 0.5*totalPrice : totalPrice;

// if else:
// Syntax if(logical condition){ //body }else{//body}
// if(Membertype==Member.Platinum){
//    price = 0.5*totalPrice;
// }else{
//   price = totalPrice;
//}

import java.time.LocalDate;
import java.time.Month;

// if(condition){body}
// else if(condition){body}
// else if(condition){body}
// else if(condition){body}
//......
//else{}
public class Expression {
    public static void main(String... args){
        int a = 4 + 5 - 20;
        System.out.println(a);

        double b = 3.0+4.5-9.0;
        System.out.println(b);

        boolean bulTrue = 10 > 4;
        System.out.println(bulTrue);
        boolean bulFalse = 2 > 15;
        System.out.println(bulFalse);

        boolean andTrue = 10 > 4 && 15 > 11;
        System.out.println(andTrue);

        boolean andFalse = 7 > 1 && 2 > 15;
        System.out.println(andFalse);

        boolean orTrue = 7 > 15 || 3 > 1;
        System.out.println(orTrue);

        boolean orFalse = 5 > 10 || 2 > 14;
        System.out.println(orFalse);

        System.out.println(isEven1(3));
        System.out.println(isEven1(6));

        System.out.println(getDivision(81));
        System.out.println(getDivision(95));
        System.out.println(getDivision(70));
        System.out.println(getDivision(55));
        System.out.println(getDivision(42));
        System.out.println(getDivision(28));

        System.out.println(getPriceForMonth(100,MemberType.PLATINUM, Month.DECEMBER));
        System.out.println(getPriceForMonth(100,MemberType.PLATINUM, Month.NOVEMBER));

    }

    // here p is percentage
    public static Division getDivision(double p){
        if(p >= 80){
            if(p > 90){
                System.out.print("Well done boy!!!!!!   ");
            }
            return Division.DISTINCTION;
        }else if(p >= 60){
            return Division.FIRSTDIVISION;
        }else if(p >= 50){
            return Division.SECONDDIVISION;
        }else if(p >= 32){
            return Division.THIRDDIVISION;
        }else{
            return Division.FAIL;
        }
    }

    public static boolean isEven(final int no){
        boolean isRemZero = no%2 == 0 ? true : false;
        return isRemZero;
    }

    public static boolean isEven1(final int no){
        if(no % 2 == 0){
            return true;
        }
        return false;
    }

    // Platinum member 10% discount
    // Diamond member 5% discount
    // General member 1% discount
    // month december
    public static double getPriceForMonth(double p, MemberType m, Month month){
        if(Month.DECEMBER != month){
            return p;
        }
        if(m == MemberType.PLATINUM){
            return 0.9*p;
        }else if(m == MemberType.DIAMOND){
            return 0.95*p;
        }else{
            return 0.99*p;
        }

    }

}
