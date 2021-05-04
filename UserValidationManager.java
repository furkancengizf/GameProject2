package GameProject;

public class UserValidationManager implements UserValidationService{

 @Override
 public boolean validation(Gamer gamer){
   if(gamer.getFirstName()length()>2 
   && gamer.getnationalityid()length()>10
   && gamer.getborth()length()<1995){
     System.out.printlyn("Kişi Onaylandı")
     return true;
   }
   else{
     System.out.printlyn("Kişi Onaylanamadı")
     return false;
     }
    
  }

}
