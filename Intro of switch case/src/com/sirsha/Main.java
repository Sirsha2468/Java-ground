package com.sirsha;
import java.util.* ;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in ) ;
        System.out.println( "Enter a option between 1, 2, 3: " ) ;
        int button = sc.nextInt() ;


       /* if( button == 1)
        {
            System.out.println( "Hello" ) ;
        }

        else if( button == 2 )
        {
            System.out.println( "Namaste" ) ;
        }

        else if( button == 3 )
        {
            System.out.println( "Bonjour" ) ; // hello in French
        }
        else

        {
            System.out.println( "Invalid option" ) ;
        } */
        switch( button )
        {

            case 1: System.out.println( "Hello" ) ;
                break ;

            case 2: System.out.println( "Namaste" ) ;
                break ;

            case 3: System.out.println( "Bonjour" )  ;
                break ;

                default: System.out.println( "Invalid option!" ) ;
        }


    }
}
