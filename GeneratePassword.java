import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class GeneratePassword {



    public static void main(String[] args) {

        System.out.println("/******************Generate password*****************/");
        
        System.out.println("Fisrt generated password: "+generatePassword());
        System.out.println("Second generated password: "+generatePassword());
        System.out.println("Third generated password: "+generatePassword());
        
    }
    

    public static  String generateAChar( String str){
        Random r = new Random();

        return String.valueOf(str.charAt(r.nextInt(str.length())));
        
        
    }

    public static  String generateTwoChars( String str){
    
       return  generateAChar(str)+generateAChar(str);
        
       
    }
    public static String generatePassword(){
        String uppers="ABCDEFGHIJKLMNOPQRSTUVWXYZ",digit="0123456789";

        String pwd=generateTwoChars(uppers)+generateTwoChars(uppers.toLowerCase())+
        generateTwoChars(digit);
        return shuffle(pwd);
    }
    

       
    
    public static String shuffle(String input){
        //create a list of characters from the input string
        List<Character> characters = new ArrayList<>();
        for(char c:input.toCharArray()){
            characters.add(c);
        }
        //create a new string builder object with the same lenght as the input string
        StringBuilder output = new StringBuilder(input.length());

        while(characters.size()!=0){

            //generate random index from 0 to the size of 'characters' minus -1
            int randPicker = (int)(Math.random()*characters.size());

        /*characters.remove(randPicker): that call removes and removes the char 
        at the index randPicker from the characters list 'characters'  */
            //push the char removed from the characters list to the back of output
            output.append(characters.remove(randPicker));
        }
        //return the string value of output
        return output.toString();

    }
    

}
