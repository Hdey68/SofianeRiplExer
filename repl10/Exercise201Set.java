package com.sofiane.repl10;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Exercise201Set {
    /*
    Create a Set collection in which you want to preserve an order of inserted String Objects.
Add the below values
null
Sohil
Diego
Alijon
Asel
Sumair

Print values 1 by 1 using loop and Iterator
null
Sohil
Diego
Alijon
Asel
Sumair
null
Sohil
Diego
Alijon
Asel
Sumair
     */
    public static void main (String[] args) {
        Set<String> names = new LinkedHashSet<> ( );
        names.add ( "null" );
        names.add ( "Sohil" );
        names.add ( "Diego" );
        names.add ( "Alijon" );
        names.add ( "Asel" );
        names.add ( "Sumair" );
        for (String value : names) {
            System.out.println ( value );
        }
            Iterator value1 = names.iterator ( );
            while (value1.hasNext ( )) {
                System.out.println ( value1.next ( ) );
            }
        }
    }//////////////////////////////////////////////////done/////////////////////////
