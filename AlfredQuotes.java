import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // No necesitas codificar aquí, este es un método de ejemplo
        return "Hola, encantado de verte. ¿Cómo estás?";
    }
    
    public String guestGreeting(String name) {
        return String.format("Hola, %s encantado de verte. ¿Cómo estás?",name);
    }
    
    public String dateAnnouncement() {
        java.util.Date fecha=new java.util.Date(); 
        return String.format("Actualmente es %s",fecha);
    }
    
    public String respondBeforeAlexis (String conversation) {
        if (conversation.indexOf("Alexis")>-1) {
            return ("De inmediato, señor");            
        } 
        else if (conversation.indexOf("Alfred")>-1){
            return ("A su servicio");  
        } else {
            return ("Bien. Y con eso, me retiraré");             
        }
    }
    
}