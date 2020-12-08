// Do not modify the code below except for replacing the "..."!  Don't
// add anything (including "public" declarations), don't remove
// anything (including "public" declarations). Don't wrap it in a
// package, don't make it an inner class of some other class.  If
// your IDE suggsts to change anything below, ignore your IDE. You are
// welcome to add new classes! Please put them into separate files.

import java.util.List;

class LexicalException extends Exception {
    public String msg;
    public LexicalException ( String _msg ) { msg = _msg; } } 

class Task1Exception extends Exception {
    public String msg;
    public Task1Exception ( String _msg ) { msg = _msg; } }

interface Lexer {
    public List<Token> lex ( String input ) throws LexicalException, Task1Exception; }

class Task1 {
 //    public static Lexer create () {
        
 //            Your code here
        

	// } 
}



