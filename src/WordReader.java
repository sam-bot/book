/*
* WordReader.java - A program to read words from a file
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class WordReader {
public static void main( String[] args ) {
// will store the words read from the file
List<String> wordList = new ArrayList<String>();

BufferedReader br = null;
try {
// attempt to open the words file
br = new BufferedReader( new FileReader( "oncall.txt" ) );

String word;

// loop and read a line from the file 
while( ( word = br.readLine() ) != null )
// add the read word to the wordList
wordList.add( word );
} catch( IOException e ) {
e.printStackTrace();
} finally {
try {
// attempt the close the file
br.close();
} catch( IOException ex ) {
ex.printStackTrace();
}
}

// initialize a new string array equal to the size of the wordList
String[] words = new String[ wordList.size() ];

// call the wordList's toArray method to and transfer items from
// wordList to our string array words
wordList.toArray( words );

// loop and display each word from the words array
for( int i = 0; i < words.length; i++ )
System.out.println( words[ i ] );
}
}