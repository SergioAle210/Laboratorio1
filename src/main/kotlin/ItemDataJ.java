public class ItemDataJ {
    Object originalValue;

     public ItemDataJ(Object originalValue) {
        this.originalValue = originalValue;
    }

    public String getType(){
        if(originalValue instanceof String){
            return "cadena";
        } else if (originalValue instanceof Integer) {
            return "entero";
        } else if (originalValue instanceof Boolean) {
            return "booleano";
        } else {
            return null;
        }
    }

    public String getInfo(){
        if(originalValue instanceof String){
            return "L" + ((String) originalValue).length();
        } else if(originalValue instanceof Integer){
            if(((int) originalValue) % 10 == 0){
                return "M10";
            } else if (((int) originalValue) % 5 == 0) {
                return "M5";
            } else if (((int) originalValue) % 2 == 0) {
                return "M2";
            } else {
                return null;
            }
        } else if (originalValue instanceof Boolean) {
            if ((boolean) originalValue){
                return "Verdadero";
            } else {
                return "Falso";
            }
        } else {
            return null;
        }
    }
}
