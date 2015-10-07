import javax.swing.JOptionPane;

public class AuthV1{

   public enum AccountType{Administrator, Student, Staff, Guest}

   public static void main(String args[]){
   
   
   String User[] = {"mike", "john", "emily", "joe", "jose", "null"};
   
   String Pass[] = {"m1234", "j7534", "em532", "joe667", "jm234", "null"};
   
   String jobs[] = {"Guest","Student", "Admin","Guest","Staff"};
   
   
      AccountType[] choices = {AccountType.Administrator, AccountType.Student, AccountType.Staff, AccountType.Guest};
  
   
   AccountType input = (AccountType) JOptionPane.showInputDialog(null,"Select your account type.", "Account Type", 
                     
                                                                              JOptionPane.INFORMATION_MESSAGE, null, choices, choices[3]);   
   String inputString = input.toString();
   
 String inputUser = "";
 
 String inputPass = "";
   
 String authUser = "";
 
 int passIndex = 0;
 
 int userIndex = 0;
   
 
  
  inputUser = JOptionPane.showInputDialog("Please enter username: ");
  
  int i = 0;
  
  int y = 0;
  
  int x = 0;
   
  int z = 0;
  
  int q = 0;
  
    

   a:while(i<User.length){

   if(inputUser.equals(User[i])){

   if(inputString.equals(jobs[i])){
   
   System.out.println("Username found");
   
    userIndex = i;
    
    inputPass = JOptionPane.showInputDialog("Please enter password");
    
    b: while(z<Pass.length){
    
    if(inputPass.equals(Pass[z])){
    
    
    passIndex = z;
   
    }
    
    if(inputPass.equals(Pass[i])){
    
    switch(input){
    case Administrator:
    System.out.println("Welcome Admin! You can update and read files");
    break;
    case Student:
    System.out.println("Welcome Student, you can only read files");
    break;
    case Staff:
    System.out.println("Welcome Staff, you can update, read, add, delete files");
    break;
    case Guest:
    System.out.println("Welcome Guest!");
    break;
    
    }
   
     System.exit(0);
    
    
    
    
      }
      
      else{
      
      z++;
     
     
       if(Pass[z].equals("null") && q<3){
      
      
      System.out.println("Invalid password");
      
      q++;
      
      z = 0;
      
      inputPass = JOptionPane.showInputDialog("Please enter password again");
      
     }
      
     else if(q==3){
     
     System.out.println("Contact admin");
     System.exit(0);
     
     
     
     }
     
      
      }
    
    }
    
    }
    else{
    
    System.out.println("Username does not fit job");
    break;
    }
    }
    else{
    
    i++;
    
    if(User[i].equals("null") && y<3){
     
     System.out.println("Invalid username");
     
     y++;
     
    i = 0;
    
    
    inputUser = JOptionPane.showInputDialog("Please enter username again: ");
    }
    else if(y==3) {
    
    System.out.println("Contact admin");
    break a;
    
    
    }
    
    
    
    
    
   

   
   }//while
   
   
  
   
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
   }

}

}