package west2task2;

public class IngredientSortOutException extends java.lang.RuntimeException {
	 String message;
     public IngredientSortOutException(String error){
         message = error;
     }

     public String getMessage(){
         return message;
     }

}
